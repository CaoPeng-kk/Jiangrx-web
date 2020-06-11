package com.jiangrx.jiangrxweb.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.jiangrx.jiangrxweb.model.Transactioninfo;
import com.jiangrx.jiangrxweb.service.transaction.TransactionService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.jiangrx.jiangrxweb.common.ReturnT;

import java.time.LocalDateTime;

/**
 * @Author: caop
 * @Description: 交易信息Controller
 * @Date: Created in 22:45 2020/6/8
 */

@RestController
@CrossOrigin(allowCredentials = "true", allowedHeaders = "*")
public class WebController {

    @Autowired
    public TransactionService transactionService;

    @ApiOperation("交易信息查询接口")
    @GetMapping("/selectTransac")
    public ReturnT selectTransacInfo(@RequestParam("id") Integer id) {
        Transactioninfo transactioninfo = transactionService.selectTransInfoById(id);
        if (transactioninfo == null) {
            return new ReturnT("404","查询失败，无此id");
        }
        ReturnT<Transactioninfo> returnT = new ReturnT<>("200","successed",transactioninfo);
        return returnT;
    }

    @ApiOperation("交易信息展示接口")
    @GetMapping("/transac")
    public ReturnT showTransacInfo() {
        // 分页展示
        Page<Transactioninfo> transactioninfoPage = new Page<>(1,5);
        IPage<Transactioninfo> transactioninfoIPage = transactionService.selectUserPage(transactioninfoPage, null);
        if (transactioninfoIPage == null) {
            return new ReturnT("404","显示失败");
        }
        return new ReturnT<>("200","successed",transactioninfoIPage);
    }

    @ApiOperation("删除交易信息接口")
    @DeleteMapping("/transac")
    public ReturnT deleteTransacInfo(@RequestParam("id") Integer id) {
        int tag = transactionService.deleteById(id);
        if (tag == 0) {
            return ReturnT.failDesc("交易id不存在");
        }
        return ReturnT.okDesc("successed");
    }

    @ApiOperation("添加交易信息接口")
    @PostMapping("/transac")
    public ReturnT addTransacInfo(Transactioninfo transactioninfo) {
        if (transactioninfo == null) {
            ReturnT.failDesc("添加失败，不能为空");
        }
        transactioninfo.setTxnDatetime(LocalDateTime.now());
        int tag = transactionService.insertInfo(transactioninfo);
        if (tag == 0) {
            return ReturnT.failDesc("添加失败");
        }
        return ReturnT.ok("添加成功",200);
    }

    @ApiOperation("修改交易信息接口")
    @PutMapping("/transac")
    public ReturnT updateTransacInfo(@RequestBody Transactioninfo transactioninfo) {
        int tag = transactionService.updateById(transactioninfo);
        if (tag == 0) {
            return ReturnT.failDesc("修改失败");
        }
        return ReturnT.okDesc("修改成功");
    }

}

