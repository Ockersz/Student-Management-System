package controller;


import model.MyConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class MyFunction {
    public static int countData(String tableName) throws Exception {
        int total=0;
        Connection con = MyConnection.getConnection();
        Statement st;
        try {
            st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT COUNT(*) AS 'total' FROM "+tableName);
            while(rs.next()){
                total = rs.getInt(1);
            }
        } catch (SQLException ex) {
             System.out.println("Error" + ex.getMessage());
        }
        
        
        
        
        
        return total;
    }
}