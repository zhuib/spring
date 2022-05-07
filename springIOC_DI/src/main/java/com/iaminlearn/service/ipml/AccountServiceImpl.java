package com.iaminlearn.service.ipml;

import com.iaminlearn.dao.IAccountDao;
import com.iaminlearn.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * 账户的业务实现类
 *
 * xml配置
 *     <bean id="accountService" class="com.iaminlearn.service.ipml.AccountServiceImpl" scope="" init-method="" destroy-method="">
 *           <properties name="" value="" ref=""></properties>
 *         </bean>
 *
 * 用于创建对象的
 *      他们的作用就和在xml配置文件中编写一个bean标签实现的功能一样
 *      Component:
 *          作用：用于把当前类对象存入spring 容器中
 *          属性：
 *            value：用于指定bean 的id，当不写时，他默认值是当前类名，且首字母改小写
 *      Controller:  一般用于表现层
 *      Service: 一般用于业务层
 *      Repository: 一般用于持久层
 *      以上三个注解他们的作用和属性与Component是一模一样的
 *      他们三个是spring 框架为我们提供明确的三层使用的注解，使我们的三层对象更加清晰
 *
 *
 * 用于注入数据的
 *      他们的作用就和xml配置文件bean 标签中写一个property 标签的作用是一样的
 *      Autowired:
 *          作用：自动按照类型注入。只要容器中有唯一的一个bean对象类型和要注入的变量类型匹配，就可以注入成功
 *          如果ioc容器中没有任何bean 的类型和要注入的变量类型匹配，则报错
 *          如果 IOC 容器中有多个类型匹配时,接口或实现类有一个匹配时，则匹配成功。有多个接口或实现类匹配时，则根据变量名称进行区分注入
 *      出现位置：
 *             可以是变量上，也可以是方法上
 *      细节：
 *          在使用注解注入时，set方法就不是必须的了
 *      Qualifier：
 *          作用：在按照类中注入的基础之上再按照名称注入。他给类成员注入时不能单独使用。但是在给方法参数注入时可以
 *          属性：
 *              value：用于指定注入bean的id
 *          需要依托于autowired注解共同使用
 *     Resource
 *            作用：直接按照bean的id注入。他可以独立使用
 *            属性：
 *                  name：用于指定bean的id
 *     以上三个注入都只能注入其他的bean类型的数据，而基本数据类型和string类型无法使用上述注解实现
 *     另外，集合类型的注入只能通过XMl来实现
 *
 *     value：
 *           作用：用于注入基本类型和string类型的数据
 *           属性：
 *                value：用于指定数据的值。他可以使用spring中的SpEL（也就是spring的el表达式）
 *                       SpEL的写法：${表达式}
 *
 *
 * 用于改变作用范围
 *      他们的作用就和在bean 标签使用scope 属性实现的功能是一样的
 *      scope
 *          作用：用于指定bean的作用范围
 *          属性：
 *              value：指定范围的取值，常用取值，singleton  prototype
 *
 * 和生命周期相关
 *      作用就和在bean 标签中使用init-method="" destroy-method="" 作用是一样的
 *      PreDestory
 *          作用：用于指定销毁方法
 *      PostConstruct
 *          作用：用于指定初始化方法
 */
@Component
public class AccountServiceImpl implements IAccountService {

    @Autowired
//    @Qualifier("")
    private IAccountDao accountDao;

    public AccountServiceImpl(){
        System.out.println("对象创建了");
    }
    @Override
    public void saveAccount() {
        accountDao.saveAccount();
//        System.out.println("service 中的saveAccount 执行了" );
    }

}
