package com.aidansu.demo;

import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;

/**
 * Created by aidan on 17-4-21.
 */
public class SuperBeanImpl implements SuperBean {

    @Autowired
    private MyBean privateMyBean;
    private MyBean constructorMyBean;
    private MyBean setterMyBean;

    @Autowired
    public SuperBeanImpl(MyBean bean){
        this.constructorMyBean = bean;
    }

    @Resource
    public void setSetterMyBean(MyBean myBean) {
        this.setterMyBean = myBean;
    }

    public void setterInject() {
        System.out.println("Using setting injection with @resource!");
        setterMyBean.sayBean();
    }

    public void privateInject() {
        System.out.println("Using private injection!");
        privateMyBean.sayBean();
    }

}
