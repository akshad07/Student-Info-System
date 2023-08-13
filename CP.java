package com.Student;

import java.sql.Connection;
import java.sql.DriverManager;

public class CP {
    static Connection con;
    //To Connecting Mysql DataBase Using JDBC
    public static Connection createC() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/Student";
            String username = "root";
            String password = "Akshad@07sp";
            con = DriverManager.getConnection(url, username, password);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
}
