package com.kevin.springbatch.ch02;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @类名: JobLaunchTest
 * @包名：com.kevin.springbatch.ch02
 * @作者：kevin[wangqi2017@xinhua.org]
 * @时间：2018/6/17 11:30
 * @版本：1.0
 * @描述：
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:ch02/job/job.xml"})
public class JobLaunchTest {

    @Autowired
    private JobLauncher jobLauncher;

    @Autowired
    @Qualifier("billJob")
    private Job job;

    @Test
    public void importProducts() throws JobParametersInvalidException, JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException {
        JobExecution result = jobLauncher.run(job, new JobParameters());
        System.out.println(result.toString());
    }
}
