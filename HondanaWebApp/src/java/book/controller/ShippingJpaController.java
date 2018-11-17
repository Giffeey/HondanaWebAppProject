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
import book.model.Orders;
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
public class ShippingJpaController implements Serializable {

    public ShippingJpaController(UserTransaction utx, EntityManagerFactory emf) {
        this.utx = utx;
        this.emf = emf;
    }
    private UserTransaction utx = null;
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Shipping shipping) throws IllegalOrphanException, PreexistingEntityException, RollbackFailureException, Exception {
        List<String> illegalOrphanMessages = null;
        Orders ordernoOrphanCheck = shipping.getOrderno();
        if (ordernoOrphanCheck != null) {
            Shipping oldShipnoOfOrderno = ordernoOrphanCheck.getShipno();
            if (oldShipnoOfOrderno != null) {
                if (illegalOrphanMessages == null) {
                    illegalOrphanMessages = new ArrayList<String>();
                }
                illegalOrphanMessages.add("The Orders " + ordernoOrphanCheck + " already has an item of type Shipping whose orderno column cannot be null. Please make another selection for the orderno field.");
            }
        }
        Payment paymentnoOrphanCheck = shipping.getPaymentno();
        if (paymentnoOrphanCheck != null) {
            Shipping oldShipnoOfPaymentno = paymentnoOrphanCheck.getShipno();
            if (oldShipnoOfPaymentno != null) {
                if (illegalOrphanMessages == null) {
                    illegalOrphanMessages = new ArrayList<String>();
                }
                illegalOrphanMessages.add("The Payment " + paymentnoOrphanCheck + " already has an item of type Shipping whose paymentno column cannot be null. Please make another selection for the paymentno field.");
            }
        }
        if (illegalOrphanMessages != null) {
            throw new IllegalOrphanException(illegalOrphanMessages);
        }
        EntityManager em = null;
        try {
            utx.begin();
            em = getEntityManager();
            Payment payment = shipping.getPayment();
            if (payment != null) {
                payment = em.getReference(payment.getClass(), payment.getPaymentno());
                shipping.setPayment(payment);
            }
            Orders orders = shipping.getOrders();
            if (orders != null) {
                orders = em.getReference(orders.getClass(), orders.getOrderno());
                shipping.setOrders(orders);
            }
            Orders orderno = shipping.getOrderno();
            if (orderno != null) {
                orderno = em.getReference(orderno.getClass(), orderno.getOrderno());
                shipping.setOrderno(orderno);
            }
            Payment paymentno = shipping.getPaymentno();
            if (paymentno != null) {
                paymentno = em.getReference(paymentno.getClass(), paymentno.getPaymentno());
                shipping.setPaymentno(paymentno);
            }
            em.persist(shipping);
            if (payment != null) {
                Shipping oldShipnoOfPayment = payment.getShipno();
                if (oldShipnoOfPayment != null) {
                    oldShipnoOfPayment.setPayment(null);
                    oldShipnoOfPayment = em.merge(oldShipnoOfPayment);
                }
                payment.setShipno(shipping);
                payment = em.merge(payment);
            }
            if (orders != null) {
                Shipping oldShipnoOfOrders = orders.getShipno();
                if (oldShipnoOfOrders != null) {
                    oldShipnoOfOrders.setOrders(null);
                    oldShipnoOfOrders = em.merge(oldShipnoOfOrders);
                }
                orders.setShipno(shipping);
                orders = em.merge(orders);
            }
            if (orderno != null) {
                orderno.setShipno(shipping);
                orderno = em.merge(orderno);
            }
            if (paymentno != null) {
                paymentno.setShipno(shipping);
                paymentno = em.merge(paymentno);
            }
            utx.commit();
        } catch (Exception ex) {
            try {
                utx.rollback();
            } catch (Exception re) {
                throw new RollbackFailureException("An error occurred attempting to roll back the transaction.", re);
            }
            if (findShipping(shipping.getShipno()) != null) {
                throw new PreexistingEntityException("Shipping " + shipping + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Shipping shipping) throws IllegalOrphanException, NonexistentEntityException, RollbackFailureException, Exception {
        EntityManager em = null;
        try {
            utx.begin();
            em = getEntityManager();
            Shipping persistentShipping = em.find(Shipping.class, shipping.getShipno());
            Payment paymentOld = persistentShipping.getPayment();
            Payment paymentNew = shipping.getPayment();
            Orders ordersOld = persistentShipping.getOrders();
            Orders ordersNew = shipping.getOrders();
            Orders ordernoOld = persistentShipping.getOrderno();
            Orders ordernoNew = shipping.getOrderno();
            Payment paymentnoOld = persistentShipping.getPaymentno();
            Payment paymentnoNew = shipping.getPaymentno();
            List<String> illegalOrphanMessages = null;
            if (paymentOld != null && !paymentOld.equals(paymentNew)) {
                if (illegalOrphanMessages == null) {
                    illegalOrphanMessages = new ArrayList<String>();
                }
                illegalOrphanMessages.add("You must retain Payment " + paymentOld + " since its shipno field is not nullable.");
            }
            if (ordersOld != null && !ordersOld.equals(ordersNew)) {
                if (illegalOrphanMessages == null) {
                    illegalOrphanMessages = new ArrayList<String>();
                }
                illegalOrphanMessages.add("You must retain Orders " + ordersOld + " since its shipno field is not nullable.");
            }
            if (ordernoOld != null && !ordernoOld.equals(ordernoNew)) {
                if (illegalOrphanMessages == null) {
                    illegalOrphanMessages = new ArrayList<String>();
                }
                illegalOrphanMessages.add("You must retain Orders " + ordernoOld + " since its shipno field is not nullable.");
            }
            if (ordernoNew != null && !ordernoNew.equals(ordernoOld)) {
                Shipping oldShipnoOfOrderno = ordernoNew.getShipno();
                if (oldShipnoOfOrderno != null) {
                    if (illegalOrphanMessages == null) {
                        illegalOrphanMessages = new ArrayList<String>();
                    }
                    illegalOrphanMessages.add("The Orders " + ordernoNew + " already has an item of type Shipping whose orderno column cannot be null. Please make another selection for the orderno field.");
                }
            }
            if (paymentnoOld != null && !paymentnoOld.equals(paymentnoNew)) {
                if (illegalOrphanMessages == null) {
                    illegalOrphanMessages = new ArrayList<String>();
                }
                illegalOrphanMessages.add("You must retain Payment " + paymentnoOld + " since its shipno field is not nullable.");
            }
            if (paymentnoNew != null && !paymentnoNew.equals(paymentnoOld)) {
                Shipping oldShipnoOfPaymentno = paymentnoNew.getShipno();
                if (oldShipnoOfPaymentno != null) {
                    if (illegalOrphanMessages == null) {
                        illegalOrphanMessages = new ArrayList<String>();
                    }
                    illegalOrphanMessages.add("The Payment " + paymentnoNew + " already has an item of type Shipping whose paymentno column cannot be null. Please make another selection for the paymentno field.");
                }
            }
            if (illegalOrphanMessages != null) {
                throw new IllegalOrphanException(illegalOrphanMessages);
            }
            if (paymentNew != null) {
                paymentNew = em.getReference(paymentNew.getClass(), paymentNew.getPaymentno());
                shipping.setPayment(paymentNew);
            }
            if (ordersNew != null) {
                ordersNew = em.getReference(ordersNew.getClass(), ordersNew.getOrderno());
                shipping.setOrders(ordersNew);
            }
            if (ordernoNew != null) {
                ordernoNew = em.getReference(ordernoNew.getClass(), ordernoNew.getOrderno());
                shipping.setOrderno(ordernoNew);
            }
            if (paymentnoNew != null) {
                paymentnoNew = em.getReference(paymentnoNew.getClass(), paymentnoNew.getPaymentno());
                shipping.setPaymentno(paymentnoNew);
            }
            shipping = em.merge(shipping);
            if (paymentNew != null && !paymentNew.equals(paymentOld)) {
                Shipping oldShipnoOfPayment = paymentNew.getShipno();
                if (oldShipnoOfPayment != null) {
                    oldShipnoOfPayment.setPayment(null);
                    oldShipnoOfPayment = em.merge(oldShipnoOfPayment);
                }
                paymentNew.setShipno(shipping);
                paymentNew = em.merge(paymentNew);
            }
            if (ordersNew != null && !ordersNew.equals(ordersOld)) {
                Shipping oldShipnoOfOrders = ordersNew.getShipno();
                if (oldShipnoOfOrders != null) {
                    oldShipnoOfOrders.setOrders(null);
                    oldShipnoOfOrders = em.merge(oldShipnoOfOrders);
                }
                ordersNew.setShipno(shipping);
                ordersNew = em.merge(ordersNew);
            }
            if (ordernoNew != null && !ordernoNew.equals(ordernoOld)) {
                ordernoNew.setShipno(shipping);
                ordernoNew = em.merge(ordernoNew);
            }
            if (paymentnoNew != null && !paymentnoNew.equals(paymentnoOld)) {
                paymentnoNew.setShipno(shipping);
                paymentnoNew = em.merge(paymentnoNew);
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
                Integer id = shipping.getShipno();
                if (findShipping(id) == null) {
                    throw new NonexistentEntityException("The shipping with id " + id + " no longer exists.");
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
            Shipping shipping;
            try {
                shipping = em.getReference(Shipping.class, id);
                shipping.getShipno();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The shipping with id " + id + " no longer exists.", enfe);
            }
            List<String> illegalOrphanMessages = null;
            Payment paymentOrphanCheck = shipping.getPayment();
            if (paymentOrphanCheck != null) {
                if (illegalOrphanMessages == null) {
                    illegalOrphanMessages = new ArrayList<String>();
                }
                illegalOrphanMessages.add("This Shipping (" + shipping + ") cannot be destroyed since the Payment " + paymentOrphanCheck + " in its payment field has a non-nullable shipno field.");
            }
            Orders ordersOrphanCheck = shipping.getOrders();
            if (ordersOrphanCheck != null) {
                if (illegalOrphanMessages == null) {
                    illegalOrphanMessages = new ArrayList<String>();
                }
                illegalOrphanMessages.add("This Shipping (" + shipping + ") cannot be destroyed since the Orders " + ordersOrphanCheck + " in its orders field has a non-nullable shipno field.");
            }
            Orders ordernoOrphanCheck = shipping.getOrderno();
            if (ordernoOrphanCheck != null) {
                if (illegalOrphanMessages == null) {
                    illegalOrphanMessages = new ArrayList<String>();
                }
                illegalOrphanMessages.add("This Shipping (" + shipping + ") cannot be destroyed since the Orders " + ordernoOrphanCheck + " in its orderno field has a non-nullable shipno field.");
            }
            Payment paymentnoOrphanCheck = shipping.getPaymentno();
            if (paymentnoOrphanCheck != null) {
                if (illegalOrphanMessages == null) {
                    illegalOrphanMessages = new ArrayList<String>();
                }
                illegalOrphanMessages.add("This Shipping (" + shipping + ") cannot be destroyed since the Payment " + paymentnoOrphanCheck + " in its paymentno field has a non-nullable shipno field.");
            }
            if (illegalOrphanMessages != null) {
                throw new IllegalOrphanException(illegalOrphanMessages);
            }
            em.remove(shipping);
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

    public List<Shipping> findShippingEntities() {
        return findShippingEntities(true, -1, -1);
    }

    public List<Shipping> findShippingEntities(int maxResults, int firstResult) {
        return findShippingEntities(false, maxResults, firstResult);
    }

    private List<Shipping> findShippingEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Shipping.class));
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

    public Shipping findShipping(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Shipping.class, id);
        } finally {
            em.close();
        }
    }

    public int getShippingCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Shipping> rt = cq.from(Shipping.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
