package com.learning;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {

        AppConnection appConnection = new AppConnection();

        try (Connection cnx = appConnection.get_connection()) {

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}