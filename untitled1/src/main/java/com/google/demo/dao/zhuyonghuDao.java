package com.google.demo.dao;

import com.google.demo.domain.zhuyonghu;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface zhuyonghuDao {
    boolean findzyh(zhuyonghu a) throws SQLException;
    int savezyh(zhuyonghu b);
    
}
