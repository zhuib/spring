package top.iaminlearn.utils;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component("logger")
@Aspect // 表示当前类是一个切面类
public class Logger {

//    切面表达式的注解是在一个方法上
    @Pointcut("execution(* top.iaminlearn.service.impl.*.*(..))")
    private void pt1(){}
    /**
     * 前置通知
     */
//    @Before("pt1()")
    public void beforePrintLog(){
        System.out.println("前置通知Logger类中的beforePrintLog方法开始记录日志.....");
    }

    /**
     * 后置通知
     */
//    @AfterReturning("pt1()")
    public void afterReturningPrintLog(){
        System.out.println("后置通知Logger类中的afterReturningPrintLog方法开始记录日志.....");
    }
    /**
     * 异常通知
     */
//    @AfterThrowing("pt1()")
    public void afterThrowingPrintLog(){
        System.out.println("异常通知Logger类中的afterThrowingPrintLog方法开始记录日志.....");
    }
    /**
     * 最终通知
     */
//    @After("pt1()")
    public void afterPintLog(){
        System.out.println("最终通知Logger类中的afterPintLog方法开始记录日志.....");
}
    /*
    * 环绕通知
    * 问题
    *       当我们配置环绕通知之后，切入点方法没有执行
    * */
    @Around("pt1()")
    public Object aroundPrint(ProceedingJoinPoint pjp){
        try {
            Object rtValue = null;
//            得到方法执行所需的参数
            Object[] args = pjp.getArgs();

            System.out.println("Logger类中的aroundPrint方法开始记录日志.....前置");
//            明确调用业务层的方法（切入点方法）
            rtValue = pjp.proceed(args);

            System.out.println("Logger类中的aroundPrint方法开始记录日志.....后置");

            return rtValue;
        } catch (Throwable throwable) {
            System.out.println("Logger类中的aroundPrint方法开始记录日志.....异常");
            throw new RuntimeException(throwable);
        }finally {
            System.out.println("Logger类中的aroundPrint方法开始记录日志.....最终");
        }

    }
}
