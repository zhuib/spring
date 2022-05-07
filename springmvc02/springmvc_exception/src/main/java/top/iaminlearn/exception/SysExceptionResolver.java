package top.iaminlearn.exception;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
* 异常处理器
* */
public class SysExceptionResolver implements HandlerExceptionResolver {

    /*
    * 处理异常业务逻辑
    * */
    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {

//        获取到异常对象
            SysException e = null;
            if (ex instanceof SysException){
                e = (SysException) ex;
            }else {
//                自己创建异常信息处理类对象
                e = new SysException("系统正在维护....");
            }

//            创建 ModelAndView 对象
        ModelAndView mv = new ModelAndView();
//            添加异常处理信息
            mv.addObject("errorMsg",e.getMessage()); // e.getMessage() 获取来自抛出异常的类的信息
        System.out.println("提示"+e.getMessage());
//            跳转异常处理页面
            mv.setViewName("error");
        return mv;

    }
}
