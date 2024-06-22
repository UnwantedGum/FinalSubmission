package com.mark.main;

import com.mark.admin.AdminForm;
import com.mark.config.Session;
import com.mark.config.TraumaPass;
import com.mark.config.dbConnector;
import com.mark.trainer.TrainerForm;
import com.mark.user.UserForm;
import java.security.NoSuchAlgorithmException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class LoginForm extends javax.swing.JFrame {

    public LoginForm() {
        initComponents();
    }
   static  String status;
   static  String account;
   static  String usr;
   
   public static boolean loginAccount(String username,String password) throws NoSuchAlgorithmException {
        dbConnector connector = new dbConnector();
        try{
        String query = "SELECT * FROM users_table WHERE u_username = '"+username+"' ";
        ResultSet res = connector.getData(query);
            if(res.next()){
                
                try{
                String rehashedPass = TraumaPass.hashPassword(password);
                }catch(NoSuchAlgorithmException ex){
                System.out.println(""+ex);
                }
                status = res.getString("u_status");
                account =res.getString("u_type");
                usr =res.getString("u_username");
                Session sess = Session.getInstance();    
                sess.setUid(res.getInt("u_id"));
                sess.setFname(res.getString("u_fname"));
                sess.setLname(res.getString("u_lname"));
                sess.setEmail(res.getString("u_email"));
                sess.setUsername(res.getString("u_username"));
                sess.setType(res.getString("u_type"));
                sess.setStatus(res.getString("u_status"));           
               
                return true;
            }else{
                return false;
            }
        }catch(SQLException ex){
          
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
        jPanel3 = new javax.swing.JPanel();
        LoginButton = new javax.swing.JButton();
        SignUp = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TFusername = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        TFpassword = new javax.swing.JPasswordField();
        ShowPass = new javax.swing.JCheckBox();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LogInForm");
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel2.setPreferredSize(new java.awt.Dimension(400, 500));
        jPanel2.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jPanel2AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/MainLogoo.png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel6.setText("\"Let metal and iron sculpt your life.\"");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(96, 96, 96))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel6)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jLabel5)
                .addGap(52, 52, 52)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jLabel6)
                .addContainerGap(141, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(10, 10, 400, 500);

        jPanel3.setBackground(new java.awt.Color(234, 233, 233));
        jPanel3.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel3.setPreferredSize(new java.awt.Dimension(400, 500));
        jPanel3.setLayout(null);

        LoginButton.setText("LOG IN");
        LoginButton.setPreferredSize(new java.awt.Dimension(95, 29));
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });
        jPanel3.add(LoginButton);
        LoginButton.setBounds(260, 350, 95, 31);

        SignUp.setText("SIGN UP");
        SignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignUpActionPerformed(evt);
            }
        });
        jPanel3.add(SignUp);
        SignUp.setBounds(150, 350, 95, 31);

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabel2.setText("SIGN IN");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(134, 110, 132, 47);

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jLabel3.setText("Username");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(57, 171, 80, 21);

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jLabel4.setText("Password");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(57, 247, 70, 20);

        TFusername.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        TFusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFusernameActionPerformed(evt);
            }
        });
        jPanel3.add(TFusername);
        TFusername.setBounds(57, 192, 294, 38);

        jButton1.setBackground(new java.awt.Color(204, 0, 0));
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jButton1.setPreferredSize(new java.awt.Dimension(33, 33));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1);
        jButton1.setBounds(350, 20, 30, 30);

        TFpassword.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jPanel3.add(TFpassword);
        TFpassword.setBounds(60, 270, 290, 40);

        ShowPass.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ShowPass.setText("Show ");
        ShowPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowPassActionPerformed(evt);
            }
        });
        jPanel3.add(ShowPass);
        ShowPass.setBounds(60, 310, 80, 31);

        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2);
        jButton2.setBounds(310, 20, 30, 30);

        jLabel7.setFont(new java.awt.Font("SansSerif", 2, 16)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText(">>Back To Homepage...");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel7);
        jLabel7.setBounds(90, 460, 200, 21);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(410, 10, 400, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 820, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void SignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignUpActionPerformed
        SignInForm sgn = new SignInForm();
        sgn.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_SignUpActionPerformed

    private void TFusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFusernameActionPerformed

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
        try {
            //Checks for the User's account status....
            if(loginAccount(TFusername.getText(), TFpassword.getText())){                
                
                if(!status.equals("Activated")){
                    JOptionPane.showMessageDialog(null, "In-Active Account, Please Contact Admin.");
                }else{
                    JOptionPane.showMessageDialog(null, "Login Success, Welcome"+" "+usr);                
                    
                    if(account.equals("Admin")){ //Redirects to Admin Dashboard....
                        
                        AdminForm ads = new AdminForm();
                        ads.setVisible(true);
                        this.dispose();
                        
                    }else if(account.equals("User")){ //Redirects to User Dashboard....
                        
                        UserForm udb = new UserForm();
                        udb.setVisible(true);
                        this.dispose();
                    }else if (account.equals("Trainer")){ //Redirects to Trainer Dashboard.... 
                        
                        TrainerForm trf = new TrainerForm();
                        trf.setVisible(true);
                        this.dispose();
                        
                    }else{
                        JOptionPane.showMessageDialog(null, "No Account Found!");
                    }
                }
            }else{
                JOptionPane.showMessageDialog(null, "Invalid Account!");
            }
        } catch (NoSuchAlgorithmException ex) {   
            Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_LoginButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jPanel2AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jPanel2AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel2AncestorAdded

    private void ShowPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowPassActionPerformed
        //Password Hashing....
        
        if(ShowPass.isSelected()){
            TFpassword.setEchoChar((char)0);
        }else{
            TFpassword.setEchoChar('*');
        }
    }//GEN-LAST:event_ShowPassActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        setState(JFrame. ICONIFIED);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
       FrontPage pg = new FrontPage();
                        pg.setVisible(true);
                        this.dispose();
    }//GEN-LAST:event_jLabel7MouseClicked

    
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
    private javax.swing.JButton LoginButton;
    private javax.swing.JCheckBox ShowPass;
    private javax.swing.JButton SignUp;
    private javax.swing.JPasswordField TFpassword;
    private javax.swing.JTextField TFusername;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
