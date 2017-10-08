package com.bold.springbatch;

import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.annotation.AfterJob;
import org.springframework.batch.core.annotation.BeforeJob;

public class SystemOut {
    @BeforeJob
    public void beforeJob(JobExecution jobExecution) {
        System.out.println("Annotation : JobExecution create time " + jobExecution.getCreateTime());
    }

    @AfterJob
    public void afterJob(JobExecution jobExecution) {
        System.out.println("Annotation : JobExecution end time " + jobExecution.getEndTime());
    }
}
