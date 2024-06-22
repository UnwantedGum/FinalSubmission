
package com.mark.user;

import com.mark.admin.*;
import com.mark.config.Session;
import com.mark.config.TraumaPass;
import com.mark.config.dbConnector;
import com.mark.main.LoginForm;
import java.awt.Color;
import java.security.NoSuchAlgorithmException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class UpdateUserAcc extends javax.swing.JFrame {


    public UpdateUserAcc() {
        initComponents();
    }
    
    Color navcolor = new Color(51,51,51);
    Color hovercolor = new Color(153,153,153);
    
 public static String email;
 public static String username;
 
     public boolean updateChecker(){
    dbConnector dbc = new dbConnector();
    //Checks a duplicate....
    try{
         String query= "SELECT * FROM users_table WHERE (username = '"+txtusername.getText()+"'OR email = '"+txtemail.getText()+"') "
                 + "AND u_id != '"+uid.getText()+"'  ";
            ResultSet resultSet = dbc.getData(query);

        if(resultSet.next()){
            //email duplicate checker
            email=resultSet.getString("email");
            if(email.equals(txtemail.getText())){
                JOptionPane.showMessageDialog(null, "This Email is already in use. ");
                txtemail.setText("");
            }
            //Username duplicate checker
            username=resultSet.getString("u_username");
             if(username.equals(txtusername.getText())){
                JOptionPane.showMessageDialog(null, "This Username is already in use. ");
                txtusername.setText("");
            }
             
            return true;
        }else{
            return false;
        }
    }catch(SQLException ex){
        System.out.println(""+ex);
        return false;
    }
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        lname = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtusername = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        ShowPass = new javax.swing.JCheckBox();
        txtpassword = new javax.swing.JPasswordField();
        jLabel13 = new javax.swing.JLabel();
        uid = new javax.swing.JTextField();
        Update = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Username = new javax.swing.JLabel();
        user_table = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        log_out = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        setting = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));
        jPanel2.setLayout(null);

        jPanel4.setBackground(new java.awt.Color(204, 255, 204));
        jPanel4.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jPanel3.setPreferredSize(new java.awt.Dimension(750, 580));
        jPanel3.setLayout(null);

        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel7.setText("First Name");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(370, 10, 100, 24);

        fname.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnameActionPerformed(evt);
            }
        });
        jPanel3.add(fname);
        fname.setBounds(370, 30, 290, 40);

        jLabel8.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel8.setText("Last Name");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(40, 80, 100, 24);

        lname.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnameActionPerformed(evt);
            }
        });
        jPanel3.add(lname);
        lname.setBounds(40, 100, 290, 40);

        jLabel10.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel10.setText("Email");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(370, 80, 60, 24);

        txtemail.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemailActionPerformed(evt);
            }
        });
        jPanel3.add(txtemail);
        txtemail.setBounds(370, 100, 290, 40);

        jLabel9.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel9.setText("Username");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(40, 150, 100, 24);

        txtusername.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusernameActionPerformed(evt);
            }
        });
        jPanel3.add(txtusername);
        txtusername.setBounds(40, 170, 290, 40);

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel4.setText("Password");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(370, 150, 90, 24);

        ShowPass.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ShowPass.setText("Show ");
        ShowPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowPassActionPerformed(evt);
            }
        });
        jPanel3.add(ShowPass);
        ShowPass.setBounds(370, 210, 90, 31);

        txtpassword.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel3.add(txtpassword);
        txtpassword.setBounds(370, 170, 290, 40);

        jLabel13.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel13.setText("User ID");
        jPanel3.add(jLabel13);
        jLabel13.setBounds(40, 10, 100, 24);

        uid.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        uid.setEnabled(false);
        uid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uidActionPerformed(evt);
            }
        });
        jPanel3.add(uid);
        uid.setBounds(40, 30, 290, 40);

        Update.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Update.setText("Update");
        Update.setPreferredSize(new java.awt.Dimension(95, 29));
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });
        jPanel3.add(Update);
        Update.setBounds(50, 350, 110, 50);

        cancel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cancel.setText("Cancel");
        cancel.setPreferredSize(new java.awt.Dimension(95, 29));
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        jPanel3.add(cancel);
        cancel.setBounds(180, 350, 110, 50);

        jPanel4.add(jPanel3);
        jPanel3.setBounds(0, 70, 750, 580);

        jLabel6.setFont(new java.awt.Font("SansSerif", 2, 24)); // NOI18N
        jLabel6.setText("User Account Settings");
        jPanel4.add(jLabel6);
        jLabel6.setBounds(15, 16, 360, 32);

        jPanel2.add(jPanel4);
        jPanel4.setBounds(250, 40, 750, 650);

        jPanel5.setBackground(new java.awt.Color(102, 102, 102));
        jPanel5.setLayout(null);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/software-engineer.png"))); // NOI18N
        jPanel5.add(jLabel1);
        jLabel1.setBounds(0, 0, 250, 90);

        Username.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Username.setForeground(new java.awt.Color(255, 255, 255));
        Username.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Username.setText("User");
        jPanel5.add(Username);
        Username.setBounds(0, 100, 250, 40);

        jPanel2.add(jPanel5);
        jPanel5.setBounds(0, 40, 250, 140);

        user_table.setBackground(new java.awt.Color(51, 51, 51));
        user_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                user_tableMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                user_tableMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                user_tableMouseExited(evt);
            }
        });
        user_table.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Home");
        user_table.add(jLabel5);
        jLabel5.setBounds(82, 10, 90, 29);

        jPanel2.add(user_table);
        user_table.setBounds(0, 250, 250, 50);

        log_out.setBackground(new java.awt.Color(51, 51, 51));
        log_out.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                log_outMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                log_outMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                log_outMouseExited(evt);
            }
        });
        log_out.setLayout(null);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("LOGOUT");
        log_out.add(jLabel12);
        jLabel12.setBounds(87, 16, 70, 22);

        jPanel2.add(log_out);
        log_out.setBounds(0, 510, 250, 50);

        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(920, 10, 30, 30);

        jButton1.setBackground(new java.awt.Color(204, 0, 0));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(960, 10, 30, 30);

        setting.setBackground(new java.awt.Color(51, 51, 51));
        setting.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                settingMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                settingMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                settingMouseExited(evt);
            }
        });
        setting.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("SETTINGS");
        setting.add(jLabel3);
        jLabel3.setBounds(80, 0, 90, 50);

        jPanel2.add(setting);
        setting.setBounds(0, 190, 250, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        Session sess = Session.getInstance();
        
        if(sess.getUid()== 0){
            JOptionPane.showMessageDialog(null, "No Account Found, Please Log in");
            LoginForm lf = new LoginForm();
            lf.setVisible(true);
            this.dispose();
        }else{
           Username.setText(""+sess.getUsername());
           uid.setText(""+sess.getUid());
           fname.setText(""+sess.getFname());
           lname.setText(""+sess.getLname());
           txtemail.setText(""+sess.getEmail());
           txtusername.setText(""+sess.getUsername());
           txtpassword.setText(""+sess.getPass());
                       }     
    }//GEN-LAST:event_formWindowActivated

    private void user_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user_tableMouseClicked
        AdminForm aur = new AdminForm ();
        aur.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_user_tableMouseClicked

    private void log_outMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_log_outMouseClicked
        LoginForm lgf = new LoginForm();
        lgf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_log_outMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void user_tableMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user_tableMouseEntered
         user_table.setBackground(hovercolor);
    }//GEN-LAST:event_user_tableMouseEntered

    private void user_tableMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user_tableMouseExited
        user_table.setBackground(navcolor);
    }//GEN-LAST:event_user_tableMouseExited

    private void log_outMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_log_outMouseEntered
         log_out.setBackground(hovercolor);
    }//GEN-LAST:event_log_outMouseEntered

    private void log_outMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_log_outMouseExited
         log_out.setBackground(navcolor);
    }//GEN-LAST:event_log_outMouseExited

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        UserForm af = new UserForm();
        af.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cancelActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
         if(fname.getText().isEmpty() || lname.getText().isEmpty() || txtemail.getText().isEmpty()
            || txtpassword.getText().isEmpty()  || txtusername.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"All Fields should be filled out!");
        }else if(txtpassword.getText().length() > 8){
            JOptionPane.showMessageDialog(null,"Max password should be 8 characters or more.");
            txtpassword.setText("");
        }else if(updateChecker()){
            System.out.println("Duplicate Exists.");
        }else {
        
        dbConnector dbc = new dbConnector();
        dbc.updateData("UPDATE users_table SET u_fname = '"+fname.getText()+"', u_lname ='"+lname.getText()+"', "
            + "u_email = '"+txtemail.getText()+"', u_username = '"+txtusername.getText()+"', u_password = '"+txtpassword+"' WHERE u_id = '"+uid.getText()+"'");
        }
    }//GEN-LAST:event_UpdateActionPerformed

    private void uidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uidActionPerformed

    private void ShowPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowPassActionPerformed
        if(ShowPass.isSelected()){
            txtpassword.setEchoChar((char)0);
        }else{
            txtpassword.setEchoChar('*');
        }
    }//GEN-LAST:event_ShowPassActionPerformed

    private void txtusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusernameActionPerformed

    private void txtemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtemailActionPerformed

    private void lnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lnameActionPerformed

    private void fnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnameActionPerformed

    private void settingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingMouseClicked
        UpdateUserAcc uua = new UpdateUserAcc();
        uua.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_settingMouseClicked

    private void settingMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingMouseEntered
        setting.setBackground(hovercolor);
    }//GEN-LAST:event_settingMouseEntered

    private void settingMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingMouseExited
        setting.setBackground(navcolor);
    }//GEN-LAST:event_settingMouseExited

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
            java.util.logging.Logger.getLogger(UpdateUserAcc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateUserAcc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateUserAcc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateUserAcc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateUserAcc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox ShowPass;
    public javax.swing.JButton Update;
    private javax.swing.JLabel Username;
    public javax.swing.JButton cancel;
    public javax.swing.JTextField fname;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    public javax.swing.JTextField lname;
    private javax.swing.JPanel log_out;
    private javax.swing.JPanel setting;
    public javax.swing.JTextField txtemail;
    public javax.swing.JPasswordField txtpassword;
    public javax.swing.JTextField txtusername;
    public javax.swing.JTextField uid;
    private javax.swing.JPanel user_table;
    // End of variables declaration//GEN-END:variables
}
