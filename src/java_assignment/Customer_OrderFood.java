/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package java_assignment;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.*;
import static java.lang.Integer.parseInt;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import java_assignment.Customer_Login.LoginFunction;
/**
 *
 * @author asus
 */
public class Customer_OrderFood extends javax.swing.JFrame{
    private Customer_Login.LoginFunction lf;
    private double total = 0.0;
    private DefaultTableModel model;
    private static int lastId = 1;
    //private List<ShoppingCartItem> cartItems = new ArrayList<>();
    
    public Customer_OrderFood(Customer_Login.LoginFunction lf) throws FileNotFoundException {
    try {
        initComponents();
        setTime();
        this.lf = lf;
        Date date = new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        txtOrderId.setText(lf.getLoggedInCustomerName()+df.format(date));
        txtCustomerID.setText(lf.getLoggedInCustomerID());
        txtCustomerName.setText(lf.getLoggedInCustomerName());
        File f =new File("ItemData.txt");
        if(!f.exists()){
            f.createNewFile();
        }
        BufferedReader br= new BufferedReader(new FileReader(f));

        model = (DefaultTableModel) tblItem1.getModel();

        Object[] tableLines = br.lines().toArray();

        for (int i = 0; i < tableLines.length; i++) {
            String line = tableLines[i].toString().trim();
            String[] dataRow = line.split(",");
            model.addRow(dataRow);
        }
        
        
    } catch (IOException e) {
        // Handle the exception (e.g., log it, display an error message, etc.)
        e.printStackTrace();
    }
    
}
    
        
            
                
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jOptionPane1 = new javax.swing.JOptionPane();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        btnAddCart = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnConfirmOrder = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        textArea1 = new java.awt.TextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTime = new javax.swing.JLabel();
        jDate = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblItem1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtOrderId = new javax.swing.JTextField();
        txtCustomerID = new javax.swing.JLabel();
        txtCustomerID1 = new javax.swing.JLabel();
        txtCustomerID2 = new javax.swing.JLabel();
        txtCustomerName = new javax.swing.JLabel();

