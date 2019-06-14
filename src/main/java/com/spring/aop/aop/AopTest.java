package com.spring.aop.aop;


import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;


@Aspect
@Configuration
public class AopTest {

    @Pointcut("execution(* com.spring.aop.service.impl..*.login(..))")
    public void pointMethod(){ }

    @Pointcut("execution(* com.spring.aop.service.impl..*.login2(..))")
    public void pointMethod2(){ }


    @Pointcut("pointMethod() || pointMethod2()")
    public void pointMethod3(){ }

    @Before("AopTest.pointMethod3()")
    public void Before(){
        System.out.println("Before");
    }

    @After("AopTest.pointMethod()")
    public void After(){

        System.out.println("After");
    }

}
