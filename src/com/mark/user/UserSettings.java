
package com.mark.user;

import com.mark.config.Session;
import com.mark.main.LoginForm;
import javax.swing.JOptionPane;

public class UserSettings extends javax.swing.JFrame {

    /** Creates new form AdminForm */
    public UserSettings() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Username = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        UserId = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 650));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));
        jPanel2.setLayout(null);

        jPanel4.setBackground(new java.awt.Color(204, 255, 204));
        jPanel4.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 760, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel3);
        jPanel3.setBounds(0, 91, 760, 560);

        jLabel6.setFont(new java.awt.Font("SansSerif", 2, 24)); // NOI18N
        jLabel6.setText("ACCOUNT INFORMATION");
        jPanel4.add(jLabel6);
        jLabel6.setBounds(10, 40, 292, 32);

        jCheckBox1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(255, 0, 51));
        jCheckBox1.setText("EXIT");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel4.add(jCheckBox1);
        jCheckBox1.setBounds(636, 19, 71, 31);

        jPanel2.add(jPanel4);
        jPanel4.setBounds(249, 0, 760, 650);

        jPanel5.setBackground(new java.awt.Color(102, 102, 102));
        jPanel5.setMinimumSize(new java.awt.Dimension(250, 140));
        jPanel5.setPreferredSize(new java.awt.Dimension(250, 140));
        jPanel5.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/anonymous-user.png"))); // NOI18N
        jPanel5.add(jLabel1);
        jLabel1.setBounds(90, 20, 68, 70);

        Username.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Username.setForeground(new java.awt.Color(255, 255, 255));
        Username.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Username.setText("User");
        jPanel5.add(Username);
        Username.setBounds(70, 90, 110, 20);

        jPanel2.add(jPanel5);
        jPanel5.setBounds(0, 0, 250, 130);

        jPanel6.setBackground(new java.awt.Color(51, 51, 51));
        jPanel6.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("HOME");
        jPanel6.add(jLabel3);
        jLabel3.setBounds(80, 10, 90, 20);

        jPanel2.add(jPanel6);
        jPanel6.setBounds(0, 140, 250, 50);

        jPanel7.setBackground(new java.awt.Color(51, 51, 51));
        jPanel7.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("PAYMENT");
        jPanel7.add(jLabel5);
        jLabel5.setBounds(78, 10, 90, 22);

        jPanel2.add(jPanel7);
        jPanel7.setBounds(0, 200, 250, 50);

        jPanel8.setBackground(new java.awt.Color(51, 51, 51));
        jPanel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel8MouseEntered(evt);
            }
        });
        jPanel8.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("LOGOUT");
        jPanel8.add(jLabel7);
        jLabel7.setBounds(90, 20, 70, 22);

        jPanel2.add(jPanel8);
        jPanel8.setBounds(0, 510, 250, 60);

        jPanel9.setBackground(new java.awt.Color(51, 51, 51));
        jPanel9.setLayout(null);

        UserId.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        UserId.setForeground(new java.awt.Color(255, 255, 255));
        UserId.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UserId.setText(" ID");
        jPanel9.add(UserId);
        UserId.setBounds(80, 10, 80, 22);

        jPanel2.add(jPanel9);
        jPanel9.setBounds(0, 580, 250, 50);

        jPanel10.setBackground(new java.awt.Color(51, 51, 51));
        jPanel10.setLayout(null);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("SCHEDULE");
        jPanel10.add(jLabel8);
        jLabel8.setBounds(80, 10, 90, 22);

        jPanel2.add(jPanel10);
        jPanel10.setBounds(0, 260, 250, 50);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 1000, 650);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        Session sess = Session.getInstance();
        
         if(sess.getUid()== 0){
            JOptionPane.showMessageDialog(null, "No Account Found, Please Log in");
            LoginForm lf = new LoginForm();
            lf.setVisible(true);
            this.dispose();
        }else{
            Username.setText(""+sess.getUsername());
            UserId.setText("USER ID: "+sess.getUid());
                       }
    }//GEN-LAST:event_formWindowActivated

    private void jPanel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseClicked
        LoginForm lf = new LoginForm();
            lf.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_jPanel8MouseClicked

    private void jPanel8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel8MouseEntered

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jCheckBox1ActionPerformed


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
            java.util.logging.Logger.getLogger(UserSettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserSettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserSettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserSettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserSettings().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel UserId;
    private javax.swing.JLabel Username;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    // End of variables declaration//GEN-END:variables

}
