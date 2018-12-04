package com.neuedu.controller;

import com.neuedu.pojo.UserInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/portal/user/")
public class TestController {


    @RequestMapping(value = "login.do")
    public UserInfo login(){

        UserInfo userInfo=new UserInfo();
        userInfo.setId(1);
        userInfo.setUsername("zhangsan");
        return userInfo;
    }

}
