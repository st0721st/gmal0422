package com.atguigu.demo0422.controller;

import com.atguigu.demo0422.Service.UserInfoService;
import com.atguigu.demo0422.bean.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserInfoController {


    @Autowired
    UserInfoService userService;

    @RequestMapping("findAll")
    @ResponseBody // 返回json 数据 ，将数据直接显示到页面！【jackson.jar】
    public List<UserInfo> findAll(){
        return userService.findAll();
    }

    // http://localhost:8080/findByUserInfo?loginName=atguigu
    @RequestMapping("findByUserInfo")
    @ResponseBody // 返回json 数据 ，将数据直接显示到页面！【jackson.jar】
    public List<UserInfo> findByUserInfo(UserInfo userInfo){
        return userService.findByUserInfo(userInfo);
    }

    // http://localhost:8080/findByUserInfo?loginName=atguigu
    /*
        xxx.jsp
    <form action="findByLoginName" method="post">
        <input type="text" name="loginName"/>
        <input type-="submit" value="提交"/>
    </form>

     */
    @RequestMapping("findByLoginName")
    @ResponseBody // 返回json 数据 ，将数据直接显示到页面！【jackson.jar】
    public List<UserInfo> findByLoginName(UserInfo userInfo,String loginName){
        // 获取loginName springmvc 对象传值！
        return userService.findByLoginName(userInfo.getLoginName());
    }
    // http://localhost:8080/addUser
    @RequestMapping("addUser")
    @ResponseBody // 返回json 数据 ，将数据直接显示到页面！【jackson.jar】
    public void addUser(UserInfo userInfo){
        userInfo.setNickName("boy");
        userInfo.setLoginName("admin-boy");
        userInfo.setPasswd("666");

        userService.addUser(userInfo);
    }
    // 根据用户Id 更改name
    // http://localhost:8080/updUser?id=4&name=atguiguboy
    // http://localhost:8080/updUser?name=atguiguboy&loginName=updboy
    @RequestMapping("updUser")
    @ResponseBody // 返回json 数据 ，将数据直接显示到页面！【jackson.jar】
    public void updUser(UserInfo userInfo){
        // userService.updUser(userInfo);

        userService.updUser(userInfo);
    }
    // http://localhost:8080/delUser?id=4
    // http://localhost:8080/delUser?name=张三

    @RequestMapping("delUser")
    @ResponseBody // 返回json 数据 ，将数据直接显示到页面！【jackson.jar】
    public void delUser(UserInfo userInfo){
        // userService.updUser(userInfo);

        userService.delUser(userInfo);
    }
}
