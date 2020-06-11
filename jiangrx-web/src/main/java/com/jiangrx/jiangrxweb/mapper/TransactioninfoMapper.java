package com.jiangrx.jiangrxweb.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jiangrx.jiangrxweb.model.Transactioninfo;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 * @Description: 交易信息表Mapper接口
 * @author jobob
 * @since 2020-06-06
 */

@Mapper
public interface TransactioninfoMapper extends BaseMapper<Transactioninfo> {

}
