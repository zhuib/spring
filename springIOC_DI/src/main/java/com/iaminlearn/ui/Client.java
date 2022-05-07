package com.iaminlearn.ui;

//import com.com.iaminlearn.dao.IAccountDao;

import com.iaminlearn.dao.IAccountDao;
import com.iaminlearn.service.IAccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 模拟一个表现层，用于调用业务层
 */
public class Client {
    /**
     * 获取spring 的IOC 核心容器，并根据id 获取对象
     *
     * ApplicationContext 的三大常用实现类
     *         ClassPathXmlApplicationContext : 他可以加载类路径下的配置文件，要求配置文件必须在类路径下，不在的话，加载不了
     *         FileSystemXmlApplicationContext ： 他可以加载磁盘任意路径下的配置文件（必须有访问权限）
     *         AnnotationXmlApplicationContext  ： 他是用于读取注解创建的容器
     *
     * 核心容器的两个接口引发的问题
     *   ApplicationContext：  适用于单实例对象
     *              他在构建核心容器时，创建对象采取的策略是采用立即加载的方式，也就是说，只要一读完配置文件马上就创建配置文件中的配置对象
     *   BeanFactory：    适用于多实例对象
     *              他在构建核心容器时，创建对象采取的策略是采用延迟加载的方式。也就是说，什么时候根据Id 获取对象了，什么时候才真正的创建对象
     * @param args
     */
    public static void main(String[] args) {
//        获取核心容器对象
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
//        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
//        根据id 获取Bean 对象
        IAccountService as = (IAccountService) ac.getBean("accountServiceImpl");
        System.out.println(as);
        IAccountDao adao = ac.getBean("accountDao",IAccountDao.class);
        System.out.println(adao);
            as.saveAccount();

        }


}
