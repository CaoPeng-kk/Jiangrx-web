package com.jiangrx.jiangrxweb.service.customer;

import com.jiangrx.jiangrxweb.model.Customerinfo;

/**
 * @Author: caop
 * @Description: 用户接口
 * @Date: Created in 10:26 2020/6/7
 */
public interface CustomerService {
    /**
     * 根据id查询用户
     * @param id
     * @return 一条用户信息
     */
    Customerinfo selectUserById(Integer id);

    /**
     * 插入一条用户信息
     * @param customerinfo
     * @return
     */
    int insertUser(Customerinfo customerinfo);

}
