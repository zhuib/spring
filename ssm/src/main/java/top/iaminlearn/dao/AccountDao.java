package top.iaminlearn.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import top.iaminlearn.domain.Account;

import java.util.List;

/*
* 账户dao接口
* */
//注册进容器
@Repository
public interface AccountDao {

//    查询所有账户
    @Select("select * from account")
    public List<Account> findAll();

//    保存账户信息
    @Insert("insert into account (name,money) values (#{name},#{money})")
    public void saveAccount(Account account);
}
