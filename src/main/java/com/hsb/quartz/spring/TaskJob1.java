package com.hsb.quartz.spring;/*
 * Copyright ©2011-2016 hsb
 */

import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class TaskJob1 {
    public void job1() {
        System.out.println(TaskJob1.class.getName() + " - 当前时间为：" + new Date() + " - 任务执行中");
    }
}
