package top.iaminlearn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;
import top.iaminlearn.domain.User;

import java.util.Date;
import java.util.Map;

@Controller
@RequestMapping("/anno")
//该注解SessionAttributes作用于类上
@SessionAttributes(value = {"msg"})  // 把msg=美美存入到session域中
public class AnnoController {

    @RequestMapping("/testRequestParam")
    public String testRequestParam(@RequestParam(name = "name") String username){ // 将name 赋值给 username
        System.out.println("执行了...");
        System.out.println(username);
        return "success";
    }

    @RequestMapping("/testRequestBody")
    public String testRequestBody(@RequestBody String body){ // 将name 赋值给 username
        System.out.println("执行了...");
        System.out.println(body);
        return "success";
    }

    @RequestMapping("/testPathVariable/{sid}")
    public String testPathVariable(@PathVariable(name = "sid") String id){ // 将name 赋值给 username
        System.out.println("执行了...");
        System.out.println(id);
        return "success";
    }


  @RequestMapping("/testRequestHeader")
    public String testRequestHeader(@RequestHeader(name = "Accept") String header){ // 将name 赋值给 username
        System.out.println("执行了...");
        System.out.println(header);
        return "success";
    }

    @RequestMapping("/testCookieValue")
    public String testCookieValue(@CookieValue(value = "JSESSIONID") String cookieValue){ // CookieValue 获取cookie ID
        System.out.println("执行了...");
        System.out.println(cookieValue);
        return "success";
    }

    @RequestMapping("/testSessionAttribute")
    public String testSessionAttribute(Model model){ // 将abc值 给user
        System.out.println("testModelAttribute执行了...");
        model.addAttribute("msg","美美");
        return "success";
    }


    @RequestMapping("/getSessionAttribute")
    public String getSessionAttribute(ModelMap modelMap){ // 将abc值 给user
        System.out.println("getSessionAttribute执行了...");
        String msg = (String) modelMap.get("msg");
        System.out.println(msg);
        return "success";
    }

    /*
    * 清除session
    * */

    @RequestMapping("/delSessionAttribute")
    public String delSessionAttribute(SessionStatus status){ // 将abc值 给user
        System.out.println("delSessionAttribute执行了...");
        status.setComplete();
        return "success";
    }




















    @RequestMapping("/testModelAttribute")
    public String testModelAttribute(@ModelAttribute("abc") User user){ // 将abc值 给user
        System.out.println("testModelAttribute执行了...");
        System.out.println(user);
        return "success";
    }


    /*
    * 该方法执行
    * */
    // 方法二 注解加在参数上 没有返回值 将数据存放在map集合中
    @ModelAttribute
    public void showUser(String uname, Map<String,User> map){
        System.out.println("showUser执行了...");
//        通过用户查询数据库（模拟）
        User user = new User();
        user.setUname(uname);
        user.setAge(20);  // 由于先执行，因而数据会被后执行覆盖
        user.setDate(new Date());
        map.put("abc",user);
    }

    // 方法一 注解加在方法上 有返回值
/*    @RequestMapping("/testModelAttribute")
    public String testModelAttribute(User user){ // CookieValue 获取cookie ID
        System.out.println("testModelAttribute执行了...");
        System.out.println(user);
        return "success";
    }

    @ModelAttribute
    public User showUser(String uname){
        System.out.println("showUser执行了...");
//        通过用户查询数据库（模拟）
        User user = new User();
        user.setUname(uname);
        user.setAge(20);  // 由于先执行，因而数据会被后执行覆盖
        user.setDate(new Date());
        return user;
    }*/

}
