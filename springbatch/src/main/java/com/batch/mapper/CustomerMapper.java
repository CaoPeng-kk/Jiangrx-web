package com.batch.mapper;

import com.jiangrx.jiangrxweb.model.Customerinfo;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @Author: caopeng
 * @Description:
 * @Date: Created in 15:53 2020/6/12
 */
public class CustomerMapper implements RowMapper<Customerinfo> {


    @Override
    public Customerinfo mapRow(ResultSet resultSet, int i) throws SQLException {
        Customerinfo customerinfo = new Customerinfo();
        customerinfo.setCustId(resultSet.getInt(1));
        customerinfo.setSurname(resultSet.getString(2));
        customerinfo.setGender(resultSet.getString(3));
        customerinfo.setEducaDes(resultSet.getString(4));
        customerinfo.setMarDes(resultSet.getString(5));
        customerinfo.setBirthday(resultSet.getInt(6));
        customerinfo.setAddress(resultSet.getString(7));
        return customerinfo;
    }
}
