package com.hsb.quartz.spring;/*
 * Copyright ©2011-2016 hsb
 */

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component("taskJob2")
public class TaskJob2 {
    @Scheduled(cron = "* * 10 * * ?")
    public void job1() {
        System.out.println(TaskJob2.class.getName() + " - 当前时间为：" + new Date() + " - 任务执行中");
    }
}
