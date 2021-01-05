package com.google.demo.dao.impl;

import com.google.demo.dao.BaseDao;
import com.google.demo.domain.quanxian;

import java.sql.ResultSet;

public class quanxianDaoImpl extends BaseDao {
    public int insert(quanxian quanXian) {
        return executeUpdate("insert into qx(id, qx_name) values(?, ?);",
                quanXian.getQuanXianId(), quanXian.getQuanXianName());
    }

    public int deleteByName(String name) {
        return executeUpdate("delete from qx where qx_name = ?;", name);
    }

    public int updateByName(int newId, String newName, String oldName) {
        return executeUpdate(
                "update qx set id = ? , qx_name = ? where qx_name = ?;",
                newId, newName, oldName);
    }

    public ResultSet selectAll() {
        return executeQuery("select * from qx");
    }

    public ResultSet selectByName(String name) {
        return executeQuery("select * from qx where qx_name = ?", name);
    }

    public ResultSet selectById(int id) {
        return executeQuery("select * from qx where id = ?", id);
    }
}
