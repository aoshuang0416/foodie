package com.imooc.controller;

import com.imooc.mapper.UserInfoMapper;
import com.imooc.pojo.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {
    @Autowired
    private UserInfoMapper userInfoMapper;
    @GetMapping("hello")
    public String hello(){
        return "hello SpringBoot!!";
    }

    @GetMapping("queryAll")
    public List<UserInfo> queryAll(){
        return userInfoMapper.queryAll();
    }
}
