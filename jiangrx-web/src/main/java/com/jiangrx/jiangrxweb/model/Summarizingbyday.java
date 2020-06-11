package com.jiangrx.jiangrxweb.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import org.apache.ibatis.annotations.Mapper;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;


/**
 * <p>
 * 
 * </p>
 *
 * @author jobob
 * @since 2020-06-06
 */
@ApiModel("汇总信息实体类")
public class Summarizingbyday implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 索引项
     */
    @TableId(value = "s_index", type = IdType.AUTO)
    private String sIndex;

    /**
     * 客户号
     */

    private Integer custId;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;

    /**
     * 日期
     */
    private LocalDate transDate;

    /**
     * 客户姓名
     */
    private String surname;

    /**
     * 最大单笔交易金额
     */
    private BigDecimal tranMaxAmt;

    /**
     * 当天还款总金额
     */
    private BigDecimal payAmt;

    /**
     * 当天消费笔数
     */
    private Integer tranCnt;

    /**
     * 当天还款笔数
     */
    private Integer payCnt;

    /**
     * 当天交易总金额
     */
    private BigDecimal tranAmt;

    public String getsIndex() {
        return sIndex;
    }

    public void setsIndex(String sIndex) {
        this.sIndex = sIndex;
    }

    public Integer getCustId() {
        return custId;
    }

    public void setCustId(Integer custId) {
        this.custId = custId;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public LocalDate getTransDate() {
        return transDate;
    }

    public void setTransDate(LocalDate transDate) {
        this.transDate = transDate;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public BigDecimal getTranMaxAmt() {
        return tranMaxAmt;
    }

    public void setTranMaxAmt(BigDecimal tranMaxAmt) {
        this.tranMaxAmt = tranMaxAmt;
    }

    public BigDecimal getPayAmt() {
        return payAmt;
    }

    public void setPayAmt(BigDecimal payAmt) {
        this.payAmt = payAmt;
    }

    public Integer getTranCnt() {
        return tranCnt;
    }

    public void setTranCnt(Integer tranCnt) {
        this.tranCnt = tranCnt;
    }

    public Integer getPayCnt() {
        return payCnt;
    }

    public void setPayCnt(Integer payCnt) {
        this.payCnt = payCnt;
    }

    public BigDecimal getTranAmt() {
        return tranAmt;
    }

    public void setTranAmt(BigDecimal tranAmt) {
        this.tranAmt = tranAmt;
    }

    @Override
    public String toString() {
        return "Summarizingbyday{" +
                "sIndex='" + sIndex + '\'' +
                ", custId=" + custId +
                ", updateTime=" + updateTime +
                ", transDate=" + transDate +
                ", surname='" + surname + '\'' +
                ", tranMaxAmt=" + tranMaxAmt +
                ", payAmt=" + payAmt +
                ", tranCnt=" + tranCnt +
                ", payCnt=" + payCnt +
                ", tranAmt=" + tranAmt +
                '}';
    }
}
