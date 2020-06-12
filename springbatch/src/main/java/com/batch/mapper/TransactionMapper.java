package com.batch.mapper;

import com.jiangrx.jiangrxweb.model.Transactioninfo;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @Author: caopeng
 * @Description:
 * @Date: Created in 16:27 2020/6/12
 */
public class TransactionMapper implements RowMapper<Transactioninfo> {


    @Override
    public Transactioninfo mapRow(ResultSet resultSet, int i) throws SQLException {
        Transactioninfo transactioninfo = new Transactioninfo();
        transactioninfo.setTransId(resultSet.getInt(1));
        transactioninfo.setCustId(resultSet.getInt(2));
        transactioninfo.setAccount(resultSet.getString(3));
        transactioninfo.setCardNbr(resultSet.getString(4));
        transactioninfo.setTranno(resultSet.getInt(5));
        transactioninfo.setMonthNbr(resultSet.getInt(6));
        transactioninfo.setBill(resultSet.getBigDecimal(7));
        transactioninfo.setTransType(resultSet.getString(8));

        return transactioninfo;
    }
}
