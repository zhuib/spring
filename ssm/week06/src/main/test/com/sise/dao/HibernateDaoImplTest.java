package com.sise.dao;

import com.sise.dao.impl.HibernateDaoImpl;
import com.sise.vo.Person;
import org.junit.Test;

/**
 * Author: zhuib
 * Date: 2020/10/22 22:28
 * Describe:
 */
public class HibernateDaoImplTest {

    HibernateDao hibernateDao = new HibernateDaoImpl();
    Person person1 = new Person();
    Person person2 = new Person();

    @Test
    public void addPerson() {
        person1.setName("Jack");
        person1.setAge(23);
        person2.setName("Jack");
        person2.setAge(33);
        hibernateDao.addPerson(person1);
        hibernateDao.addPerson(person2);
    }

    @Test
    public void getPersonById() {
        Person p1 = hibernateDao.getPersonById(6);
        System.out.println(p1.getId() + p1.getName() + ":" + p1.getAge());
        Person p2 = hibernateDao.getPersonById(7);
        System.out.println(p2.getId() + p2.getName() + ":" + p2.getAge());
    }

    @Test
    public void updatePerson() {
        Person p1 = hibernateDao.getPersonById(6);
        p1.setAge(39);
        hibernateDao.updatePerson(p1);
        System.out.println("修改后：" + p1.getName() + ":" + p1.getAge());
    }

    @Test
    public void deletePerson() {
        Person p2 = hibernateDao.getPersonById(5);
        hibernateDao.deletePerson(p2);
        Person p3 = hibernateDao.getPersonById(5);
        if (null == p3) {
            System.out.println("Sorry, John已被删除了！");
        }
    }


}