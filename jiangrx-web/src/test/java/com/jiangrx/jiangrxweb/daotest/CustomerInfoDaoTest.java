package com.jiangrx.jiangrxweb.daotest;

import com.jiangrx.jiangrxweb.mapper.CustomerinfoMapper;
import com.jiangrx.jiangrxweb.model.Customerinfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


/**
 * @Author: caop
 * @Description:
 * @Date: Created in 22:59 2020/6/6
 */
@RunWith(SpringRunner.class)
@SpringBootTest()
public class CustomerInfoDaoTest {

    @Autowired
    private CustomerinfoMapper customerinfoMapper;



    @Test
    public void contextLoads() {
        Customerinfo customerinfo = customerinfoMapper.selectById(1);
        System.out.println(customerinfo.toString());
    }

}
