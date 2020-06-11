package com.batch;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @Author: caop
 * @Description:
 * @Date: Created in 15:45 2020/6/6
 */

@SpringBootApplication
@EnableBatchProcessing
public class SpringbatchApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbatchApplication.class);
    }
}
