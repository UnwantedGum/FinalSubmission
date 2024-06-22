
package com.mark.admin;

import com.mark.config.Session;
import com.mark.config.dbConnector;
import com.mark.main.LoginForm;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

public class AdminForm extends javax.swing.JFrame {

    /** Creates new form AdminForm */
    public AdminForm() {
        initComponents();
        displayData();
    }
    
    Color navcolor = new Color(51,51,51);
    Color hovercolor = new Color(153,153,153);
    
    public void displayData(){ //To display data in table...
        try{
            dbConnector dbc = new dbConnector();
            ResultSet rs = dbc.getData("SELECT u_id, u_username,u_fname, u_lname, u_email, u_status FROM users_table");
            userTable.setModel(DbUtils.resultSetToTableModel(rs));
             rs.close();
        }catch(SQLException ex){
            System.out.println("Errors: "+ex.getMessage());
        
        }
        
    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        title = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        main_face = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        userTable = new javax.swing.JTable();
        add_user = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        update = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        log_out = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        AdminName = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        transaction = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.setLayout(null);

        title.setBackground(new java.awt.Color(204, 255, 204));
        title.setLayout(null);

        jLabel6.setFont(new java.awt.Font("SansSerif", 2, 24)); // NOI18N
        jLabel6.setText("USER TABLE");
        title.add(jLabel6);
        jLabel6.setBounds(15, 16, 350, 32);

        main_face.setBackground(new java.awt.Color(204, 204, 255));

        userTable.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        userTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(userTable);

        javax.swing.GroupLayout main_faceLayout = new javax.swing.GroupLayout(main_face);
        main_face.setLayout(main_faceLayout);
        main_faceLayout.setHorizontalGroup(
            main_faceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(main_faceLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        main_faceLayout.setVerticalGroup(
            main_faceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(main_faceLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(240, Short.MAX_VALUE))
        );

        title.add(main_face);
        main_face.setBounds(0, 68, 820, 630);

        jPanel2.add(title);
        title.setBounds(250, 40, 820, 700);

        add_user.setBackground(new java.awt.Color(51, 51, 51));
        add_user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add_userMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                add_userMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                add_userMouseExited(evt);
            }
        });
        add_user.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Add ");
        add_user.add(jLabel5);
        jLabel5.setBounds(80, 10, 80, 30);

        jPanel2.add(add_user);
        add_user.setBounds(0, 250, 250, 50);

        update.setBackground(new java.awt.Color(51, 51, 51));
        update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                updateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                updateMouseExited(evt);
            }
        });
        update.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Update ");
        update.add(jLabel7);
        jLabel7.setBounds(80, 10, 90, 29);

        jPanel2.add(update);
        update.setBounds(0, 310, 250, 50);

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

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("LOG OUT");
        log_out.add(jLabel3);
        jLabel3.setBounds(70, 10, 100, 30);

        jPanel2.add(log_out);
        log_out.setBounds(0, 590, 250, 50);

        jPanel9.setBackground(new java.awt.Color(51, 51, 51));
        jPanel9.setLayout(null);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("GENERAL");
        jPanel9.add(jLabel8);
        jLabel8.setBounds(87, 16, 75, 22);

        jPanel2.add(jPanel9);
        jPanel9.setBounds(0, 190, 250, 50);

        jPanel5.setBackground(new java.awt.Color(102, 102, 102));
        jPanel5.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/software-engineer.png"))); // NOI18N
        jPanel5.add(jLabel1);
        jLabel1.setBounds(90, 20, 64, 64);

        AdminName.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        AdminName.setForeground(new java.awt.Color(255, 255, 255));
        AdminName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AdminName.setText("Admin");
        jPanel5.add(AdminName);
        AdminName.setBounds(60, 100, 120, 30);

        jPanel2.add(jPanel5);
        jPanel5.setBounds(0, 40, 250, 140);

        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(990, 10, 30, 30);

        jButton1.setBackground(new java.awt.Color(204, 0, 0));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(1030, 10, 29, 30);

        transaction.setBackground(new java.awt.Color(51, 51, 51));
        transaction.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                transactionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                transactionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                transactionMouseExited(evt);
            }
        });
        transaction.setLayout(null);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Transaction");
        transaction.add(jLabel9);
        jLabel9.setBounds(50, 10, 140, 30);

        jPanel2.add(transaction);
        transaction.setBounds(0, 370, 250, 50);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 1070, 700);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1070, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
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

    private void add_userMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_userMouseClicked
        UpdateUser aur = new UpdateUser();
        aur.setVisible(true);
        this.dispose();
        
