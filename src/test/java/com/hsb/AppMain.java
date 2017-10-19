package com.hsb;/*
 * Copyright ©2011-2016 hsb
 */

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {

    public static void main(String args[]){
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
    }

}
