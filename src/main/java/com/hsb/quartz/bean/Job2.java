package com.hsb.quartz.bean;/*
 * Copyright ©2011-2016 hsb
 */

import java.util.Date;

public class Job2 {
    public void doJob() {
        System.out.println(Job2.class.getName() + " - 当前时间为：" + new Date() + " - 任务执行中");
    }
}
