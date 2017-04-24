package com.aidansu.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by aidan on 17-4-21.
 */
@Configuration
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class AppConfig {
    @Bean
    public MyBean myBean() {
        return new MyBeanImpl();
    }
    @Bean
    public SuperBean superBean(MyBean myBean){
        return new SuperBeanImpl(myBean);
    }

    @Bean
    public LogAspect logAspect(){
        return new LogAspect();
    }
}
