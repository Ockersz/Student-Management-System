package controller;


import model.MyConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class score {

    public void insertUpdateDeleteScore(char operation, Integer Sid, Integer Cid, Double scr, String desc) throws Exception {
        Connection con = MyConnection.getConnection();
        PreparedStatement ps;

        if (operation == 'i') {
            try {
                ps = con.prepareStatement("INSERT INTO `score`(`student_id`, `course_id`, `student_score`, `descritption`) VALUES (?,?,?,?)");
                ps.setInt(1, Sid);
                ps.setInt(2, Cid);
                ps.setDouble(3, scr);
                ps.setString(4, desc);

                if (ps.executeUpdate() > 0) {

                    JOptionPane.showMessageDialog(null, "New Score Added!", "Score Management", JOptionPane.INFORMATION_MESSAGE);

                }

            } catch (Exception e) {
                System.out.println("Error" + e.getMessage());
                JOptionPane.showMessageDialog(null, "error");
            }
        }
        if (operation == 'u') {
            try {
                ps = con.prepareStatement("UPDATE `score` SET `student_score`=?,`descritption`=? WHERE `student_id` = ? AND `course_id` = ?");
                ps.setDouble(1, scr);
                ps.setString(2, desc);
                ps.setInt(3, Sid);
                ps.setInt(4, Cid);
                if (ps.executeUpdate() > 0) {

                    JOptionPane.showMessageDialog(null, "Score Updated!", "Course Management", JOptionPane.INFORMATION_MESSAGE);

                }

            } catch (Exception e) {
                System.out.println("Error" + e.getMessage());
                JOptionPane.showMessageDialog(null, "error");
            }
        }
        if (operation == 'd') {
            try {
                ps = con.prepareStatement("DELETE FROM `score` WHERE `student_id` = ? AND `course_id` = ?");
                ps.setInt(1, Sid);
                ps.setInt(2, Cid);

                if (ps.executeUpdate() > 0) {

                    JOptionPane.showMessageDialog(null, "Data Deleted!", "Course Management", JOptionPane.INFORMATION_MESSAGE);

                }

            } catch (Exception e) {
                System.out.println("Error" + e.getMessage());
                JOptionPane.showMessageDialog(null, "error");
            }
        }
    }

    public void fillScoreJtable(JTable table) throws Exception {
        Connection con = MyConnection.getConnection();
        PreparedStatement ps;
        try {
            ps = con.prepareStatement("SELECT * FROM `score`");
            ResultSet rs = ps.executeQuery();
            DefaultTableModel model = (DefaultTableModel) table.getModel();

            Object[] row;

            while (rs.next()) {
                row = new Object[5];
                row[0] = rs.getInt(1);
                row[1] = rs.getInt(2);
                row[2] = rs.getDouble(3);
                row[3] = rs.getString(4);

                model.addRow(row);
            }

        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
        }

    }

    public void ShowScoreJtable(JTable table) throws Exception {
        Connection con = MyConnection.getConnection();
        PreparedStatement ps;
        try {
            ps = con.prepareStatement("SELECT `student_id`,fname,lname,cname,student_score,descritption\n"
                    + "From `score`\n" + "INNER JOIN students as stab on stab.id = `student_id`\n"
                    + "INNER JOIN course as ctab on ctab.id = `course_id`");
            ResultSet rs = ps.executeQuery();
            DefaultTableModel model = (DefaultTableModel) table.getModel();

            Object[] row;

            while (rs.next()) {
                row = new Object[6];
                row[0] = rs.getInt(1);
                row[1] = rs.getString(2);
                row[2] = rs.getString(3);
                row[3] = rs.getString(4);
                row[4] = rs.getDouble(5);
                row[5] = rs.getString(6);

                model.addRow(row);
            }

        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
        }

    }
}
