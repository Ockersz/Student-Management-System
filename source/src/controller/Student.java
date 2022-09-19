package controller;


import model.MyConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shenal Ockersz
 */
public class Student {
    
    public void insertUpdateDeleteStudent(char operation,Integer id,String fname, String lname, String bdate, String contact, String email, String address, String gender) throws Exception{
        Connection con = MyConnection.getConnection();
        PreparedStatement ps;
        
        if(operation == 'i'){
            try {
                ps = con.prepareStatement("INSERT INTO students(fname, lname, birthdate, contact, email, address, gender) VALUES (?,?,?,?,?,?,?)");
                ps.setString(1, fname);
                ps.setString(2, lname);
                ps.setString(3, bdate);
                ps.setString(4, contact);
                ps.setString(5, email);
                ps.setString(6, address);
                ps.setString(7, gender);
                
                if (ps.executeUpdate() > 0) {
                    
                     JOptionPane.showMessageDialog(null, "Student has been sucessfully registered!","Student Management", JOptionPane.INFORMATION_MESSAGE);
                     
                                    
                }
                
            } catch (Exception e) {
                System.out.println("Error" + e.getMessage());
               JOptionPane.showMessageDialog(null, "error");
            }
        }
        if(operation == 'u'){
            try {
                ps = con.prepareStatement("UPDATE `students` SET `fname`= ?,`lname`= ?,`birthdate`= ?,`contact`= ?,`email`= ?,`address`= ?,`gender`= ? WHERE `id`= ? ");
                ps.setString(1, fname);
                ps.setString(2, lname);
                ps.setString(3, bdate);
                ps.setString(4, contact);
                ps.setString(5, email);
                ps.setString(6, address);
                ps.setString(7, gender);
                ps.setInt(8,id );
                
                if (ps.executeUpdate() > 0) {
                     
                     JOptionPane.showMessageDialog(null, "Student Data Updated!","Student Management", JOptionPane.INFORMATION_MESSAGE);
                     
                                    
                }
                
            } catch (Exception e) {
                System.out.println("Error" + e.getMessage());
               JOptionPane.showMessageDialog(null, "error");
            }
        }
        if(operation == 'd'){
            
            int YesOrNo = JOptionPane.showConfirmDialog(null,"The Scores Will Also Be Deleted!!","Delete Student",JOptionPane.OK_OPTION,0);
            if(YesOrNo == 0){
                 try {
                ps = con.prepareStatement("DELETE FROM `students` WHERE `id`= ? ");
                ps.setInt(1,id );
                
                if (ps.executeUpdate() > 0) {
                    
                     JOptionPane.showMessageDialog(null, "Student Data Deleted!","Student Management", JOptionPane.INFORMATION_MESSAGE);
                     
                                    
                }
                
            } catch (Exception e) {
                System.out.println("Error" + e.getMessage());
               JOptionPane.showMessageDialog(null, "error");
            }
        }
      }
            
            
           
    }
    
    public void fillStudentJtable(JTable table, String valueToSearch) throws Exception
    {
        Connection con = MyConnection.getConnection();
        PreparedStatement ps;
        try {
             ps = con.prepareStatement("SELECT * FROM students WHERE CONCAT(fname,lname,contact,address)LIKE ?");
             ps.setString(1,"%"+valueToSearch+"%");
             
             ResultSet rs = ps.executeQuery();
             DefaultTableModel model = (DefaultTableModel)table.getModel();
             
             Object[] row;
             
             while(rs.next()){
                 row = new Object[8];
                 row[0] = rs.getInt(1);
                 row[1] = rs.getString(2);
                 row[2] = rs.getString(3);
                 row[3] = rs.getString(4);
                 row[4] = rs.getString(5);
                 row[5] = rs.getString(6);
                 row[6] = rs.getString(7);
                 row[7] = rs.getString(8);
                 
                 model.addRow(row);
             }
             
                     
                     
        } catch (Exception e) {
        }
       
    }
       
}
