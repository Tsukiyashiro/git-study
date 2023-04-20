package com.jdbcpool;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCUtil {
    private JDBCUtil(){}

    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://11.99.16.102/hainiu?useSSL=false&characterEncoding=UTF-8";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "hainiu";

    private static DruidDataSource dataSource = null;

    static {
        dataSource = new DruidDataSource();
        dataSource.setDriverClassName(DRIVER);
        dataSource.setUrl(URL);
        dataSource.setUsername(USERNAME);
        dataSource.setPassword(PASSWORD);
    }

    public static Connection getConnection(){
        DruidPooledConnection conn = null;
        try {
            conn = dataSource.getConnection();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return conn;
    }

    public static void close(ResultSet resultSet, Statement statement, Connection connection) throws SQLException {
        if (resultSet != null){
            resultSet.close();
        }if (statement != null){
            statement.close();
        }if (connection != null){
            connection.close();
        }
    }

    public static void close(Statement statement, Connection connection) throws SQLException {
        close(null,statement, connection);
    }
}
