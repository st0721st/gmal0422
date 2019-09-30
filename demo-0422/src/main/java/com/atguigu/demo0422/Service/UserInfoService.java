package com.atguigu.demo0422.Service;

import com.atguigu.demo0422.bean.UserInfo;

import java.util.List;

public interface UserInfoService {
    // 查询所有数据
    List<UserInfo> findAll();
    // 如何判断返回 loginName ,nickName,id
    List<UserInfo> findByUserInfo(UserInfo userInfo);
    // loginName 做模糊查询
    List<UserInfo> findByLoginName(String loginName);
    // 添加用户信息
    void addUser(UserInfo userInfo);
    // 修改用户数据
    void updUser(UserInfo userInfo);
    // 删除数据
    void delUser(UserInfo userInfo);

}
