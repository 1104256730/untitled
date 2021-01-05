package com.google.demo.dao.impl;

import com.google.demo.dao.BaseDao;
import com.google.demo.domain.guanliyuan;

import java.sql.ResultSet;

public class guanliyuanDaoImpl extends BaseDao {
    public int insert(guanliyuan guanLiYuan) {
        return executeUpdate("insert into gl(gl_id, gl_name, qx) values(?, ?, ?);",
                guanLiYuan.getGuanLiYuanId(), guanLiYuan.getGuanLiYuanName(), guanLiYuan.getQuanXian());
    }

    public int deleteById(int id) {
        return executeUpdate("delete from gl where gl_id = ? ;", id);
    }

    public int updateById(int newId, String newName, String newQuanXian, int oldId) {
        return executeUpdate(
                "update gl set gl_id = ? , gl_name = ?, qx = ? where gl_id = ? ;",
                newId, newName, newQuanXian, oldId);
    }

    public ResultSet selectAll() {
        return executeQuery("select * from gl;");
    }

    public ResultSet selectById(int id) {
        return executeQuery("select * from gl where gl_id = ? ;", id);
    }

    public ResultSet selectByName(String name) {
        return executeQuery("select * from gl where gl_name = ? ;", name);
    }

    public ResultSet selectByQuanXian(String quanXian) {
        return executeQuery("select * from gl where qx = ? ;", quanXian);
    }
}
