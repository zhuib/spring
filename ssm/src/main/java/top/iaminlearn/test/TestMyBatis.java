package top.iaminlearn.test;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import top.iaminlearn.dao.AccountDao;
import top.iaminlearn.domain.Account;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TestMyBatis {

    /*
    * 查询
    * */
    @Test
    public void run1() throws Exception {
//        加载配置文件
        InputStream in = Resources.getResourceAsStream("sqlMapConfig.xml");
//        创建SqlSessionFactory对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
//        创建SqlSession对象
        SqlSession session = factory.openSession();
//        获取到代理对象
        AccountDao dao = session.getMapper(AccountDao.class);
//        查询所有数据
        List<Account> list = dao.findAll();
        for(Account account:list){
            System.out.println(account);
        }
//        关闭资源
        session.close();
        in.close();
    }


    @Test
    public void run2() throws Exception {

        Account account = new Account();
        account.setName("lisi");
        account.setMoney(330.4);
//        加载配置文件
        InputStream in = Resources.getResourceAsStream("sqlMapConfig.xml");
//        创建SqlSessionFactory对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
//        创建SqlSession对象
        SqlSession session = factory.openSession();
//        获取到代理对象
        AccountDao dao = session.getMapper(AccountDao.class);

//        保存
        dao.saveAccount(account);
//        提交事务
        session.commit();
//        关闭资源
        session.close();
        in.close();
    }
}
