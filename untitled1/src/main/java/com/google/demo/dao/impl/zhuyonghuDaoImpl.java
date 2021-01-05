package com.google.demo.dao.impl;

import DbUtil.BaseDao;
import com.google.demo.dao.zhuyonghuDao;
import com.google.demo.domain.zhuyonghu;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class zhuyonghuDaoImpl extends BaseDao implements zhuyonghuDao {
    @Override
    public List<zhuyonghuDao> findzyh(zhuyonghu a) {
        StringBuilder sql = new StringBuilder("selece * from zyh where 1=1 "); //创建查询语句
        List<Object> params = new ArrayList<>();
        if (a.getName() != null && !"".equals(a.getName())) {
            sql.append(" and name=?");
            params.add(a.getName());
        }
        if (a.getEmail()!=null){
            sql.append(" and email=?");
            params.add(a.getEmail());
        }
        if (a.getPassword()!=null){
            sql.append(" and password=?");
            params.add(a.getPassword());
        }
        if (a.getPhone()!=null){
            sql.append(" and phone=?");
            params.add(a.getPhone());
        }
        if (a.getZyhID()!=null){
            sql.append(" and id=?");
            params.add(a.getZyhID());
        }
        ResultSet resultSet = executeQuery(sql.toString(), params.toArray());
        List<zhuyonghuDao> name = new ArrayList<>();
        if (resultSet != null)
            try {
                while (resultSet.next())
                    name.add((zhuyonghuDao) new zhuyonghu(
                            resultSet.getInt(1),
                            resultSet.getString(2),
                            resultSet.getString(3),
                            resultSet.getInt(4),
                            resultSet.getString(5)
                    ));
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        return name;
    }

    @Override
    public int savezyh(zhuyonghu b) {
        String sql = "insert into zyh(id,name,password,phone,email)values(?,?,?,?,?)";
        return executeUpdate(sql, b.getZyhID(), b.getName(), b.getPassword(), b.getPhone(), b.getEmail());
    }
    
}
