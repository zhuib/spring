package com.sise.dao.impl;

import com.sise.dao.HibernateDao;
import com.sise.util.HibernateUtil;
import com.sise.vo.Person;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * Author: zhuib
 * Date: 2020/10/22 22:17
 * Describe:
 */
public class HibernateDaoImpl implements HibernateDao {

    @Override
    public void addPerson(Person person) {
        Session session = HibernateUtil.getSession();
        Transaction tx = session.beginTransaction();
        try{
            session.persist(person);
            tx.commit();
        }catch (Exception e) {
            if (null != tx) {
                tx.rollback();
            }
            e.printStackTrace();
        }
    }

    @Override
    public void updatePerson(Person person) {
        Session session = HibernateUtil.getSession();
        Transaction tx = session.beginTransaction();
        try {
            session.update(person);
            tx.commit();
        }catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        }
    }

    @Override
    public void deletePerson(Person person) {
        Session session = HibernateUtil.getSession();
        Transaction tx = session.beginTransaction();
        try {
            session.delete(person);
            tx.commit();
        }catch (Exception e) {
            if (null != tx) {
                tx.rollback();
            }
            e.printStackTrace();
        }
    }

    @Override
    public Person getPersonById(Integer id) {
        Session session = HibernateUtil.getSession();
        Transaction tx = session.beginTransaction();
        Person person = session.get(Person.class, id);
        tx.commit();
        return person;
    }
}
