/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package java_assignment;

import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java_assignment.Customer_Login.LoginFunction;

/**
 *
 * @author asus
 */
public class Customer_Dashboard extends javax.swing.JFrame {
    private LoginFunction lf;

    /**
     * Creates new form Customer_Dashboard
     */
    public Customer_Dashboard(LoginFunction lf) {
        initComponents();
        this.lf = lf;
        jLabel1.setText("Customer ID: " + lf.getLoggedInCustomerID());
        txtName.setText("Customer Name: " + lf.getLoggedInCustomerName());
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGoP = new javax.swing.JButton();
        btnGoLO = new javax.swing.JButton();
        btnGoOH = new javax.swing.JButton();
        btnGoOF = new javax.swing.JButton();
        btnGoRF = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnGoTH = new javax.swing.JButton();
        txtName = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnGoP.setText("Profile");
        btnGoP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoPActionPerformed(evt);
            }
        });

        btnGoLO.setText("Logout");
        btnGoLO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoLOActionPerformed(evt);
            }
        });

        btnGoOH.setText("Order History");
        btnGoOH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoOHActionPerformed(evt);
            }
        });

        btnGoOF.setText("Order Food");
        btnGoOF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoOFActionPerformed(evt);
            }
        });

        btnGoRF.setText("Review Food");
        btnGoRF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoRFActionPerformed(evt);
            }
        });

        jLabel1.setText("customerid");

        btnGoTH.setText("Transaction History");
        btnGoTH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoTHActionPerformed(evt);
            }
        });

        txtName.setText("customername");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(88, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtName)
                        .addGap(163, 163, 163)
                        .addComponent(btnGoP)
                        .addGap(31, 31, 31)
                        .addComponent(btnGoLO))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnGoTH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnGoOF, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnGoRF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(btnGoOH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(9, 9, 9)))))
                .addGap(36, 36, 36))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGoP)
                    .addComponent(btnGoLO)
                    .addComponent(jLabel1)
                    .addComponent(txtName))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGoRF, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGoOF, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addComponent(btnGoOH, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGoTH, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(636, 469));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnGoPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoPActionPerformed
        try {
            dispose();
            Customer_ViewProfile cpro;
            cpro = new Customer_ViewProfile(lf);
            cpro.setVisible(true); 
            this.setVisible(false);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Customer_Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnGoPActionPerformed

    private void btnGoLOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoLOActionPerformed
        dispose();
        Customer_Login cl = new Customer_Login();
        cl.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnGoLOActionPerformed

    private void btnGoOFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoOFActionPerformed
        
        try {
            dispose();
            Customer_OrderFood cof;
            cof = new Customer_OrderFood(lf);
            cof.setVisible(true); 
            this.setVisible(false);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Customer_Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnGoOFActionPerformed

    private void btnGoTHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoTHActionPerformed
        try {
            dispose();
            Customer_TransactionHistory cth;
            cth = new Customer_TransactionHistory(lf);
            cth.setVisible(true);
            this.setVisible(false);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Customer_Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnGoTHActionPerformed

    private void btnGoOHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoOHActionPerformed
        try {
            dispose();
            Customer_OrderHistory coh;
            coh = new Customer_OrderHistory(lf);
            coh.setVisible(true);
            this.setVisible(false);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Customer_Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnGoOHActionPerformed

    private void btnGoRFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoRFActionPerformed
        dispose();
        Customer_Review cr;
        cr = new Customer_Review(lf);
        cr.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnGoRFActionPerformed

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
            java.util.logging.Logger.getLogger(Customer_Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Customer_Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Customer_Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Customer_Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Customer_Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGoLO;
    private javax.swing.JButton btnGoOF;
    private javax.swing.JButton btnGoOH;
    private javax.swing.JButton btnGoP;
    private javax.swing.JButton btnGoRF;
    private javax.swing.JButton btnGoTH;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel txtName;
    // End of variables declaration//GEN-END:variables
}
