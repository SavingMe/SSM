package com.mr.dao.impl;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BaseDaoImpl<T> {
    //1.声明SqlSessionFactory
    @Autowired
    private SqlSessionFactory sqlSessionFactory;
    //2.声明SqlSession
    protected SqlSession sqlSession;
    //3.声明 mapper 属性
    private Class<T> mapper;

    //4.为mapper 创建get  set
    public T getMapper() {
        return sqlSessionFactory.openSession().getMapper(mapper);
    }

    public void setMapper(Class<T> mapper) {
        this.mapper = mapper;
    }
}
