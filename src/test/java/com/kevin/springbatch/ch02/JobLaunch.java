package com.kevin.springbatch.ch02;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @类名: JobLaunch
 * @包名：com.kevin.springbatch.ch02
 * @作者：kevin[wangqi2017@xinhua.org]
 * @时间：2018/6/17 11:27
 * @版本：1.0
 * @描述：
 */
public class JobLaunch {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("ch02/job/job.xml");
       JobLauncher launcher = (JobLauncher) context.getBean("jobLauncher");
        Job job = (Job) context.getBean("billJob");
        try {
            JobExecution result = launcher.run(job, new JobParameters());
            System.out.println(result.toString());
        } catch (JobExecutionAlreadyRunningException e) {
            e.printStackTrace();
        } catch (JobRestartException e) {
            e.printStackTrace();
        } catch (JobInstanceAlreadyCompleteException e) {
            e.printStackTrace();
        } catch (JobParametersInvalidException e) {
            e.printStackTrace();
        }
    }
}
