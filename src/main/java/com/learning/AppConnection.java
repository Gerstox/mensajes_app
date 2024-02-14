package com.learning;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AppConnection {
    public Connection get_connection() {
        Connection connection = null;

        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mensajes_app", "root", "Root.123");
            if (connection != null) {
                System.out.println("Connected");
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return connection;
    }
}
