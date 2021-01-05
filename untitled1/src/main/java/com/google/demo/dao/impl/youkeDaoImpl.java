package com.google.demo.dao.impl;

import com.google.demo.dao.BaseDao;
import com.google.demo.domain.youke;

import java.sql.ResultSet;

public class youkeDaoImpl extends BaseDao {
    public int insert(youke youKe) {
        return executeUpdate("insert into yk(yk_id, yk_name, qx) values(?, ?, ?);",
                youKe.getYhID(), youKe.getYhName(), youKe.getQx());
    }

    public int deleteById(int id) {
        return executeUpdate("delete from yk where yk_id = ? ;", id);
    }

    public int updateById(int newId, String newName, String newQuanXian, int oldId) {
        return executeUpdate(
                "update yk set yk_id = ? , yk_name = ?, qx = ? where yk_id = ? ;",
                newId, newName, newQuanXian, oldId);
    }

    public ResultSet selectAll() {
        return executeQuery("select * from yk");
    }

    public ResultSet selectById(int id) {
        return executeQuery("select * from yk where yk_id = ? ", id);
    }

    public ResultSet selectByName(String name) {
        return executeQuery("select * from yk where yk_name = ?", name);
    }

    public ResultSet selectByQuanXian(String quanXian) {
        return executeQuery("select * from yk where qx = ?", quanXian);
    }
}
