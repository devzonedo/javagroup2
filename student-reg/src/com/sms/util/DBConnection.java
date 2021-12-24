package com.sms.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    public Connection getConnection() {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sms_eng_db", "root", "123");
            System.out.println("db connected.....");
        } catch (Exception e) {
            System.err.println("Error in db connection");
            e.printStackTrace();
        }
        return con;
    }
    
    
    public static void main(String[] args) {
        DBConnection dbConnection = new DBConnection();
        dbConnection.getConnection();
    }

}
