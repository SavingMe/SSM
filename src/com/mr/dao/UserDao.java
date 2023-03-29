package com.mr.dao;

import com.mr.entity.UsersBean;

import java.util.List;

public interface UserDao {

    //查询User表中所有数据的方法
    List<UsersBean> getAllUser();

    //根据用户id 查询改用户所有信息
    List<UsersBean> getUserById(int uId);

    //修改方法
    void updUser(UsersBean usersBean);

    //删除方法
    void delUser(int uId);
}
