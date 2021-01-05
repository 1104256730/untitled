package com.google.demo.dao.impl;

import com.google.demo.dao.BaseDao;
import com.google.demo.domain.yonghu;

import java.sql.ResultSet;

public class yonghuDaoImpl extends BaseDao {
    public int insert(yonghu yongHu) {
        return executeUpdate("insert into yh(yh_id, yh_name, qx) values(?, ?, ?);",
                yongHu.getYhId(), yongHu.getYhName(), yongHu.getQx());
    }

    public int deleteById(int id) {
        return executeUpdate("delete from yh where yh_id = ? ;", id);
    }

    public int updateById(int newId, String newName, String newQuanXian, int oldId) {
        return executeUpdate(
                "update yh set yh_id = ? , yh_name = ? , qx = ? where yh_id = ? ;",
                newId, newName, newQuanXian, oldId);
    }

    public ResultSet selectAll() {
        return executeQuery("select * from yh;");
    }

    public ResultSet selectById(int id) {
        return executeQuery("select * from yh where yh_id = ? ", id);
    }

    public ResultSet selectByName(String name) {
        return executeQuery("select * from yh where yh_name = ? ;", name);
    }

    public ResultSet selectByQuanXian(String quanXian) {
        return executeQuery("select * from yh where qx = ? ;", quanXian);
    }
}
