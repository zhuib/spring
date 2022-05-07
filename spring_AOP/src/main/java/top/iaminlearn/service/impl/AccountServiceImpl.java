package top.iaminlearn.service.impl;

import org.springframework.stereotype.Service;
import top.iaminlearn.service.IAccountService;
import top.iaminlearn.utils.Logger;

@Service("accountService")
public class AccountServiceImpl implements IAccountService {
    @Override
    public void saveAccount() {
        System.out.println("保存执行了.....");
    }

    @Override
    public void updateAccount(int i) {
        System.out.println("更新执行了.....");
    }

    @Override
    public int deleteAccount() {
        System.out.println("删除执行了.....");
        return 0;
    }
}
