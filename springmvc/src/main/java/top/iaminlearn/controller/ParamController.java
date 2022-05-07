package top.iaminlearn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import top.iaminlearn.domain.Account;
import top.iaminlearn.domain.User;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/param")
public class ParamController {

    /*
    *  请求参数绑定
    * */
    @RequestMapping("/testParam")
    public String testParam(String username, String passwd){  // 请求的参数会 作为方法的参数进行传递
        System.out.println("执行了...");
        System.out.println("用户名："+ username+"\n"+ "密码："+ passwd);
        return "success";
    }


    /*
    *  请求参数绑定 把数据封装到 javabean的类中
    * */
    @RequestMapping("/saveAccount")
    public String saveAccount(Account account){  // 请求的参数会 把数据封装到 javabean的类中
        System.out.println("执行了...");
        System.out.println(account);
        return "success";
    }

    /*
     *    自定义类型转换
    */
    @RequestMapping("/saveUser")
    public String saveAccount(User user){  // 请求的参数会 把数据封装到 javabean的类中
        System.out.println("执行了...");
        System.out.println(user);
        return "success";
    }

    /*
     *   原生的API获取
  */
    @RequestMapping("/testServlet")
    public String testServlet(HttpServletRequest request, HttpServletResponse response){  // 请求的参数会 把数据封装到 javabean的类中
        System.out.println("执行了...");
        System.out.println(request);

        HttpSession session = request.getSession();
        System.out.println(session);

        ServletContext servletContext = session.getServletContext();
        System.out.println(servletContext);

        System.out.println(response);
        return "success";
    }
}
