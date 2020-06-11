package com.jiangrx.jiangrxweb.service.customer.impl;

import com.jiangrx.jiangrxweb.mapper.CustomerinfoMapper;
import com.jiangrx.jiangrxweb.model.Customerinfo;
import com.jiangrx.jiangrxweb.service.customer.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: caop
 * @Description:
 * @Date: Created in 10:28 2020/6/7
 */
@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerinfoMapper customerinfoMapper;

    @Override
    public Customerinfo selectUserById(Integer id) {
        Customerinfo customerinfo = customerinfoMapper.selectById(id);
        System.out.println(customerinfo);
        return customerinfo;
    }

    @Override
    public int insertUser(Customerinfo customerinfo) {
        return 0;
    }


}
