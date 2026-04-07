package com.example.soap;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static final String URL = "jdbc:mysql://143.110.188.58:3306/db";
    private static final String USER = "root";
    private static final String PASSWORD = "mysqlloadtrip";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
