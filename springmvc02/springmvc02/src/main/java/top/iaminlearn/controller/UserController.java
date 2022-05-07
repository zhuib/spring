package top.iaminlearn.controller;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import top.iaminlearn.domain.User;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/user")
public class UserController {

    /*
    * 返回字符串
    * */
    @RequestMapping("/testString")
    public String testString(Model model){  // 将数据存到request域中，在从request域中取数据
        System.out.println("testString执行了... ");
        // 模拟从数据库中查询出User对象
        User user = new User();
        user.setUsername("飞哥");
        user.setPassword("123");
        user.setAge(20);
        model.addAttribute("user",user);
        return "success";
    }

    /*
    * 返回void
    * */

    @RequestMapping("/testVoid")
    public void testVoid(HttpServletRequest request, HttpServletResponse response) throws Exception {  // 将数据存到request域中，在从request域中取数据
        System.out.println("testVoid执行了... ");
        // 编写请求转发的程序
//        request.getRequestDispatcher("/WEB-INF/pages/success.jsp").forward(request,response);
//        重定向 两次请求
//        response.sendRedirect(request.getContextPath()+"/index.jsp");

//        设置中文乱码
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");

        // 直接进行响应
        response.getWriter().print("你好");
        return;


    }
    @RequestMapping("/testModelAndView")
    public ModelAndView testModelAndView(){  // 将数据存到request域中，在从request域中取数据
        System.out.println("testModelAndView执行了... ");
        //创建 ModelAndView 对象
        ModelAndView mv = new ModelAndView();  // 功能和返回值是String 很像
        // 模拟从数据库中查询出User对象
        User user = new User();
        user.setUsername("张飞");
        user.setPassword("123");
        user.setAge(20);

        mv.addObject("user",user);
        mv.setViewName("success");
        return mv;
    }


    /*
    * 使用关键字的方式进行转发或者重定向
    * 请求分派 需要 /WEB-INF/pages/ 这个路径
    * 重定向 不需要 /WEB-INF/pages/ 路径直接使用 页面名称
    * */
    @RequestMapping("/testForwardOrRedirect")
    public String testForwardOrRedirect(){  // 将数据存到request域中，在从request域中取数据
        System.out.println("testForwardOrRedirect执行了... ");
        // 请求的转发
//        return "forward:/WEB-INF/pages/success.jsp";  // forward: 关键字
//        重定向
        return "redirect:/index.jsp";  // redirect: 关键字重定向不需要加项目名称 即使用 HttpServletRequest 对象 request.getContextPath()
    }

    /*
    * 模拟ajax
    * ajax
    * ResponseBody注解自动 转json
    * */
    @RequestMapping("/testAjax")
    public @ResponseBody User testAjax(@RequestBody User user){
        System.out.println("testAjax执行了... ");
        // 客户端发送的ajax的请求
        System.out.println(user);
        // 模拟数据库
        user.setUsername("huib");
        user.setAge(30);
        return user;
    }

    /*
    * 文件上传
    * 传统文件上传
    * */
    @RequestMapping("/fileUpload")
    public String fileUpload(HttpServletRequest request) throws Exception {
        System.out.println("文件上传...");
//        使用fileupload组件完成文件上传
//        获取最大的域对象request.getSession().getServletContext()
//        获取绝对路径 getRealPath("/uploads/")

        String path = request.getSession().getServletContext().getRealPath("/uploads/");
//        System.out.println(path);
        // 判断，该路径是否存在
        File file = new File(path);
        if (!file.exists()){
            file.mkdirs();
        }
//        解析request
        DiskFileItemFactory factory = new DiskFileItemFactory();
        ServletFileUpload upload = new ServletFileUpload(factory);
//        解析request
        List<FileItem> items = upload.parseRequest(request);
//        遍历
        for (FileItem item:items){
//            进行判断，当前item对象是否是上传文件项
            if (item.isFormField()){
//                说明普通表单项
            }else {
//                说明上传文件项
//                获取上传文件的名称
                String filename = item.getName();
//                把文件的名称设置唯一值 uuid
                String uuid = UUID.randomUUID().toString().replace("-", "");
                String uid = UUID.randomUUID().toString();
                System.out.println(uid);
                filename = uuid +"_"+ filename;
//                完成文件的上传
                item.write(new File(path,filename));
//                删除临时文件
                item.delete();
            }
        }
        return "success";
    }


    /*
    * springmvc文件上传
    * 文件上传
    * */
    @RequestMapping("/fileUpload2")
    public String fileUpload2(HttpServletRequest request , MultipartFile upload) throws Exception {
        System.out.println("springmvc文件上传...");
//        使用fileupload组件完成文件上传
//        获取最大的域对象request.getSession().getServletContext()
//        获取绝对路径 getRealPath("/uploads/")

        String path = request.getSession().getServletContext().getRealPath("/uploads/");
//        System.out.println(path);
        // 判断，该路径是否存在
        File file = new File(path);
        if (!file.exists()){
            file.mkdirs();
        }
//                说明上传文件项
//                获取上传文件的名称
        String filename = upload.getOriginalFilename();
//                把文件的名称设置唯一值 uuid
        String uuid = UUID.randomUUID().toString().replace("-", "");
        String uid = UUID.randomUUID().toString();
        System.out.println(uid);
        filename = uuid +"_"+ filename;
//                完成文件的上传
        upload.transferTo(new File(path,filename));

        return "success";
    }

    /* 跨服器文件上传
    * springmvc文件上传
    * 文件上传
    * */
    @RequestMapping("/fileUpload3")
    public String fileUpload3( MultipartFile upload) throws Exception {
        System.out.println("跨服器文件上传文件上传...");
//        使用fileupload组件完成文件上传
//        获取最大的域对象request.getSession().getServletContext()
//        获取绝对路径 getRealPath("/uploads/")
//        定义上传文件服务器的路径
            String path = "http://localhost:9090/uploads/";
//        说明上传文件项
//         获取上传文件的名称
        String filename = upload.getOriginalFilename();
//                把文件的名称设置唯一值 uuid
        String uuid = UUID.randomUUID().toString().replace("-", "");
        String uid = UUID.randomUUID().toString();
        System.out.println(uid);
        filename = uuid +"_"+ filename;

//        创建客户端的对象
        Client client = Client.create();
//        图片服务器进行连接
        WebResource webResource = client.resource(path + filename);
//        上传文件
        String result = webResource.put(String.class, upload.getBytes());
        System.out.println("结果："+result);
        return "success";

    }

}
