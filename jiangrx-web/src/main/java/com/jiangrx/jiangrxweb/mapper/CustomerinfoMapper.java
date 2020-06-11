package com.jiangrx.jiangrxweb.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jiangrx.jiangrxweb.model.Customerinfo;
import io.swagger.annotations.Api;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 * @Description: 用户信息表Mapper接口
 * @author jobob
 * @since 2020-06-06
 */

@Mapper
public interface CustomerinfoMapper extends BaseMapper<Customerinfo> {

}
