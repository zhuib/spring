package top.iaminlearn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import top.iaminlearn.exception.SysException;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/testException")
    public String testException() throws SysException {
        System.out.println("testException执行了....");

        try {
//        模拟异常
            int a= 10/0;
        } catch (Exception e) {
//            打印异常信息
            e.printStackTrace();
//            抛出自定义异常信息
            throw new SysException("查询用户信息出现异常...");
        }
        return "success";
    }

    @RequestMapping("/testInterceptor")
    public String testInterceptor(){
        System.out.println("testInterceptor执行了...");
        return "success";
    }
}
