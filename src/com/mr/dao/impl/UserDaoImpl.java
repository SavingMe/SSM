package com.mr.dao.impl;


import com.mr.dao.UserDao;
import com.mr.entity.UsersBean;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class UserDaoImpl extends BaseDaoImpl<UserDao> implements UserDao {
    //构造函数调用父类的构造方法
    public UserDaoImpl() {
        super();

        this.setMapper(UserDao.class);
    }

    //查询所有用户
    @Override
    public List<UsersBean> getAllUser() {
        // TODO Auto-generated method stub
        return this.getMapper().getAllUser();
    }

    //根据用户ID查询用户信息
    public List<UsersBean> getUserById(int id) {
        return this.getMapper().getUserById(id);
    }

    //修改用户信息
    public void updUser(UsersBean usersBean) {
        this.getMapper().updUser(usersBean);
    }

    //删除用户
    @Override
    public void delUser(int uId) {
        this.getMapper().delUser(uId);
    }
}
