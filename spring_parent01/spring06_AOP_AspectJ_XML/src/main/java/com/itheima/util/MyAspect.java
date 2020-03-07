package com.itheima.util;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;

public class MyAspect {
    //前置通知
    public void myBefore(JoinPoint joinPoint){
        System.out.println("前置通知");
        System.out.println("目标类是："+ joinPoint.getTarget());
        System.out.println("被植入的增强处理方法"+joinPoint.getSignature().getName());
    }
    //后置通知
    public void myAfterReturning(JoinPoint joinPoint){
        System.out.println("后置通知");
        System.out.println("目标类是："+joinPoint.getTarget());
        System.out.println("被植入的增强处理方法"+joinPoint.getSignature().getName());
    }
    //环绕通知
    public Object myAround(ProceedingJoinPoint proceedingJoinPoint)throws Throwable{
        System.out.println("环绕开始：执行目标方法之前，模拟开启事务。。。。。。");
        //执行当前目标方法
        Object obj = proceedingJoinPoint.proceed();
        System.out.println("环绕结束：执行目标方法之前，模拟开启事务。。。。。。");
        return obj;
    }
    //异常通知
    public void myAfterThrowing(JoinPoint joinPoint,Throwable e){
        System.out.println("异常通知：出错了"+e.getMessage());
    }
    //最终通知
    public void myAfter(){
        System.out.println("最终通知：模拟方法后释放资源");
    }

}
