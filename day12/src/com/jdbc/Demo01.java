package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo01 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");

        String url = "jdbc:mysql://11.94.204.66:3306/hainiu?useSSL=false&characterEncoding=UTF-8";
        String username = "root";
        String password = "hainiu";

        Connection connection = DriverManager.getConnection(url, username, password);

        String sql = "insert into category(cid, cname) values (8, '电子书');";
        Statement statement = connection.createStatement();
        int i = statement.executeUpdate(sql);
        System.out.println("共" + i + "条数据受影响");
        statement.close();
        connection.close();
    }
}
