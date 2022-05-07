package com.sise.dao;

import com.sise.vo.Person;

/**
 * Author: zhuib
 * Date: 2020/10/22 22:19
 * Describe:
 */
public interface HibernateDao {
    public void addPerson(Person person);
    public void updatePerson(Person person);
    public void deletePerson(Person person);
    public Person getPersonById(Integer id);
}
