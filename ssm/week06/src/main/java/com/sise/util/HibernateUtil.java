package com.sise.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Author: zhuib
 * Date: 2020/10/22 22:13
 * Describe:
 */
public class HibernateUtil {
    private static SessionFactory sf;
    private HibernateUtil() {}

    static {
        Configuration cfg = new Configuration().configure();
        sf = cfg.buildSessionFactory();
    }

    public static Session getSession() {
        Session session = sf.getCurrentSession();
        return session;
    }
}
