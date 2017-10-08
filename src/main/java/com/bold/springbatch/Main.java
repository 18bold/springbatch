package com.bold.springbatch;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext c =
                new ClassPathXmlApplicationContext("message_job.xml");
        // 对作业进行调度
        JobLauncher launcher = (JobLauncher)c.getBean("jobLauncher");
        try {
            launcher.run((Job) c.getBean("messageJob"), new JobParametersBuilder().addString("num","3").toJobParameters());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
