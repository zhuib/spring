package top.iaminlearn.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyInterceptor2 implements HandlerInterceptor {
    @Override

    /*
    * 预处理，controller方法执行前
    * return true 放行 执行下一个拦截器，如果没有，执行controller中的方法
    * return false 不放行 当是可以使用request response对象进行跳转
    * */
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("MyInterceptor执行了...前222");
        return true;
    }

    /*
    * 处理后，controller方法执行后，jsp页面执行前
    * */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("MyInterceptor执行了...后222");
    }

    /*
    * jsp页面执行后，该方法会执行
    * */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("MyInterceptor执行了...最后222");
    }
}
