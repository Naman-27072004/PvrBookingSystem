package com.jims.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB {
    private DB() {
    }

    public static Connection createConnection() throws ClassNotFoundException, SQLException {
        // Step - 1 Load a Driver Class
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookingdb", "root",
                "Naman_27072004@");
        if (connection != null) {
            System.out.println("Connection Created..");
        }
        return connection;
    }
}