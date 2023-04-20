package com.jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.Locale;


public class Demo02 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");

        String url = "jdbc:mysql://11.94.204.66:3306/hainiu?useSSL=false&characterEncoding=UTF-8";
        String username = "root";
        String password = "hainiu";

        Connection connection = DriverManager.getConnection(url, username, password);

        String sql = "select cid, cname from category;";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);

        ArrayList<Category> list = new ArrayList<>();

        while (resultSet.next()) {
            int cid = resultSet.getInt("cid");
            String cname = resultSet.getString("cname");
            Category category = new Category(cid, cname);
            list.add(category);
        }
        for (Category category : list) {
            System.out.println(category);
        }
        resultSet.close();
        statement.close();
        connection.close();
    }
}
