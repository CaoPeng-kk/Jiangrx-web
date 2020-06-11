package com.jiangrx.jiangrxweb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.jiangrx.jiangrxweb.mapper")
public class JiangrxWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(JiangrxWebApplication.class, args);
    }

}
