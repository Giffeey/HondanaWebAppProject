/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book.controller;

import book.controller.exceptions.IllegalOrphanException;
import book.controller.exceptions.NonexistentEntityException;
import book.controller.exceptions.PreexistingEntityException;
import book.controller.exceptions.RollbackFailureException;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import book.model.Payment;
import book.model.Customer;
import book.model.Shipping;
import book.model.Orderdetail;
import book.model.Orders;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.transaction.UserTransaction;

/**
 *
 * @author GIFS
 */
public class OrdersJpaController implements Serializable {

    public OrdersJpaController(UserTransaction utx, EntityManagerFactory emf) {
        this.utx = utx;
        this.emf = emf;
    }
    private UserTransaction utx = null;
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Orders orders) throws IllegalOrphanException, PreexistingEntityException, RollbackFailureException, Exception {
        if (orders.getOrderdetailList() == null) {
            orders.setOrderdetailList(new ArrayList<Orderdetail>());
        }
        List<String> illegalOrphanMessages = null;
        Payment paymentnoOrphanCheck = orders.getPaymentno();
        if (paymentnoOrphanCheck != null) {
            Orders oldOrdernoOfPaymentno = paymentnoOrphanCheck.getOrderno();
            if (oldOrdernoOfPaymentno != null) {
                if (illegalOrphanMessages == null) {
                    illegalOrphanMessages = new ArrayList<String>();
                }
                illegalOrphanMessages.add("The Payment " + paymentnoOrphanCheck + " already has an item of type Orders whose paymentno column cannot be null. Please make another selection for the paymentno field.");
            }
        }
        Shipping shipnoOrphanCheck = orders.getShipno();
        if (shipnoOrphanCheck != null) {
            Orders oldOrdersOfShipno = shipnoOrphanCheck.getOrders();
            if (oldOrdersOfShipno != null) {
                if (illegalOrphanMessages == null) {
                    illegalOrphanMessages = new ArrayList<String>();
                }
                illegalOrphanMessages.add("The Shipping " + shipnoOrphanCheck + " already has an item of type Orders whose shipno column cannot be null. Please make another selection for the shipno field.");
            }
        }
        if (illegalOrphanMessages != null) {
            throw new IllegalOrphanException(illegalOrphanMessages);
        }
        EntityManager em = null;
        try {
            utx.begin();
            em = getEntityManager();
            Payment payment = orders.getPayment();
            if (payment != null) {
                payment = em.getReference(payment.getClass(), payment.getPaymentno());
                orders.setPayment(payment);
            }
            Customer customerid = orders.getCustomerid();
            if (customerid != null) {
                customerid = em.getReference(customerid.getClass(), customerid.getCustomerid());
                orders.setCustomerid(customerid);
            }
            Payment paymentno = orders.getPaymentno();
            if (paymentno != null) {
                paymentno = em.getReference(paymentno.getClass(), paymentno.getPaymentno());
                orders.setPaymentno(paymentno);
            }
            Shipping shipno = orders.getShipno();
            if (shipno != null) {
                shipno = em.getReference(shipno.getClass(), shipno.getShipno());
                orders.setShipno(shipno);
            }
            Shipping shipping = orders.getShipping();
            if (shipping != null) {
                shipping = em.getReference(shipping.getClass(), shipping.getShipno());
                orders.setShipping(shipping);
            }
            List<Orderdetail> attachedOrderdetailList = new ArrayList<Orderdetail>();
            for (Orderdetail orderdetailListOrderdetailToAttach : orders.getOrderdetailList()) {
                orderdetailListOrderdetailToAttach = em.getReference(orderdetailListOrderdetailToAttach.getClass(), orderdetailListOrderdetailToAttach.getOrderdetailPK());
                attachedOrderdetailList.add(orderdetailListOrderdetailToAttach);
            }
            orders.setOrderdetailList(attachedOrderdetailList);
            em.persist(orders);
            if (payment != null) {
                Orders oldOrdernoOfPayment = payment.getOrderno();
                if (oldOrdernoOfPayment != null) {
                    oldOrdernoOfPayment.setPayment(null);
                    oldOrdernoOfPayment = em.merge(oldOrdernoOfPayment);
                }
                payment.setOrderno(orders);
                payment = em.merge(payment);
            }
            if (customerid != null) {
                customerid.getOrdersList().add(orders);
                customerid = em.merge(customerid);
            }
            if (paymentno != null) {
                paymentno.setOrderno(orders);
                paymentno = em.merge(paymentno);
            }
            if (shipno != null) {
                shipno.setOrders(orders);
                shipno = em.merge(shipno);
            }
            if (shipping != null) {
                Orders oldOrdernoOfShipping = shipping.getOrderno();
                if (oldOrdernoOfShipping != null) {
                    oldOrdernoOfShipping.setShipping(null);
                    oldOrdernoOfShipping = em.merge(oldOrdernoOfShipping);
                }
                shipping.setOrderno(orders);
                shipping = em.merge(shipping);
            }
            for (Orderdetail orderdetailListOrderdetail : orders.getOrderdetailList()) {
                Orders oldOrdersOfOrderdetailListOrderdetail = orderdetailListOrderdetail.getOrders();
                orderdetailListOrderdetail.setOrders(orders);
                orderdetailListOrderdetail = em.merge(orderdetailListOrderdetail);
                if (oldOrdersOfOrderdetailListOrderdetail != null) {
                    oldOrdersOfOrderdetailListOrderdetail.getOrderdetailList().remove(orderdetailListOrderdetail);
                    oldOrdersOfOrderdetailListOrderdetail = em.merge(oldOrdersOfOrderdetailListOrderdetail);
                }
            }
            utx.commit();
        } catch (Exception ex) {
            try {
                utx.rollback();
            } catch (Exception re) {
                throw new RollbackFailureException("An error occurred attempting to roll back the transaction.", re);
            }
            if (findOrders(orders.getOrderno()) != null) {
                throw new PreexistingEntityException("Orders " + orders + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Orders orders) throws IllegalOrphanException, NonexistentEntityException, RollbackFailureException, Exception {
        EntityManager em = null;
        try {
            utx.begin();
            em = getEntityManager();
            Orders persistentOrders = em.find(Orders.class, orders.getOrderno());
            Payment paymentOld = persistentOrders.getPayment();
            Payment paymentNew = orders.getPayment();
            Customer customeridOld = persistentOrders.getCustomerid();
            Customer customeridNew = orders.getCustomerid();
            Payment paymentnoOld = persistentOrders.getPaymentno();
            Payment paymentnoNew = orders.getPaymentno();
            Shipping shipnoOld = persistentOrders.getShipno();
            Shipping shipnoNew = orders.getShipno();
            Shipping shippingOld = persistentOrders.getShipping();
            Shipping shippingNew = orders.getShipping();
            List<Orderdetail> orderdetailListOld = persistentOrders.getOrderdetailList();
            List<Orderdetail> orderdetailListNew = orders.getOrderdetailList();
            List<String> illegalOrphanMessages = null;
            if (paymentOld != null && !paymentOld.equals(paymentNew)) {
                if (illegalOrphanMessages == null) {
                    illegalOrphanMessages = new ArrayList<String>();
                }
                illegalOrphanMessages.add("You must retain Payment " + paymentOld + " since its orderno field is not nullable.");
            }
            if (paymentnoOld != null && !paymentnoOld.equals(paymentnoNew)) {
                if (illegalOrphanMessages == null) {
                    illegalOrphanMessages = new ArrayList<String>();
                }
                illegalOrphanMessages.add("You must retain Payment " + paymentnoOld + " since its orderno field is not nullable.");
            }
            if (paymentnoNew != null && !paymentnoNew.equals(paymentnoOld)) {
                Orders oldOrdernoOfPaymentno = paymentnoNew.getOrderno();
                if (oldOrdernoOfPaymentno != null) {
                    if (illegalOrphanMessages == null) {
                        illegalOrphanMessages = new ArrayList<String>();
                    }
                    illegalOrphanMessages.add("The Payment " + paymentnoNew + " already has an item of type Orders whose paymentno column cannot be null. Please make another selection for the paymentno field.");
                }
            }
            if (shipnoNew != null && !shipnoNew.equals(shipnoOld)) {
                Orders oldOrdersOfShipno = shipnoNew.getOrders();
                if (oldOrdersOfShipno != null) {
                    if (illegalOrphanMessages == null) {
                        illegalOrphanMessages = new ArrayList<String>();
                    }
                    illegalOrphanMessages.add("The Shipping " + shipnoNew + " already has an item of type Orders whose shipno column cannot be null. Please make another selection for the shipno field.");
                }
            }
            if (shippingOld != null && !shippingOld.equals(shippingNew)) {
                if (illegalOrphanMessages == null) {
                    illegalOrphanMessages = new ArrayList<String>();
                }
                illegalOrphanMessages.add("You must retain Shipping " + shippingOld + " since its orderno field is not nullable.");
            }
            for (Orderdetail orderdetailListOldOrderdetail : orderdetailListOld) {
                if (!orderdetailListNew.contains(orderdetailListOldOrderdetail)) {
                    if (illegalOrphanMessages == null) {
                        illegalOrphanMessages = new ArrayList<String>();
                    }
                    illegalOrphanMessages.add("You must retain Orderdetail " + orderdetailListOldOrderdetail + " since its orders field is not nullable.");
                }
            }
            if (illegalOrphanMessages != null) {
                throw new IllegalOrphanException(illegalOrphanMessages);
            }
            if (paymentNew != null) {
                paymentNew = em.getReference(paymentNew.getClass(), paymentNew.getPaymentno());
                orders.setPayment(paymentNew);
            }
            if (customeridNew != null) {
                customeridNew = em.getReference(customeridNew.getClass(), customeridNew.getCustomerid());
                orders.setCustomerid(customeridNew);
            }
            if (paymentnoNew != null) {
                paymentnoNew = em.getReference(paymentnoNew.getClass(), paymentnoNew.getPaymentno());
                orders.setPaymentno(paymentnoNew);
            }
            if (shipnoNew != null) {
                shipnoNew = em.getReference(shipnoNew.getClass(), shipnoNew.getShipno());
                orders.setShipno(shipnoNew);
            }
            if (shippingNew != null) {
                shippingNew = em.getReference(shippingNew.getClass(), shippingNew.getShipno());
                orders.setShipping(shippingNew);
            }
            List<Orderdetail> attachedOrderdetailListNew = new ArrayList<Orderdetail>();
            for (Orderdetail orderdetailListNewOrderdetailToAttach : orderdetailListNew) {
                orderdetailListNewOrderdetailToAttach = em.getReference(orderdetailListNewOrderdetailToAttach.getClass(), orderdetailListNewOrderdetailToAttach.getOrderdetailPK());
                attachedOrderdetailListNew.add(orderdetailListNewOrderdetailToAttach);
            }
            orderdetailListNew = attachedOrderdetailListNew;
            orders.setOrderdetailList(orderdetailListNew);
            orders = em.merge(orders);
            if (paymentNew != null && !paymentNew.equals(paymentOld)) {
                Orders oldOrdernoOfPayment = paymentNew.getOrderno();
                if (oldOrdernoOfPayment != null) {
                    oldOrdernoOfPayment.setPayment(null);
                    oldOrdernoOfPayment = em.merge(oldOrdernoOfPayment);
                }
                paymentNew.setOrderno(orders);
                paymentNew = em.merge(paymentNew);
            }
            if (customeridOld != null && !customeridOld.equals(customeridNew)) {
                customeridOld.getOrdersList().remove(orders);
                customeridOld = em.merge(customeridOld);
            }
            if (customeridNew != null && !customeridNew.equals(customeridOld)) {
                customeridNew.getOrdersList().add(orders);
                customeridNew = em.merge(customeridNew);
            }
            if (paymentnoNew != null && !paymentnoNew.equals(paymentnoOld)) {
                paymentnoNew.setOrderno(orders);
                paymentnoNew = em.merge(paymentnoNew);
            }
            if (shipnoOld != null && !shipnoOld.equals(shipnoNew)) {
                shipnoOld.setOrders(null);
                shipnoOld = em.merge(shipnoOld);
            }
            if (shipnoNew != null && !shipnoNew.equals(shipnoOld)) {
                shipnoNew.setOrders(orders);
                shipnoNew = em.merge(shipnoNew);
            }
            if (shippingNew != null && !shippingNew.equals(shippingOld)) {
                Orders oldOrdernoOfShipping = shippingNew.getOrderno();
                if (oldOrdernoOfShipping != null) {
                    oldOrdernoOfShipping.setShipping(null);
                    oldOrdernoOfShipping = em.merge(oldOrdernoOfShipping);
                }
                shippingNew.setOrderno(orders);
                shippingNew = em.merge(shippingNew);
            }
            for (Orderdetail orderdetailListNewOrderdetail : orderdetailListNew) {
                if (!orderdetailListOld.contains(orderdetailListNewOrderdetail)) {
                    Orders oldOrdersOfOrderdetailListNewOrderdetail = orderdetailListNewOrderdetail.getOrders();
                    orderdetailListNewOrderdetail.setOrders(orders);
                    orderdetailListNewOrderdetail = em.merge(orderdetailListNewOrderdetail);
                    if (oldOrdersOfOrderdetailListNewOrderdetail != null && !oldOrdersOfOrderdetailListNewOrderdetail.equals(orders)) {
                        oldOrdersOfOrderdetailListNewOrderdetail.getOrderdetailList().remove(orderdetailListNewOrderdetail);
                        oldOrdersOfOrderdetailListNewOrderdetail = em.merge(oldOrdersOfOrderdetailListNewOrderdetail);
                    }
                }
            }
            utx.commit();
        } catch (Exception ex) {
            try {
                utx.rollback();
            } catch (Exception re) {
                throw new RollbackFailureException("An error occurred attempting to roll back the transaction.", re);
            }
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = orders.getOrderno();
                if (findOrders(id) == null) {
                    throw new NonexistentEntityException("The orders with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Integer id) throws IllegalOrphanException, NonexistentEntityException, RollbackFailureException, Exception {
        EntityManager em = null;
        try {
            utx.begin();
            em = getEntityManager();
            Orders orders;
            try {
                orders = em.getReference(Orders.class, id);
                orders.getOrderno();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The orders with id " + id + " no longer exists.", enfe);
            }
            List<String> illegalOrphanMessages = null;
            Payment paymentOrphanCheck = orders.getPayment();
            if (paymentOrphanCheck != null) {
                if (illegalOrphanMessages == null) {
                    illegalOrphanMessages = new ArrayList<String>();
                }
                illegalOrphanMessages.add("This Orders (" + orders + ") cannot be destroyed since the Payment " + paymentOrphanCheck + " in its payment field has a non-nullable orderno field.");
            }
            Payment paymentnoOrphanCheck = orders.getPaymentno();
            if (paymentnoOrphanCheck != null) {
                if (illegalOrphanMessages == null) {
                    illegalOrphanMessages = new ArrayList<String>();
                }
                illegalOrphanMessages.add("This Orders (" + orders + ") cannot be destroyed since the Payment " + paymentnoOrphanCheck + " in its paymentno field has a non-nullable orderno field.");
            }
            Shipping shippingOrphanCheck = orders.getShipping();
            if (shippingOrphanCheck != null) {
                if (illegalOrphanMessages == null) {
                    illegalOrphanMessages = new ArrayList<String>();
                }
                illegalOrphanMessages.add("This Orders (" + orders + ") cannot be destroyed since the Shipping " + shippingOrphanCheck + " in its shipping field has a non-nullable orderno field.");
            }
            List<Orderdetail> orderdetailListOrphanCheck = orders.getOrderdetailList();
            for (Orderdetail orderdetailListOrphanCheckOrderdetail : orderdetailListOrphanCheck) {
                if (illegalOrphanMessages == null) {
                    illegalOrphanMessages = new ArrayList<String>();
                }
                illegalOrphanMessages.add("This Orders (" + orders + ") cannot be destroyed since the Orderdetail " + orderdetailListOrphanCheckOrderdetail + " in its orderdetailList field has a non-nullable orders field.");
            }
            if (illegalOrphanMessages != null) {
                throw new IllegalOrphanException(illegalOrphanMessages);
            }
            Customer customerid = orders.getCustomerid();
            if (customerid != null) {
                customerid.getOrdersList().remove(orders);
                customerid = em.merge(customerid);
            }
            Shipping shipno = orders.getShipno();
            if (shipno != null) {
                shipno.setOrders(null);
                shipno = em.merge(shipno);
            }
            em.remove(orders);
            utx.commit();
        } catch (Exception ex) {
            try {
                utx.rollback();
            } catch (Exception re) {
                throw new RollbackFailureException("An error occurred attempting to roll back the transaction.", re);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Orders> findOrdersEntities() {
        return findOrdersEntities(true, -1, -1);
    }

    public List<Orders> findOrdersEntities(int maxResults, int firstResult) {
        return findOrdersEntities(false, maxResults, firstResult);
    }

    private List<Orders> findOrdersEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Orders.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Orders findOrders(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Orders.class, id);
        } finally {
            em.close();
        }
    }

    public int getOrdersCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Orders> rt = cq.from(Orders.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
