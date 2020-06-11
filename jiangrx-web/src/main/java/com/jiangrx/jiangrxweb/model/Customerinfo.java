package com.jiangrx.jiangrxweb.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author jobob
 * @since 2020-06-06
 */
@ApiModel("用户信息实体类")
public class Customerinfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 客户号
     */
    @TableId(value = "cust_id", type = IdType.AUTO)
    private Integer custId;

    /**
     * 客户姓名
     */
    private String surname;

    /**
     * 性别
     */
    private String gender;

    /**
     * 教育状况
     */
    private String educaDes;

    /**
     * 婚姻状况
     */
    private String marDes;

    /**
     * 生日
     */
    private Integer birthday;

    /**
     * 住址
     */
    private String address;

    public void setCustId(Integer custId) {
        this.custId = custId;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEducaDes() {
        return educaDes;
    }

    public void setEducaDes(String educaDes) {
        this.educaDes = educaDes;
    }

    public String getMarDes() {
        return marDes;
    }

    public void setMarDes(String marDes) {
        this.marDes = marDes;
    }

    public Integer getBirthday() {
        return birthday;
    }

    public void setBirthday(Integer birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customerinfo{" +
                "custId=" + custId +
                ", surname='" + surname + '\'' +
                ", gender='" + gender + '\'' +
                ", educaDes='" + educaDes + '\'' +
                ", marDes='" + marDes + '\'' +
                ", birthday=" + birthday +
                ", address='" + address + '\'' +
                '}';
    }
}
