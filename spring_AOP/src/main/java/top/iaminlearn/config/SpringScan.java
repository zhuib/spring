package top.iaminlearn.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;
import top.iaminlearn.service.IAccountService;
import top.iaminlearn.service.impl.AccountServiceImpl;

@Configuration
@ComponentScan("top.iaminlearn")
@EnableAspectJAutoProxy
//@Import(AccountServiceImpl.class)
public class SpringScan {
}
