package top.iaminlearn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//控制器类
@Controller
@RequestMapping(path = "/user") // 注解在类上相当于一级路径
public class HelloController {

    @RequestMapping(path = "/hello")  // 请求映射
    public String sayHello(){
        System.out.println("Hello StringMVC");
        return "success";  // 返回 jsp 文件
    }

    // 多个 参数使用{} 大括号进行
//    @RequestMapping(value = "/testRequestMapping", method = {RequestMethod.POST})  // 注解在类上相当于二级路径
//    @RequestMapping(value = "/testRequestMapping", params = {"username"})
    @RequestMapping(value = "/testRequestMapping")
    public String testRequestMapping(){
        System.out.println("测试RequestMapping注解。。。");
        return "success";
    }
}
