package top.iaminlearn.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.iaminlearn.dao.AccountDao;
import top.iaminlearn.domain.Account;
import top.iaminlearn.service.AccountService;

import java.util.List;

@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    @Override
    public List<Account> findAll() {
        System.out.println("业务层，查询所有");
        return accountDao.findAll();
    }

    @Override
    public void saveAccount(Account account) {
        System.out.println("业务层，保存所有");
        accountDao.saveAccount(account);
    }
}
