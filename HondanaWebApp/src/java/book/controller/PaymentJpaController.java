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
import book.model.Orders;
import book.model.Payment;
import book.model.Shipping;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.transaction.UserTransaction;

/**
 *
 * @author GIFS
 */
public class PaymentJpaController implements Serializable {

    public PaymentJpaController(UserTransaction utx, EntityManagerFactory emf) {
        this.utx = utx;
        this.emf = emf;
    }
    private UserTransaction utx = null;
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Payment payment) throws IllegalOrphanException, PreexistingEntityException, RollbackFailureException, Exception {
        List<String> illegalOrphanMessages = null;
        Orders ordernoOrphanCheck = payment.getOrderno();
        if (ordernoOrphanCheck != null) {
            Payment oldPaymentOfOrderno = ordernoOrphanCheck.getPayment();
            if (oldPaymentOfOrderno != null) {
                if (illegalOrphanMessages == null) {
                    illegalOrphanMessages = new ArrayList<String>();
                }
                illegalOrphanMessages.add("The Orders " + ordernoOrphanCheck + " already has an item of type Payment whose orderno column cannot be null. Please make another selection for the orderno field.");
            }
        }
        Shipping shipnoOrphanCheck = payment.getShipno();
        if (shipnoOrphanCheck != null) {
            Payment oldPaymentOfShipno = shipnoOrphanCheck.getPayment();
            if (oldPaymentOfShipno != null) {
                if (illegalOrphanMessages == null) {
                    illegalOrphanMessages = new ArrayList<String>();
                }
                illegalOrphanMessages.add("The Shipping " + shipnoOrphanCheck + " already has an item of type Payment whose shipno column cannot be null. Please make another selection for the shipno field.");
            }
        }
        if (illegalOrphanMessages != null) {
            throw new IllegalOrphanException(illegalOrphanMessages);
        }
        EntityManager em = null;
        try {
            utx.begin();
            em = getEntityManager();
            Orders orderno = payment.getOrderno();
            if (orderno != null) {
                orderno = em.getReference(orderno.getClass(), orderno.getOrderno());
                payment.setOrderno(orderno);
            }
            Shipping shipno = payment.getShipno();
            if (shipno != null) {
                shipno = em.getReference(shipno.getClass(), shipno.getShipno());
                payment.setShipno(shipno);
            }
            Orders orders = payment.getOrders();
            if (orders != null) {
                orders = em.getReference(orders.getClass(), orders.getOrderno());
                payment.setOrders(orders);
            }
            Shipping shipping = payment.getShipping();
            if (shipping != null) {
                shipping = em.getReference(shipping.getClass(), shipping.getShipno());
                payment.setShipping(shipping);
            }
            em.persist(payment);
            if (orderno != null) {
                orderno.setPayment(payment);
                orderno = em.merge(orderno);
            }
            if (shipno != null) {
                shipno.setPayment(payment);
                shipno = em.merge(shipno);
            }
            if (orders != null) {
                Payment oldPaymentnoOfOrders = orders.getPaymentno();
                if (oldPaymentnoOfOrders != null) {
                    oldPaymentnoOfOrders.setOrders(null);
                    oldPaymentnoOfOrders = em.merge(oldPaymentnoOfOrders);
                }
                orders.setPaymentno(payment);
                orders = em.merge(orders);
            }
            if (shipping != null) {
                Payment oldPaymentnoOfShipping = shipping.getPaymentno();
                if (oldPaymentnoOfShipping != null) {
                    oldPaymentnoOfShipping.setShipping(null);
                    oldPaymentnoOfShipping = em.merge(oldPaymentnoOfShipping);
                }
                shipping.setPaymentno(payment);
                shipping = em.merge(shipping);
            }
            utx.commit();
        } catch (Exception ex) {
            try {
                utx.rollback();
            } catch (Exception re) {
                throw new RollbackFailureException("An error occurred attempting to roll back the transaction.", re);
            }
            if (findPayment(payment.getPaymentno()) != null) {
                throw new PreexistingEntityException("Payment " + payment + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Payment payment) throws IllegalOrphanException, NonexistentEntityException, RollbackFailureException, Exception {
        EntityManager em = null;
        try {
            utx.begin();
            em = getEntityManager();
            Payment persistentPayment = em.find(Payment.class, payment.getPaymentno());
            Orders ordernoOld = persistentPayment.getOrderno();
            Orders ordernoNew = payment.getOrderno();
            Shipping shipnoOld = persistentPayment.getShipno();
            Shipping shipnoNew = payment.getShipno();
            Orders ordersOld = persistentPayment.getOrders();
            Orders ordersNew = payment.getOrders();
            Shipping shippingOld = persistentPayment.getShipping();
            Shipping shippingNew = payment.getShipping();
            List<String> illegalOrphanMessages = null;
            if (ordernoNew != null && !ordernoNew.equals(ordernoOld)) {
                Payment oldPaymentOfOrderno = ordernoNew.getPayment();
                if (oldPaymentOfOrderno != null) {
                    if (illegalOrphanMessages == null) {
                        illegalOrphanMessages = new ArrayList<String>();
                    }
                    illegalOrphanMessages.add("The Orders " + ordernoNew + " already has an item of type Payment whose orderno column cannot be null. Please make another selection for the orderno field.");
                }
            }
            if (shipnoNew != null && !shipnoNew.equals(shipnoOld)) {
                Payment oldPaymentOfShipno = shipnoNew.getPayment();
                if (oldPaymentOfShipno != null) {
                    if (illegalOrphanMessages == null) {
                        illegalOrphanMessages = new ArrayList<String>();
                    }
                    illegalOrphanMessages.add("The Shipping " + shipnoNew + " already has an item of type Payment whose shipno column cannot be null. Please make another selection for the shipno field.");
                }
            }
            if (ordersOld != null && !ordersOld.equals(ordersNew)) {
                if (illegalOrphanMessages == null) {
                    illegalOrphanMessages = new ArrayList<String>();
                }
                illegalOrphanMessages.add("You must retain Orders " + ordersOld + " since its paymentno field is not nullable.");
            }
            if (shippingOld != null && !shippingOld.equals(shippingNew)) {
                if (illegalOrphanMessages == null) {
                    illegalOrphanMessages = new ArrayList<String>();
                }
                illegalOrphanMessages.add("You must retain Shipping " + shippingOld + " since its paymentno field is not nullable.");
            }
            if (illegalOrphanMessages != null) {
                throw new IllegalOrphanException(illegalOrphanMessages);
            }
            if (ordernoNew != null) {
                ordernoNew = em.getReference(ordernoNew.getClass(), ordernoNew.getOrderno());
                payment.setOrderno(ordernoNew);
            }
            if (shipnoNew != null) {
                shipnoNew = em.getReference(shipnoNew.getClass(), shipnoNew.getShipno());
                payment.setShipno(shipnoNew);
            }
            if (ordersNew != null) {
                ordersNew = em.getReference(ordersNew.getClass(), ordersNew.getOrderno());
                payment.setOrders(ordersNew);
            }
            if (shippingNew != null) {
                shippingNew = em.getReference(shippingNew.getClass(), shippingNew.getShipno());
                payment.setShipping(shippingNew);
            }
            payment = em.merge(payment);
            if (ordernoOld != null && !ordernoOld.equals(ordernoNew)) {
                ordernoOld.setPayment(null);
                ordernoOld = em.merge(ordernoOld);
            }
            if (ordernoNew != null && !ordernoNew.equals(ordernoOld)) {
                ordernoNew.setPayment(payment);
                ordernoNew = em.merge(ordernoNew);
            }
            if (shipnoOld != null && !shipnoOld.equals(shipnoNew)) {
                shipnoOld.setPayment(null);
                shipnoOld = em.merge(shipnoOld);
            }
            if (shipnoNew != null && !shipnoNew.equals(shipnoOld)) {
                shipnoNew.setPayment(payment);
                shipnoNew = em.merge(shipnoNew);
            }
            if (ordersNew != null && !ordersNew.equals(ordersOld)) {
                Payment oldPaymentnoOfOrders = ordersNew.getPaymentno();
                if (oldPaymentnoOfOrders != null) {
                    oldPaymentnoOfOrders.setOrders(null);
                    oldPaymentnoOfOrders = em.merge(oldPaymentnoOfOrders);
                }
                ordersNew.setPaymentno(payment);
                ordersNew = em.merge(ordersNew);
            }
            if (shippingNew != null && !shippingNew.equals(shippingOld)) {
                Payment oldPaymentnoOfShipping = shippingNew.getPaymentno();
                if (oldPaymentnoOfShipping != null) {
                    oldPaymentnoOfShipping.setShipping(null);
                    oldPaymentnoOfShipping = em.merge(oldPaymentnoOfShipping);
                }
                shippingNew.setPaymentno(payment);
                shippingNew = em.merge(shippingNew);
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
                Integer id = payment.getPaymentno();
                if (findPayment(id) == null) {
                    throw new NonexistentEntityException("The payment with id " + id + " no longer exists.");
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
            Payment payment;
            try {
                payment = em.getReference(Payment.class, id);
                payment.getPaymentno();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The payment with id " + id + " no longer exists.", enfe);
            }
            List<String> illegalOrphanMessages = null;
            Orders ordersOrphanCheck = payment.getOrders();
            if (ordersOrphanCheck != null) {
                if (illegalOrphanMessages == null) {
                    illegalOrphanMessages = new ArrayList<String>();
                }
                illegalOrphanMessages.add("This Payment (" + payment + ") cannot be destroyed since the Orders " + ordersOrphanCheck + " in its orders field has a non-nullable paymentno field.");
            }
            Shipping shippingOrphanCheck = payment.getShipping();
            if (shippingOrphanCheck != null) {
                if (illegalOrphanMessages == null) {
                    illegalOrphanMessages = new ArrayList<String>();
                }
                illegalOrphanMessages.add("This Payment (" + payment + ") cannot be destroyed since the Shipping " + shippingOrphanCheck + " in its shipping field has a non-nullable paymentno field.");
            }
            if (illegalOrphanMessages != null) {
                throw new IllegalOrphanException(illegalOrphanMessages);
            }
            Orders orderno = payment.getOrderno();
            if (orderno != null) {
                orderno.setPayment(null);
                orderno = em.merge(orderno);
            }
            Shipping shipno = payment.getShipno();
            if (shipno != null) {
                shipno.setPayment(null);
                shipno = em.merge(shipno);
            }
            em.remove(payment);
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

    public List<Payment> findPaymentEntities() {
        return findPaymentEntities(true, -1, -1);
    }

    public List<Payment> findPaymentEntities(int maxResults, int firstResult) {
        return findPaymentEntities(false, maxResults, firstResult);
    }

    private List<Payment> findPaymentEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Payment.class));
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

    public Payment findPayment(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Payment.class, id);
        } finally {
            em.close();
        }
    }

    public int getPaymentCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Payment> rt = cq.from(Payment.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
