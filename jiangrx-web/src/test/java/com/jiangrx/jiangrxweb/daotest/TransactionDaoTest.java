package com.jiangrx.jiangrxweb.daotest;

import com.jiangrx.jiangrxweb.mapper.TransactioninfoMapper;
import com.jiangrx.jiangrxweb.model.Transactioninfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

/**
 * @Author: caop
 * @Description:
 * @Date: Created in 21:55 2020/6/8
 */
@RunWith(SpringRunner.class)
@SpringBootTest()
public class TransactionDaoTest {

    private static final org.slf4j.Logger logger = org.slf4j.LoggerFactory
            .getLogger(TransactionDaoTest.class);

    @Autowired
    private TransactioninfoMapper transactioninfoMapper;

    @Test
    public void contextLoads() {
        Transactioninfo transactioninfo = new Transactioninfo(1, "12346574", "12658797", Integer.valueOf(12365735), Integer.valueOf(34576934), new BigDecimal(123), "3", LocalDateTime.now());
        int result = transactioninfoMapper.insert(null);
        logger.info(String.valueOf(result));
    }
    @Test
    public void selectList() {
        // 查询全部
        List<Transactioninfo> transactioninfos = transactioninfoMapper.selectList(null);
        System.out.println(transactioninfos);
    }
}
