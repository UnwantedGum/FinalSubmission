
package com.mark.admin;

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


public class UpdateUser extends javax.swing.JFrame {


    public UpdateUser() {
        initComponents();
    }
    
    Color navcolor = new Color(51,51,51);
    Color hovercolor = new Color(153,153,153);
    
 public static String email;
 public static String username;
 
    public boolean duplicateChecker(){
    dbConnector dbc = new dbConnector();
    //Checks a duplicate....
    try{
         String query= "SELECT * FROM users_table WHERE username = '"+txtusername.getText()+
                 "'OR email = '"+txtemail.getText()+"'  ";
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
        add = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        CBstatus = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        CBType = new javax.swing.JComboBox<>();
        ShowPass = new javax.swing.JCheckBox();
        txtpassword = new javax.swing.JPasswordField();
        jLabel13 = new javax.swing.JLabel();
        uid = new javax.swing.JTextField();
        Update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        refresh = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        AdminName = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        user_table = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        log_out = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

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
        jLabel7.setBounds(40, 80, 100, 24);

        fname.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnameActionPerformed(evt);
            }
        });
        jPanel3.add(fname);
        fname.setBounds(40, 100, 290, 40);

        jLabel8.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel8.setText("Last Name");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(40, 150, 100, 24);

        lname.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnameActionPerformed(evt);
            }
        });
        jPanel3.add(lname);
        lname.setBounds(40, 170, 290, 40);

        jLabel10.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel10.setText("Email");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(40, 220, 60, 24);

        txtemail.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemailActionPerformed(evt);
            }
        });
        jPanel3.add(txtemail);
        txtemail.setBounds(40, 240, 290, 40);

        jLabel9.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel9.setText("Username");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(40, 290, 100, 24);

        txtusername.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusernameActionPerformed(evt);
            }
        });
        jPanel3.add(txtusername);
        txtusername.setBounds(40, 310, 290, 40);

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel4.setText("Password");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(40, 360, 90, 24);

        add.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add.setText("Add");
        add.setPreferredSize(new java.awt.Dimension(95, 29));
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        jPanel3.add(add);
        add.setBounds(400, 20, 110, 50);

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel2.setText("User Type");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(370, 370, 130, 20);

        CBstatus.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        CBstatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activated", "Pending" }));
        CBstatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBstatusActionPerformed(evt);
            }
        });
        jPanel3.add(CBstatus);
        CBstatus.setBounds(520, 390, 120, 40);

        jLabel11.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel11.setText("Account Status");
        jPanel3.add(jLabel11);
        jLabel11.setBounds(520, 370, 130, 20);

        CBType.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        CBType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "User", "Trainer" }));
        jPanel3.add(CBType);
        CBType.setBounds(370, 390, 120, 40);

        ShowPass.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ShowPass.setText("Show ");
        ShowPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowPassActionPerformed(evt);
            }
        });
        jPanel3.add(ShowPass);
        ShowPass.setBounds(40, 420, 90, 31);

        txtpassword.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel3.add(txtpassword);
        txtpassword.setBounds(40, 380, 290, 40);

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
        Update.setEnabled(false);
        Update.setPreferredSize(new java.awt.Dimension(95, 29));
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });
        jPanel3.add(Update);
        Update.setBounds(540, 20, 110, 50);

        delete.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        delete.setText("Delete");
        delete.setPreferredSize(new java.awt.Dimension(95, 29));
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel3.add(delete);
        delete.setBounds(400, 90, 110, 50);

        clear.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        clear.setText("Clear");
        clear.setPreferredSize(new java.awt.Dimension(95, 29));
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        jPanel3.add(clear);
        clear.setBounds(540, 90, 110, 50);

        cancel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cancel.setText("Cancel");
        cancel.setPreferredSize(new java.awt.Dimension(95, 29));
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        jPanel3.add(cancel);
        cancel.setBounds(540, 170, 110, 50);

        refresh.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        refresh.setText("Refresh");
        refresh.setPreferredSize(new java.awt.Dimension(95, 29));
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });
        jPanel3.add(refresh);
        refresh.setBounds(400, 170, 110, 50);

        jPanel4.add(jPanel3);
        jPanel3.setBounds(0, 70, 750, 580);

        jLabel6.setFont(new java.awt.Font("SansSerif", 2, 24)); // NOI18N
        jLabel6.setText("Update USER");
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

        AdminName.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        AdminName.setForeground(new java.awt.Color(255, 255, 255));
        AdminName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AdminName.setText("Admin");
        jPanel5.add(AdminName);
        AdminName.setBounds(0, 100, 250, 30);

        jPanel2.add(jPanel5);
        jPanel5.setBounds(0, 40, 250, 140);

        jPanel6.setBackground(new java.awt.Color(51, 51, 51));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("GENERAL");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jLabel3)
                .addContainerGap(88, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel6);
        jPanel6.setBounds(0, 190, 250, 50);

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
        jLabel5.setText("User Table");
        user_table.add(jLabel5);
        jLabel5.setBounds(66, 8, 115, 29);

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
           AdminName.setText(""+sess.getUsername()); 
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

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_refreshActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        AdminForm af = new AdminForm();
        af.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cancelActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
       fname.setText("");
       lname.setText("");
       uid.setText("");
       txtemail.setText("");
       txtusername.setText("");
       txtpassword.setText("");
    }//GEN-LAST:event_clearActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        dbConnector dbc = new dbConnector();
        dbc.updateData("UPDATE users_table SET u_fname = '"+fname.getText()+"', u_lname ='"+lname.getText()+"', "
            + "u_email = '"+txtemail.getText()+"', u_username = '"+txtusername.getText()+"', "
            + "u_type = '"+CBType.getSelectedItem()+"', u_status = '"+CBstatus.getSelectedItem()+"' WHERE u_id = '"+uid.getText()+"'");
        
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

    private void CBstatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBstatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBstatusActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        if(fname.getText().isEmpty() || lname.getText().isEmpty() || txtemail.getText().isEmpty()
            || txtpassword.getText().isEmpty()  || txtusername.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"All Fields should be filled out!");
        }else if(txtpassword.getText().length() < 8){
            JOptionPane.showMessageDialog(null,"Max password should be 8 characters or more.");
            txtpassword.setText("");
        }else if(duplicateChecker()){
            System.out.println("Duplicate Exists.");
        }else {
            dbConnector dbc = new dbConnector();

            try{
                String pass = TraumaPass.hashPassword(txtpassword.getText());

                if(dbc.insertData("INSERT INTO users_table"
                    + "(u_fname, u_lname, u_email,  u_password, u_username, u_type, u_status) "
                    + "VALUES('"+fname.getText()+"','"+lname.getText()+"', '"+txtemail.getText()+"', '"+pass+"',"
                    + "'"+txtusername.getText()+"', '"+CBType.getSelectedItem() +"', '"+CBstatus.getSelectedItem()+"') "))
            {
                JOptionPane.showMessageDialog(null, "Inserted Successfully");
            }else{
                JOptionPane.showMessageDialog(null, "Connection Error!");
            }
        }catch(NoSuchAlgorithmException ex){
            System.out.println(""+ex);
        }
        }
    }//GEN-LAST:event_addActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AdminName;
    public javax.swing.JComboBox<String> CBType;
    public javax.swing.JComboBox<String> CBstatus;
    private javax.swing.JCheckBox ShowPass;
    public javax.swing.JButton Update;
    public javax.swing.JButton add;
    public javax.swing.JButton cancel;
    public javax.swing.JButton clear;
    public javax.swing.JButton delete;
    public javax.swing.JTextField fname;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JPanel jPanel6;
    public javax.swing.JTextField lname;
    private javax.swing.JPanel log_out;
    public javax.swing.JButton refresh;
    public javax.swing.JTextField txtemail;
    public javax.swing.JPasswordField txtpassword;
    public javax.swing.JTextField txtusername;
    public javax.swing.JTextField uid;
    private javax.swing.JPanel user_table;
    // End of variables declaration//GEN-END:variables
}
