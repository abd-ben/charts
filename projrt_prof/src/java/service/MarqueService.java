/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import beans.Marque;
import beans.Marque;
import dao.IDao;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

/**
 *
 * @author root
 */
public class MarqueService implements IDao<Marque>{

    @Override
    public boolean create(Marque o) {
        
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            session.save(o);
            tx.commit();
            session.close();
            return true;
        } catch (HibernateException ex) {
            if (tx != null) {
                tx.rollback();
            }
            session.close();
            return false;
        }
    }

    @Override
    public boolean update(Marque o) {
        
         Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            session.update(o);
            tx.commit();
            session.close();
            return true;
        } catch (HibernateException ex) {
            if (tx != null) {
                tx.rollback();
            }
            session.close();
            return false;
        }
    }

    @Override
    public boolean delete(Marque o) {
        
         Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            session.delete(o);
            tx.commit();
            session.close();
            return true;
        } catch (HibernateException ex) {
            if (tx != null) {
                tx.rollback();
            }
            session.close();
            return false;
        }
    }

    @Override
    public Marque findById(int id) {
        
         Marque m = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            m = (Marque) session.get(Marque.class, id);
            tx.commit();
            session.close();
            return m;
        } catch (HibernateException ex) {
            if (tx != null) {
                tx.rollback();
            }
            session.close();
            return m;
        }
    }

    @Override
    public List<Marque> findAll() {
        
         List<Marque> Marques = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            Marques = session.createQuery("from Marque").list();
            tx.commit();
            session.close();
            return Marques;
        } catch (HibernateException ex) {
            if (tx != null) {
                tx.rollback();
            }
            session.close();
            return Marques;
        }
    }
    
    public List<Long> count() {
        
        List<Long>  Marques = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            Marques = session.createQuery("SELECT COUNT(*) FROM Marque").list();
            tx.commit();
            session.close();
            return Marques;
        } catch (HibernateException ex) {
            if (tx != null) {
                tx.rollback();
            }
            session.close();
            return Marques;
        }
    }

   
    
}
