package model;


import java.sql.Connection;
import java.sql.DriverManager;


public class MyConnection {
    
    public static Connection getConnection() throws Exception {

        String url = "jdbc:mysql://localhost:3306/nibm?autoReconnect=true&useSSL=false";

        Connection con = DriverManager.getConnection(url, "root", "");

        return con;
    }
}
