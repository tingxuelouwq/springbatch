package com.kevin.springbatch.ch03;

import org.springframework.batch.core.*;
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

    public static void executeJob(String jobPath, String jobName,
                                  JobParametersBuilder builder) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext(jobPath);
        JobLauncher launcher = (JobLauncher) context.getBean("jobLauncher");
        Job job = (Job) context.getBean(jobName);
        try {
            JobExecution result = launcher.run(job, builder.toJobParameters());
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

    public static void main(String[] args) {
        executeJob("ch03/job/job.xml", "billJob",
                new JobParametersBuilder().addString("date", "20130308"));
    }
}
