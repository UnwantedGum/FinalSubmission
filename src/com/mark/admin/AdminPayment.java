
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
import net.proteanit.sql.DbUtils;


public class AdminPayment extends javax.swing.JFrame {


    public AdminPayment() {
        initComponents();
        displayData();
    }
    
    Color navcolor = new Color(51,51,51);
    Color hovercolor = new Color(153,153,153);
    
        public void displayData(){ //To display data in table...
        try{
            dbConnector dbc = new dbConnector();
            try (ResultSet rs = dbc.getData("SELECT p_id, users_table.u_fname, users_table.u_username, date, p_status FROM payment INNER JOIN users_table ")) {
                paymentTable.setModel(DbUtils.resultSetToTableModel(rs));
                rs.close();
            }
        }catch(SQLException ex){
            System.out.println("Errors: "+ex.getMessage());
        
        }
        
    
    }
    
 public static String email;
 public static String username;
 

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtfname = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtusername = new javax.swing.JTextField();
        registerbttn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        paymentTable = new javax.swing.JTable();
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
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

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
        jLabel7.setBounds(40, 300, 100, 24);

        txtfname.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtfname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfnameActionPerformed(evt);
            }
        });
        jPanel3.add(txtfname);
        txtfname.setBounds(40, 320, 200, 40);

        jLabel9.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel9.setText("Username");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(270, 300, 100, 24);

        txtusername.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusernameActionPerformed(evt);
            }
        });
        jPanel3.add(txtusername);
        txtusername.setBounds(270, 320, 200, 40);

        registerbttn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        registerbttn.setText("Register");
        registerbttn.setPreferredSize(new java.awt.Dimension(95, 29));
        registerbttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerbttnActionPerformed(evt);
            }
        });
        jPanel3.add(registerbttn);
        registerbttn.setBounds(40, 470, 110, 50);

        paymentTable.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        paymentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(paymentTable);

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(10, 10, 720, 260);

        jPanel4.add(jPanel3);
        jPanel3.setBounds(0, 70, 750, 540);

        jLabel6.setFont(new java.awt.Font("SansSerif", 2, 24)); // NOI18N
        jLabel6.setText("Payment");
        jPanel4.add(jLabel6);
        jLabel6.setBounds(15, 16, 360, 32);

        jPanel2.add(jPanel4);
        jPanel4.setBounds(250, 40, 750, 650);

        jPanel5.setBackground(new java.awt.Color(102, 102, 102));
        jPanel5.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/software-engineer.png"))); // NOI18N
        jPanel5.add(jLabel1);
        jLabel1.setBounds(100, 20, 64, 64);

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

        jButton1.setBackground(new java.awt.Color(204, 0, 0));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(960, 10, 30, 30);

        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(920, 10, 30, 30);

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

    private void registerbttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerbttnActionPerformed

    }//GEN-LAST:event_registerbttnActionPerformed

    private void txtusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusernameActionPerformed

    private void txtfnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfnameActionPerformed

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
            java.util.logging.Logger.getLogger(AdminPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminPayment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AdminName;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel log_out;
    private javax.swing.JTable paymentTable;
    private javax.swing.JButton registerbttn;
    public javax.swing.JTextField txtfname;
    public javax.swing.JTextField txtusername;
    private javax.swing.JPanel user_table;
    // End of variables declaration//GEN-END:variables
}
