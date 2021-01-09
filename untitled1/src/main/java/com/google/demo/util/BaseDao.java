package com.google.demo.util;


import java.sql.*;

public class BaseDao {
    //我们希望他能执行一切sql语句
    private static Connection connection;
    private static PreparedStatement preparedStatement;

    {
        try {                                              //获取驱动和链接
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "v3", "Zkgws123");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public static  Connection getConnection() {
        if (connection == null) {                         //获取连接
            try {
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "v3", "Zkgws123");
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return connection;
    }

    public ResultSet executeQuery(String sql, Object... params) {
        connection = getConnection();                              //获取连接
        try {
            preparedStatement = connection.prepareStatement(sql);   //创建预备语句
            for (int i = 0; i < params.length; i++)
                preparedStatement.setObject(i + 1, params[i]);
            return preparedStatement.executeQuery();               //返回完整查询语句

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    public int executeUpdate(String sql, Object... params) {
        connection = getConnection();
        try {
            preparedStatement = connection.prepareStatement(sql);
            for (int i = 0; i < params.length; i++)
                preparedStatement.setObject(i + 1, params[i]);
            return preparedStatement.executeUpdate();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return -1;
    }

}

