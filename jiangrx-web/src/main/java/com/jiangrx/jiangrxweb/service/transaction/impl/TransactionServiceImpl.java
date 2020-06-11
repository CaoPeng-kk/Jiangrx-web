package com.jiangrx.jiangrxweb.service.transaction.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.jiangrx.jiangrxweb.mapper.TransactioninfoMapper;
import com.jiangrx.jiangrxweb.model.Transactioninfo;
import com.jiangrx.jiangrxweb.service.transaction.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: caop
 * @Description: 交易信息实现类
 * @Date: Created in 20:53 2020/6/8
 */
@Service
public class TransactionServiceImpl implements TransactionService {

    @Autowired
    private TransactioninfoMapper transactioninfoMapper;

    @Override
    public Transactioninfo selectTransInfoById(Integer id) {
        Transactioninfo transactioninfo = transactioninfoMapper.selectById(id);
        return transactioninfo;
    }

    @Override
    public int insertInfo(Transactioninfo transactioninfo) {
        if (transactioninfo == null) {
            return -1;
        }
        return transactioninfoMapper.insert(transactioninfo);
    }

    @Override
    public int deleteById(Integer id) {
        return transactioninfoMapper.deleteById(id);
    }

    @Override
    public int updateById(Transactioninfo transactioninfo) {
        if (transactioninfo == null) {
            return -1;
        }
        return transactioninfoMapper.updateById(transactioninfo);
    }

    @Override
    public List<Transactioninfo> showTransactionInfo() {
        List<Transactioninfo> transactioninfos = transactioninfoMapper.selectList(null);
        return transactioninfos;
    }

    @Override
    public IPage<Transactioninfo> selectUserPage(Page<Transactioninfo> page, Integer state) {
        IPage<Transactioninfo> transactioninfoIPage = transactioninfoMapper.selectPage(page, null);
        return transactioninfoIPage;
    }
}
