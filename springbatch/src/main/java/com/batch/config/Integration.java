package com.batch.config;

import com.batch.mapper.CustomerMapper;
import com.batch.mapper.TransactionMapper;
import com.jiangrx.jiangrxweb.mapper.TransactioninfoMapper;
import com.jiangrx.jiangrxweb.model.Customerinfo;
import com.jiangrx.jiangrxweb.model.Transactioninfo;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.database.builder.JdbcCursorItemReaderBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @Author: caopeng
 * @Description:
 * @Date: Created in 15:45 2020/6/12
 */

@Configuration
public class Integration {

    @Autowired
    private JobBuilderFactory jobBuilderFactory;
    @Autowired
    private StepBuilderFactory stepBuilderFactory;

    @Autowired
    private DataSource dataSource;

    @Bean
    public ItemReader db2DbItemReaderCustomer(DataSource dataSource) {
        String readSql = "select * from customerinfo";
        return new JdbcCursorItemReaderBuilder<Customerinfo>()
                .dataSource(dataSource).sql(readSql)
                .verifyCursorPosition(false).rowMapper(new CustomerMapper())
                .build();
    }


}
