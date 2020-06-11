package com.jiangrx.jiangrxweb.servicetest;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.jiangrx.jiangrxweb.model.Transactioninfo;
import com.jiangrx.jiangrxweb.service.transaction.TransactionService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * @Author: caop
 * @Description:
 * @Date: Created in 22:20 2020/6/8
 */
@RunWith(SpringRunner.class)
@SpringBootTest()
public class TransactionServiceTest {

    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory
            .getLogger(TransactionServiceTest.class);

    @Autowired
    private TransactionService transactionService;

    @Test
    public void insert() {
        Transactioninfo transactioninfo = new Transactioninfo(1, "12346574", "12658797", Integer.valueOf(12365735), Integer.valueOf(34576934), new BigDecimal(123), "3", LocalDateTime.now());
        Transactioninfo transactioninfo1 = new Transactioninfo();
        int result = transactionService.insertInfo(transactioninfo);
        log.info(String.valueOf(result));

    }
    @Test
    public void delete() {
        System.out.println(transactionService.deleteById(5));
    }
    @Test
    public void update() {
        Transactioninfo transactioninfo = new Transactioninfo(1, "32146574", "12658797", Integer.valueOf(12365735), Integer.valueOf(34576934), new BigDecimal(123), "3", LocalDateTime.now());
        transactioninfo.setTransId(6);
        transactionService.updateById(transactioninfo);
    }
    @Test
    public void select() {
        Transactioninfo transactioninfo = transactionService.selectTransInfoById(2);
        System.out.println(transactioninfo.toString());
    }

    @Test
    public void pages() {
        Page<Transactioninfo> transactioninfoPage = new Page<>(1,5);
        IPage<Transactioninfo> transactioninfoIPage = transactionService.selectUserPage(transactioninfoPage, null);
        System.out.println(transactioninfoIPage.getRecords());

    }
}
