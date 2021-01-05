package com.google.demo.dao.impl;

import com.google.demo.dao.BaseDao;
import com.google.demo.domain.chaojiguanliyuan;

import java.sql.ResultSet;

public class chaojiguanliyuanDaoImpl extends BaseDao {
    public int insert(chaojiguanliyuan chaoJiGuanLiYuan) {
        return executeUpdate("insert into cjgl(cjgl_id, cjgl_name, qx) values(?, ?, ?);",
                chaoJiGuanLiYuan.getChaoJiGuanLiYuanId(),
                chaoJiGuanLiYuan.getChaoJiGuanLiYuanName(),
                chaoJiGuanLiYuan.getQuanXian());
    }

    public int deleteById(int id) {
        return executeUpdate("delete from cjgl where cjgl_id = ? ;", id);
    }

    public int updateById(int newId, String newName, String newQuanXian, int oldId) {
        return executeUpdate(
                "update cjgl set cjgl_id = ? , cjgl_name = ?, qx = ? where cjgl_id = ? ;",
                newId, newName, newQuanXian, oldId);
    }

    public ResultSet selectAll() {
        return executeQuery("select * from cjgl");
    }

    public ResultSet selectById(int id) {
        return executeQuery("select * from cjgl where cjgl_id = ? ;", id);
    }

    public ResultSet selectByName(String name) {
        return executeQuery("select * from cjgl where cjgl_name = ? ;", name);
    }

    public ResultSet selectByQuanXian(String quanXian) {
        return executeQuery("select * from cjgl where qx = ? ;", quanXian);
    }
}