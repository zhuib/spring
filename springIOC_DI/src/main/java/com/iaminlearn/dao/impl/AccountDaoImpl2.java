package com.iaminlearn.dao.impl;

import com.iaminlearn.dao.IAccountDao;
import org.springframework.stereotype.Repository;


/**
 * 账户的持久层实现类
*/
@Repository("accountDao1")
public class AccountDaoImpl2 implements IAccountDao {

    @Override
    public void saveAccount() {
        System.out.println("保存了账户");
    }
}


