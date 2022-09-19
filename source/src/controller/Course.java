package controller;


import model.MyConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JComboBox;
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
public class Course {

    public void insertUpdateDeleteCourse(char operation, Integer id, String Cname, Integer hours) throws Exception {
        Connection con = MyConnection.getConnection();
        PreparedStatement ps;

        if (operation == 'i') {
            try {
                ps = con.prepareStatement("INSERT INTO `course`(`cname`, `hours_number`) VALUES (?,?)");
                ps.setString(1, Cname);
                ps.setInt(2, hours);

                if (ps.executeUpdate() > 0) {

                    JOptionPane.showMessageDialog(null, "New Course Added!", "Course Management", JOptionPane.INFORMATION_MESSAGE);

                }

            } catch (Exception e) {
                System.out.println("Error" + e.getMessage());
                JOptionPane.showMessageDialog(null, "error");
            }
        }
        if (operation == 'u') {
            try {
                ps = con.prepareStatement("UPDATE `course` SET `cname`= ?,`hours_number`= ? WHERE `id`= ? ");
                ps.setString(1, Cname);
                ps.setInt(2, hours);
                ps.setInt(3, id);

                if (ps.executeUpdate() > 0) {

                    JOptionPane.showMessageDialog(null, "Course Data Updated!", "Course Management", JOptionPane.INFORMATION_MESSAGE);

                }

            } catch (Exception e) {
                System.out.println("Error" + e.getMessage());
                JOptionPane.showMessageDialog(null, "error");
            }
        }
        if (operation == 'd') {
            int YesOrNo = JOptionPane.showConfirmDialog(null, "The Scores Will Also Be Deleted!!", "Delete Student", JOptionPane.OK_OPTION, 0);
            if (YesOrNo == 0) {
                try {
                    ps = con.prepareStatement("DELETE FROM `course` WHERE `id`= ? ");
                    ps.setInt(1, id);

                    if (ps.executeUpdate() > 0) {

                        JOptionPane.showMessageDialog(null, "Course Data Deleted!", "Course Management", JOptionPane.INFORMATION_MESSAGE);

                    }

                } catch (Exception e) {
                    System.out.println("Error" + e.getMessage());
                    JOptionPane.showMessageDialog(null, "error");
                }
            }
        }

    }

    public boolean isCourseExist(String courseName) throws Exception {
        boolean isExist = false;
        Connection con = MyConnection.getConnection();
        PreparedStatement ps;
        try {
            ps = con.prepareStatement("SELECT * FROM `course` WHERE `cname` = ?");
            ps.setString(1, courseName);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                isExist = true;
            }

        } catch (Exception e) {
        }
        return isExist;
    }

    public void fillCourseJtable(JTable table, String valueToSearch) throws Exception {
        Connection con = MyConnection.getConnection();
        PreparedStatement ps;
        try {
            ps = con.prepareStatement("SELECT * FROM `course`");
            ResultSet rs = ps.executeQuery();
            DefaultTableModel model = (DefaultTableModel) table.getModel();

            Object[] row;

            while (rs.next()) {
                row = new Object[3];
                row[0] = rs.getInt(1);
                row[1] = rs.getString(2);
                row[2] = rs.getInt(3);

                model.addRow(row);
            }

        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
        }

    }

    public int getCourseId(String courseLabel1) throws Exception {
        int courseId = 0;
        Connection con = MyConnection.getConnection();
        PreparedStatement ps;
        try {
            ps = con.prepareStatement("SELECT * FROM `course` WHERE `cname` = ?");
            ps.setString(1, courseLabel1);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                courseId = rs.getInt("id");
            }

        } catch (Exception e) {
        }
        return courseId;
    }

    public void fillCoursecombo(JComboBox combo) throws Exception {
        Connection con = MyConnection.getConnection();
        PreparedStatement ps;
        try {
            ps = con.prepareStatement("SELECT * FROM `course`");
            ResultSet rs = ps.executeQuery();
            ;

            while (rs.next()) {

                combo.addItem(rs.getString(2));

            }

        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
        }

    }
}
