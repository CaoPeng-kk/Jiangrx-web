package com.jiangrx.jiangrxweb.service.transaction;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.jiangrx.jiangrxweb.model.Transactioninfo;

import java.util.List;

/**
 * @Author: caop
 * @Description:
 * @Date: Created in 20:54 2020/6/8
 */
public interface TransactionService {
    /**
     * 根据id查询交易信息
     * @param id
     * @return 一条交易信息
     */
    Transactioninfo selectTransInfoById(Integer id);

    /**
     * 插入一条交易信息
     * 之间插入null报错
     * @param transactioninfo
     * @return
     */
    int insertInfo(Transactioninfo transactioninfo);

    /**
     * 根据交易id删除交易信息
     * @return
     */
    int deleteById(Integer id);

    /**
     * 根据交易id修改信息
     * @return
     */
    int updateById(Transactioninfo transactioninfo);

    /**
     * 交易信息展示
     * @return
     */
    List<Transactioninfo> showTransactionInfo();

    /**
     * 根据 entity 条件，查询全部记录（并翻页）
     *
     * @param page
     * @param state
     * @return
     */
    IPage<Transactioninfo> selectUserPage(Page<Transactioninfo> page, Integer state);
}
