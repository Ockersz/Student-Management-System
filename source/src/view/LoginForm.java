package view;


import controller.MyFunction;
import model.MyConnection;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;



/**
 *
 * @author Senadi Medis
 */
public class LoginForm extends javax.swing.JFrame {

    /**
     * Creates new form LoginForm
     */
    public LoginForm() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField_username = new javax.swing.JTextField();
        jPasswordField_password = new javax.swing.JPasswordField();
        jButton_cancel = new javax.swing.JButton();
        jButton_login1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel_minimize = new javax.swing.JLabel();
        jLabel_exit = new javax.swing.JLabel();
        jLabel_newaccount = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(44, 62, 80));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Username:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Password:");

        jTextField_username.setBackground(new java.awt.Color(60, 63, 65));
        jTextField_username.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField_username.setForeground(new java.awt.Color(255, 255, 255));

        jPasswordField_password.setBackground(new java.awt.Color(60, 63, 65));
        jPasswordField_password.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPasswordField_password.setForeground(new java.awt.Color(255, 255, 255));
        jPasswordField_password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordField_passwordKeyPressed(evt);
            }
        });

        jButton_cancel.setBackground(new java.awt.Color(192, 57, 43));
        jButton_cancel.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jButton_cancel.setForeground(new java.awt.Color(0, 0, 0));
        jButton_cancel.setText("Cancel");
        jButton_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_cancelActionPerformed(evt);
            }
        });

        jButton_login1.setBackground(new java.awt.Color(34, 167, 240));
        jButton_login1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jButton_login1.setForeground(new java.awt.Color(0, 0, 0));
        jButton_login1.setText("Login");
        jButton_login1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_login1ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 102, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Login Form");
        jLabel1.setToolTipText("");

        jLabel_minimize.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel_minimize.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_minimize.setText("-");
        jLabel_minimize.setToolTipText("");
        jLabel_minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_minimizeMouseClicked(evt);
            }
        });

        jLabel_exit.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel_exit.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_exit.setText("X");
        jLabel_exit.setToolTipText("");
        jLabel_exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_exitMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel_minimize)
                .addGap(18, 18, 18)
                .addComponent(jLabel_exit)
                .addGap(21, 21, 21))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel_minimize)
                    .addComponent(jLabel_exit))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jLabel_newaccount.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_newaccount.setText("Click here to create a new account");
        jLabel_newaccount.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_newaccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_newaccountMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField_username, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordField_password, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(172, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jButton_login1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel_newaccount, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField_username, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordField_password, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_login1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_newaccount)
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void jButton_login1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_login1ActionPerformed
        try {
           
            Connection con = MyConnection.getConnection();
            PreparedStatement ps;
            
            ps = con.prepareStatement("SELECT * FROM `user` WHERE username = ? AND password = ?");
            ps.setString(1,jTextField_username.getText());
            ps.setString(2,String.valueOf(jPasswordField_password.getPassword()));
            
            ResultSet rs = ps.executeQuery();
            
//            
// String userValue = jTextField_username.getText();
// String passValue = jPasswordField_password.getText();
// 
//
//
//                if(userValue.equals("test1") && passValue.equals("test")){
                if(rs.next()){
                MainForm mf = new MainForm();
                mf.setVisible(true);
                mf.pack();
                mf.setLocationRelativeTo(null);
                MainForm.jLabel_username.setText("Welcome "+jTextField_username.getText());
                MainForm.jLabel_stdcount.setText("Student Count = "+Integer.toString(MyFunction.countData("students")));
                MainForm.jLabel_crscount.setText("Course Count = "+Integer.toString(MyFunction.countData("user")));
                this.dispose();
            }else{
                JOptionPane.showMessageDialog(null, "Username or Password incorrect","Login Failed",2);
            }
            
            
        } catch (Exception ex) {
           Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE,null,ex);
        }
        
    }//GEN-LAST:event_jButton_login1ActionPerformed

    private void jLabel_exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel_exitMouseClicked

    private void jLabel_minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_minimizeMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel_minimizeMouseClicked

    private void jLabel_newaccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_newaccountMouseClicked
      RegisterForm rgf = new RegisterForm();
      rgf.setVisible(true);
      rgf.pack();
      rgf.setLocationRelativeTo(null);
      rgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.dispose();
    }//GEN-LAST:event_jLabel_newaccountMouseClicked

    private void jButton_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_cancelActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton_cancelActionPerformed

    private void jPasswordField_passwordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField_passwordKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            try {
           
            Connection con = MyConnection.getConnection();
            PreparedStatement ps;
            
            ps = con.prepareStatement("SELECT * FROM `user` WHERE username = ? AND password = ?");
            ps.setString(1,jTextField_username.getText());
            ps.setString(2,String.valueOf(jPasswordField_password.getPassword()));
            
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                MainForm mf = new MainForm();
                mf.setVisible(true);
                mf.pack();
                mf.setLocationRelativeTo(null);
                MainForm.jLabel_username.setText("Welcome "+jTextField_username.getText());
                MainForm.jLabel_stdcount.setText("Student Count = "+Integer.toString(MyFunction.countData("students")));
                MainForm.jLabel_crscount.setText("Course Count = "+Integer.toString(MyFunction.countData("course")));
                this.dispose();
            }else{
                JOptionPane.showMessageDialog(null, "Username or Password incorrect");
            }
            
            
        } catch (Exception ex) {
           Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE,null,ex);
        }
        }
    }//GEN-LAST:event_jPasswordField_passwordKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_cancel;
    private javax.swing.JButton jButton_login1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel_exit;
    private javax.swing.JLabel jLabel_minimize;
    private javax.swing.JLabel jLabel_newaccount;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField_password;
    private javax.swing.JTextField jTextField_username;
    // End of variables declaration//GEN-END:variables
}
