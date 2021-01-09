package com.google.demo.dao.impl;

import DbUtil.BaseDao;
import com.google.demo.dao.zhuyonghuDao;
import com.google.demo.domain.zhuyonghu;

import java.sql.ResultSet;
import java.sql.SQLException;


public class zhuyonghuDaoimpl extends BaseDao implements zhuyonghuDao {
    @Override
    public boolean findzyh(zhuyonghu a) throws SQLException {
        StringBuilder sql = new StringBuilder("selece * from zyh name=? "); //创建查询语句
        ResultSet resultSet = executeQuery(String.valueOf(sql), a.getName());
        return resultSet.next();
    }
    @Override
    public int savezyh(zhuyonghu b) {
        String sql = "insert into zyh(id,name,password,phone,email)values(?,?,?,?,?)";
        return executeUpdate(sql, b.getZyhID(), b.getName(), b.getPassword(), b.getPhone(), b.getEmail());
    }

}