// TODO add your handling code here:
    }//GEN-LAST:event_add_userMouseClicked

    private void log_outMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_log_outMouseClicked
        LoginForm lgf = new LoginForm();
        lgf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_log_outMouseClicked

    private void add_userMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_userMouseEntered
     add_user.setBackground(hovercolor);
    }//GEN-LAST:event_add_userMouseEntered

    private void add_userMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_userMouseExited
        add_user.setBackground(navcolor);
    }//GEN-LAST:event_add_userMouseExited

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void log_outMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_log_outMouseEntered
         log_out.setBackground(hovercolor);
    }//GEN-LAST:event_log_outMouseEntered

    private void log_outMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_log_outMouseExited
         log_out.setBackground(navcolor);
    }//GEN-LAST:event_log_outMouseExited

    private void updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseClicked
        int rowIndex = userTable.getSelectedRow();
                
                if(rowIndex < 0){
                    JOptionPane.showMessageDialog(null, "Please select an Item!" );
                }else{
                
                    try{
                    
                        dbConnector db = new dbConnector();
                        TableModel tbl = userTable.getModel();
                        ResultSet rs = db.getData("SELECT * FROM users_table WHERE u_id ='"+tbl.getValueAt(rowIndex, 0)+"'");
                        if(rs.next()){
                            UpdateUser up = new UpdateUser();
                            up.uid.setText(""+rs.getString("u_id"));
                            up.lname.setText(""+rs.getString("u_lname"));
                            up.fname.setText(""+rs.getString("u_fname"));
                            up.txtusername.setText(""+rs.getString("u_username"));
                            up.txtemail.setText(""+rs.getString("u_email"));
                            up.txtpassword.setText(""+rs.getString("u_password"));
                            up.CBType.setSelectedItem(""+rs.getString("u_type"));
                            up.CBstatus.setSelectedItem(""+rs.getString("u_status"));
                            up.add.setEnabled(false);
                            up.Update.setEnabled(true);
                            up.setVisible(true);
                            this.dispose();
                        }
                    }catch(SQLException ex){
                        System.out.println(""+ex);
                    }
                
                }
    }//GEN-LAST:event_updateMouseClicked

    private void updateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseEntered
        update.setBackground(hovercolor);
    }//GEN-LAST:event_updateMouseEntered

    private void updateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseExited
        update.setBackground(navcolor);
    }//GEN-LAST:event_updateMouseExited

    private void transactionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transactionMouseClicked
        AdminPayment ap = new AdminPayment();
        ap.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_transactionMouseClicked

    private void transactionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transactionMouseEntered
       transaction.setBackground(hovercolor);
    }//GEN-LAST:event_transactionMouseEntered

    private void transactionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transactionMouseExited
        transaction.setBackground(navcolor);
    }//GEN-LAST:event_transactionMouseExited

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
            java.util.logging.Logger.getLogger(AdminForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AdminName;
    private javax.swing.JPanel add_user;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel log_out;
    private javax.swing.JPanel main_face;
    private javax.swing.JPanel title;
    private javax.swing.JPanel transaction;
    private javax.swing.JPanel update;
    private javax.swing.JTable userTable;
    // End of variables declaration//GEN-END:variables

}
