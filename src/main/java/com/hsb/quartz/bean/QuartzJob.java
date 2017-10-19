package com.hsb.quartz.bean;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

import java.util.Date;

/**
 * Created by tongheshang on 2017/10/18.
 * weibo.com/yunshixin
 * https://github.com/tongheshang
 * email: trulyheshengbang@gmail.com
 */
public class QuartzJob extends QuartzJobBean {

    private int timeout;


    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        System.out.println(QuartzJob.class.getName() + " - 当前时间为：" + new Date() + " - 任务执行中");
    }

    public int getTimeout() {
        return timeout;
    }

    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }
}
