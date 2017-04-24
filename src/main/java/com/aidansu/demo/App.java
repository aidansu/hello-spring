package com.aidansu.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by aidan on 17-4-21.
 */
public class App {

    public static void main( String[] args ) {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        MyBean myBean = ctx.getBean(MyBean.class);
        myBean.sayBean();

        SuperBean superBean = ctx.getBean(SuperBean.class);
        superBean.privateInject();
        superBean.setterInject();
    }
}
