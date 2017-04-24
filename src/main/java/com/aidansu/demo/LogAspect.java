package com.aidansu.demo;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Created by aidan on 17-4-21.
 */
@Aspect
@Component
public class LogAspect {

    @Pointcut("execution(* com.aidansu.demo.MyBean.*(..))")
    public void addAllMethod() { }

    @Before("addAllMethod()")
    public void before(){
        System.out.println("Method before　＝＝＝＝＝＝＝＝＝");
    }

    @After("addAllMethod()")
    public void after(){
        System.out.println("Method after　＝＝＝＝＝＝＝＝＝");
    }

}