        jLabel8.setText("jLabel8");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton4.setText("Dashboard");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Menu");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Order");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton8.setText("Log Out");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jButton7.setText("Transaction");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        btnAddCart.setText("Add To Order");
        btnAddCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCartActionPerformed(evt);
            }
        });

        jButton2.setText("Delete All Selection");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnConfirmOrder.setText("Confirm Order");
        btnConfirmOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmOrderActionPerformed(evt);
            }
        });

        jLabel3.setText("Item Name");

        jLabel4.setText("Price");

        jLabel5.setText("Quantity");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textArea1, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(50, 50, 50)
                .addComponent(jLabel4)
                .addGap(41, 41, 41)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(textArea1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtTotal.setText("0.00");

        jLabel1.setText("Total Amount");

        jTime.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N

        jDate.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N

        tblItem1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Item_Name", "Description", "Price", "Vendor"
            }
        ));
        jScrollPane1.setViewportView(tblItem1);

        jButton1.setText("All");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("Order");

        jLabel6.setText("Order ID : ");

        txtOrderId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOrderIdActionPerformed(evt);
            }
        });

        txtCustomerID.setText("jLabel7");

        txtCustomerID1.setText("Customer ID:");

        txtCustomerID2.setText("Customer Name:");

        txtCustomerName.setText("jLabel7");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(btnAddCart, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(235, 235, 235)
                        .addComponent(btnConfirmOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton1)
                                        .addGap(54, 54, 54)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtCustomerID2, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                                            .addComponent(txtCustomerID1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(18, 18, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtCustomerID)
                                            .addComponent(txtCustomerName))
                                        .addGap(163, 163, 163))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(166, 166, 166)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtOrderId, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTime, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jDate, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(262, 262, 262))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(884, 884, 884)
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jDate, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel6)
                                        .addComponent(txtOrderId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jTime, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtCustomerID1)
                                    .addComponent(txtCustomerID))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtCustomerID2)
                                    .addComponent(txtCustomerName))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                                .addComponent(jLabel9))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddCart, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConfirmOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1154, 665));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCartActionPerformed
        int selectedRow = tblItem1.getSelectedRow();
    
    if (selectedRow == -1) {
        jOptionPane1.showMessageDialog(Customer_OrderFood.this, "Please select an item from the table first.", "Warning Message", jOptionPane1.WARNING_MESSAGE);
        return; 
    }
        try (
            BufferedWriter bw = new BufferedWriter(new FileWriter("OrderData.txt", true))) {
            
            int row = tblItem1.getSelectedRow();
            String orderid=String.valueOf(txtOrderId.getText());
            String id = String.valueOf(tblItem1.getValueAt(row, 0));
            String Item_Name = String.valueOf(tblItem1.getValueAt(row, 1));
            String description = String.valueOf(tblItem1.getValueAt(row, 2));
            double price = Double.parseDouble(String.valueOf(tblItem1.getValueAt(row, 3))); 
            String vendor = String.valueOf(tblItem1.getValueAt(row, 4));
            String customer_id= String.valueOf(txtCustomerID.getText());
            String customer_name= String.valueOf(txtCustomerName.getText());
            String dr_id="";
            String orderStatus="";
            String confirmation="";

            String cartText = textArea1.getText();
            cartText += Item_Name + "               " + price + "                     " + 1; 
        
            textArea1.setText(cartText+"\n");
            total += price;
            txtTotal.setText(String.valueOf(total)); 
            
            bw.write(orderid+","+id+","+Item_Name+","+price+","+1+","+customer_id+","+
                    customer_name+","+price+","+dr_id+","+jDate.getText()+","+orderStatus+","+confirmation+"\n");


            jOptionPane1.showMessageDialog(Customer_OrderFood.this, "Order written to file successfully!");
        } catch (IOException e) {
            jOptionPane1.showMessageDialog(Customer_OrderFood.this, "Error writing to file: " + e.getMessage(), "Error", jOptionPane1.ERROR_MESSAGE);
        }
        
        
    }//GEN-LAST:event_btnAddCartActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try {
            dispose();
            Customer_OrderFood cof;
            cof = new Customer_OrderFood(lf);
            cof.setVisible(true); 
            this.setVisible(false);
        } catch (FileNotFoundException ex) {
            java.util.logging.Logger.getLogger(Customer_Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
        
        File f =new File("ItemData.txt");
        if(!f.exists()){
            f.createNewFile();
        }
        BufferedReader br= new BufferedReader(new FileReader(f));

        model = (DefaultTableModel) tblItem1.getModel();
        Object[] tableLines = br.lines().toArray();
        
        model.setRowCount(0);
        
        for (int i = 0; i < tableLines.length; i++) {
            String line = tableLines[i].toString().trim();
            String[] dataRow = line.split(",");
            model.addRow(dataRow);
        }
    } catch (IOException e) {
        // Handle the exception (e.g., log it, display an error message, etc.)
        e.printStackTrace();
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnConfirmOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmOrderActionPerformed
        loadLastId();
         int row = tblItem1.getSelectedRow();
            int paymentid = ++lastId;
            String orderid=String.valueOf(txtOrderId.getText());
            String customer_id= String.valueOf(txtCustomerID.getText());
            String status="haven't pay";
            writeToTextFile(paymentid,orderid,customer_id,total,status);
        try {
            dispose();
            Customer_Payment cp;
            cp = new Customer_Payment(lf);
            cp.setVisible(true); 
            this.setVisible(false);
        } catch (FileNotFoundException ex) {
            java.util.logging.Logger.getLogger(Customer_OrderFood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
   
    }//GEN-LAST:event_btnConfirmOrderActionPerformed
private void loadLastId() {
        try (BufferedReader br = new BufferedReader(new FileReader("PaymentData.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length > 0) {
                    int paymentid = Integer.parseInt(parts[0]);
                    if (paymentid > lastId) {
                        lastId = paymentid;
                    }
                }
            }
        } catch (IOException | NumberFormatException e) {
            // Handle the exception (e.g., log or show an error message)
            e.printStackTrace();
        }
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (!"".equals(txtOrderId.getText())) {
            try {
                deleteRecord();
                textArea1.setText("");
                txtTotal.setText("");
            } catch (IOException ex) {
                java.util.logging.Logger.getLogger(Customer_OrderFood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(this,"Please fill all data in the blanks");
        }
        
        /*
        dispose();
        Customer_DeleteItem cdi;
        cdi = new Customer_DeleteItem(lf);
        cdi.setVisible(true);
        this.setVisible(false);
        */
    }//GEN-LAST:event_jButton2ActionPerformed
public void deleteRecord() throws IOException {
    try {

        File f = new File("OrderData.txt");
        BufferedReader br = new BufferedReader(new FileReader(f));
        String line = "", input = "";
        while ((line = br.readLine()) != null) {
            String[] values = line.split(",");
            if(txtOrderId.getText().equals(values[0])){
                continue;
            }
            input += line + "\n";
        }
        br.close();
        BufferedWriter bw = new BufferedWriter(new FileWriter(f));
        bw.write(input);
        bw.close();

        JOptionPane.showMessageDialog(null, "Record deleted successfully!");

    } catch (IOException ex) {
        JOptionPane.showMessageDialog(null, "Error!");
    }
}
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        dispose();
        Customer_Dashboard cd;
        cd = new Customer_Dashboard(lf);
        cd.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
            
        try {
            dispose();
            Customer_OrderHistory coh;
            coh = new Customer_OrderHistory(lf);
            coh.setVisible(true); 
            this.setVisible(false);
        } catch (FileNotFoundException ex) {
            java.util.logging.Logger.getLogger(Customer_OrderFood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
            
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
            dispose();
            Customer_Login cl;
            cl = new Customer_Login();
            cl.setVisible(true); 
            this.setVisible(false);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void txtOrderIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOrderIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOrderIdActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        try {
            dispose();
            Customer_TransactionHistory cth;
            cth = new Customer_TransactionHistory(lf);
            cth.setVisible(true); 
            this.setVisible(false);
        } catch (FileNotFoundException ex) {
            java.util.logging.Logger.getLogger(Customer_TransactionHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton7ActionPerformed
private void writeToTextFile(int paymentid, String orderid, String customer_id, double total, String status) {
    try (
             
            BufferedWriter bw = new BufferedWriter(new FileWriter("PaymentData.txt", true))) {
            
            bw.write(paymentid+","+orderid+","+customer_id+","+total+","+status+"\n");

            jOptionPane1.showMessageDialog(Customer_OrderFood.this, "Successfully Order!");
    } catch (IOException e) {
            jOptionPane1.showMessageDialog(Customer_OrderFood.this, "Error writing to file: " + e.getMessage()
                    , "Error", jOptionPane1.ERROR_MESSAGE);
    }
}

    public void setTime(){  
        new Thread(new Runnable(){
            @Override
            public void run(){
                while(true){
                    try{
                        Thread.sleep(1000);
                    }catch (InterruptedException ex) {
                        java.util.logging.Logger.getLogger(Customer_OrderFood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                    }
                    Date date = new Date();
                    SimpleDateFormat tf = new SimpleDateFormat("h:mm:ss aa");
                    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
                    String time = tf.format(date);
                    jTime.setText(time.split(" ")[0]+" "+time.split(" ")[1]);
                    jDate.setText(df.format(date));
                }
            }
        }).start();
    }
    
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
            java.util.logging.Logger.getLogger(Customer_OrderFood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Customer_OrderFood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Customer_OrderFood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Customer_OrderFood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JButton btnAddCart;
    private javax.swing.JButton btnConfirmOrder;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jTime;
    private javax.swing.JTable tblItem1;
    private java.awt.TextArea textArea1;
    private javax.swing.JLabel txtCustomerID;
    private javax.swing.JLabel txtCustomerID1;
    private javax.swing.JLabel txtCustomerID2;
    private javax.swing.JLabel txtCustomerName;
    private javax.swing.JTextField txtOrderId;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables

}
