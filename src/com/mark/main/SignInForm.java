package com.mark.main;

import com.mark.config.TraumaPass;
import com.mark.config.dbConnector;
import java.security.NoSuchAlgorithmException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class SignInForm extends javax.swing.JFrame {

    public SignInForm() {
        initComponents();
    }
 public static String email;
 public static String username;
 
    public boolean duplicateChecker(){
    dbConnector dbc = new dbConnector();
    //Checks a duplicate....
    try{
         String query= "SELECT * FROM users_table WHERE u_username = '"+txtusername.getText()+
                 "'OR u_email = '"+txtemail.getText()+"'  ";
            ResultSet resultSet = dbc.getData(query);

        if(resultSet.next()){
            //email duplicate checker
            email=resultSet.getString("u_email");
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtfname = new javax.swing.JTextField();
        registerbttn = new javax.swing.JButton();
        loginbttn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtlname = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtusername = new javax.swing.JTextField();
        txtpassword = new javax.swing.JPasswordField();
        ShowPass = new javax.swing.JCheckBox();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setMinimumSize(new java.awt.Dimension(800, 510));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setPreferredSize(new java.awt.Dimension(400, 500));
        jPanel2.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/MainLogoo.png"))); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(72, 128, 256, 155);

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jPanel2.add(jLabel5);
        jLabel5.setBounds(304, 76, 0, 0);

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel6.setText("\"Begin your journey with us.\"");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(87, 344, 228, 24);

        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(310, 20, 30, 30);

        jButton1.setBackground(new java.awt.Color(204, 0, 0));
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jButton1.setPreferredSize(new java.awt.Dimension(33, 33));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(350, 20, 30, 30);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(400, 0, 400, 500);

        jPanel3.setBackground(new java.awt.Color(234, 233, 233));
        jPanel3.setPreferredSize(new java.awt.Dimension(400, 500));
        jPanel3.setLayout(null);

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabel2.setText("SIGN UP");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(126, 16, 147, 47);

        jLabel3.setText("Password");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(60, 310, 67, 20);

        txtfname.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtfname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfnameActionPerformed(evt);
            }
        });
        jPanel3.add(txtfname);
        txtfname.setBounds(60, 90, 290, 40);

        registerbttn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        registerbttn.setText("REGISTER");
        registerbttn.setPreferredSize(new java.awt.Dimension(95, 29));
        registerbttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerbttnActionPerformed(evt);
            }
        });
        jPanel3.add(registerbttn);
        registerbttn.setBounds(210, 420, 95, 29);

        loginbttn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        loginbttn.setText("LOG IN");
        loginbttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbttnActionPerformed(evt);
            }
        });
        jPanel3.add(loginbttn);
        loginbttn.setBounds(100, 420, 97, 29);

        jLabel7.setText("First Name");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(60, 70, 76, 20);

        txtlname.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtlname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtlnameActionPerformed(evt);
            }
        });
        jPanel3.add(txtlname);
        txtlname.setBounds(60, 150, 290, 40);

        jLabel8.setText("Last Name");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(60, 130, 74, 20);

        jLabel9.setText("Username");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(60, 250, 71, 20);

        txtemail.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemailActionPerformed(evt);
            }
        });
        jPanel3.add(txtemail);
        txtemail.setBounds(60, 210, 290, 40);

        jLabel10.setText("Email");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(60, 190, 39, 20);

        txtusername.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusernameActionPerformed(evt);
            }
        });
        jPanel3.add(txtusername);
        txtusername.setBounds(60, 270, 290, 40);

        txtpassword.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jPanel3.add(txtpassword);
        txtpassword.setBounds(60, 330, 290, 40);

        ShowPass.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ShowPass.setText("Show ");
        ShowPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowPassActionPerformed(evt);
            }
        });
        jPanel3.add(ShowPass);
        ShowPass.setBounds(60, 380, 80, 31);

        jLabel11.setFont(new java.awt.Font("SansSerif", 2, 16)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText(">>Back To Homepage...");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel11);
        jLabel11.setBounds(100, 470, 200, 21);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(0, 0, 400, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusernameActionPerformed

    private void txtemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtemailActionPerformed

    private void txtlnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtlnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtlnameActionPerformed

    private void loginbttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbttnActionPerformed
        LoginForm lgn = new LoginForm();
        lgn.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_loginbttnActionPerformed

    private void txtfnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfnameActionPerformed

    private void registerbttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerbttnActionPerformed
        
    if(txtfname.getText().isEmpty() || txtlname.getText().isEmpty() || txtemail.getText().isEmpty() 
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
        String pass = TraumaPass.hashPassword(txtpassword.getText()); //Password Hasher...
        if(dbc.insertData("INSERT INTO users_table"
                + "(u_fname, u_lname, u_email,  u_password, u_username, u_type, u_status) "
                + "VALUES('"+txtfname.getText()+"','"+txtlname.getText()+"', '"+txtemail.getText()+"', '"+pass+"',"
                        + "'"+txtusername.getText()+"', 'User', 'Pending') "))
        {
            JOptionPane.showMessageDialog(null, "Inserted Successfully");
        }else{
           JOptionPane.showMessageDialog(null, "Connection Error!");
        }
        }catch(NoSuchAlgorithmException ex){
        System.out.println(""+ex);
        }
     }
        
    }//GEN-LAST:event_registerbttnActionPerformed

    private void ShowPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowPassActionPerformed
        if(ShowPass.isSelected()){
           txtpassword.setEchoChar((char)0);
        }else{
            txtpassword.setEchoChar('*');
        }
    }//GEN-LAST:event_ShowPassActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        setState(JFrame. ICONIFIED);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        FrontPage pg = new FrontPage();
        pg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel11MouseClicked

    
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
            java.util.logging.Logger.getLogger(SignInForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignInForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignInForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignInForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignInForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox ShowPass;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton loginbttn;
    private javax.swing.JButton registerbttn;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtfname;
    private javax.swing.JTextField txtlname;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
}
