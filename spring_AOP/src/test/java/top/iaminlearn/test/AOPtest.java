package top.iaminlearn.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.iaminlearn.config.SpringScan;
import top.iaminlearn.service.IAccountService;

public class AOPtest {

    public static void main(String[] args) {
//        获取容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
//        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(SpringScan.class);
//        获取对象
        IAccountService as = ac.getBean("accountService",IAccountService.class);
//        执行方法
        as.saveAccount();
        as.updateAccount(1);

    }
}
