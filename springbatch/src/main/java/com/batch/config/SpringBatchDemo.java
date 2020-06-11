package com.batch.config;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: caop
 * @Description:
 * @Date: Created in 21:33 2020/5/29
 */

@Configuration
@EnableBatchProcessing
public class SpringBatchDemo {

    @Autowired
    private JobBuilderFactory jobBuilderFactory;
    @Autowired
    private StepBuilderFactory stepBuilderFactory;

    @Bean
    public Job batchDemo(){
        return jobBuilderFactory.get("batchDemo").start(step1()).build();
    }

    @Bean
    public Step step1(){
        return stepBuilderFactory.get("step1").tasklet((stepContribution, chunkContext) -> {
            System.out.println("spring batch sucessed");
            return RepeatStatus.FINISHED;
        }).build();
    }


}
