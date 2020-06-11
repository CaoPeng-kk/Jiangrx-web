package com.jiangrx.jiangrxweb.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author jobob
 * @since 2020-06-06
 */
@ApiModel("交易信息实体类")
public class Transactioninfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 交易id
     */
    @TableId(value = "trans_id", type = IdType.AUTO)
    private Integer transId;

    /**
     * 客户号
     */
    private Integer custId;

    /**
     * 账户号
     */
    private String account;

    /**
     * 卡号
     */
    private String cardNbr;

    /**
     * 交易流水号
     */
    private Integer tranno;

    /**
     * 账单月
     */
    private Integer monthNbr;

    /**
     * 交易金额
     */
    private BigDecimal bill;

    /**
     * 交易类型
     */
    private String transType;

    /**
     * 交易日期
     */
    private LocalDateTime txnDatetime;

    public Transactioninfo() {
    }

    public Transactioninfo(Integer custId, String account, String cardNbr, Integer tranno,
                           Integer monthNbr, BigDecimal bill, String transType,
                           LocalDateTime txnDatetime) {
        this.custId = custId;
        this.account = account;
        this.cardNbr = cardNbr;
        this.tranno = tranno;
        this.monthNbr = monthNbr;
        this.bill = bill;
        this.transType = transType;
        this.txnDatetime = txnDatetime;
    }

    public Integer getTransId() {
        return transId;
    }

    public void setTransId(Integer transId) {
        this.transId = transId;
    }

    public Integer getCustId() {
        return custId;
    }

    public void setCustId(Integer custId) {
        this.custId = custId;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getCardNbr() {
        return cardNbr;
    }

    public void setCardNbr(String cardNbr) {
        this.cardNbr = cardNbr;
    }

    public Integer getTranno() {
        return tranno;
    }

    public void setTranno(Integer tranno) {
        this.tranno = tranno;
    }

    public Integer getMonthNbr() {
        return monthNbr;
    }

    public void setMonthNbr(Integer monthNbr) {
        this.monthNbr = monthNbr;
    }

    public BigDecimal getBill() {
        return bill;
    }

    public void setBill(BigDecimal bill) {
        this.bill = bill;
    }

    public String getTransType() {
        return transType;
    }

    public void setTransType(String transType) {
        this.transType = transType;
    }

    public LocalDateTime getTxnDatetime() {
        return txnDatetime;
    }

    public void setTxnDatetime(LocalDateTime txnDatetime) {
        this.txnDatetime = txnDatetime;
    }

    @Override
    public String toString() {
        return "Transactioninfo{" +
                "transId=" + transId +
                ", custId=" + custId +
                ", account='" + account + '\'' +
                ", cardNbr='" + cardNbr + '\'' +
                ", tranno=" + tranno +
                ", monthNbr=" + monthNbr +
                ", bill=" + bill +
                ", transType='" + transType + '\'' +
                ", txnDatetime=" + txnDatetime +
                '}';
    }
}
