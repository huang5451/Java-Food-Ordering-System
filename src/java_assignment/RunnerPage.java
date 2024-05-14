/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package java_assignment;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author awzhe
 */
public class RunnerPage extends javax.swing.JFrame {
    private DefaultTableModel model;
    List<Task> tasks = new ArrayList<>();
    List<CustomerData> CData = new ArrayList<>();

    private class CustomerData {

        String customerID;
        String customerName;
        String customerContact;
        String customerPassword;
        String customerCredit;

        public CustomerData(String customerID, String customerName, String customerContact, String customerPassword, String customerCredit) {
            this.customerID = customerID;
            this.customerName = customerName;
            this.customerContact = customerContact;
            this.customerPassword = customerPassword;
            this.customerCredit = customerCredit;
        }

        public String getCustomerID() {
            return customerID;
        }

        public String getCustomerContact() {
            return customerContact;
        }

    }

    private class Task {

        String orderID;
        String itemID;
        String itemName;
        String itemPrice;
        String itemQuantity;
        String customerID;
        String customerName;
        String totalPriceOrder;
        String runnerID;
        String date;
        String orderStatus;
        String confirmation;

        public Task(String orderID, String itemID, String itemName, String itemPrice, String itemQuantity, String customerID, String customerName, String totalPriceOrder, String runnerID, String date, String orderStatus, String confirmation) {
            this.orderID = orderID;
            this.itemID = itemID;
            this.itemName = itemName;
            this.itemPrice = itemPrice;
            this.itemQuantity = itemQuantity;
            this.customerID = customerID;
            this.customerName = customerName;
            this.totalPriceOrder = totalPriceOrder;
            this.runnerID = runnerID;
            this.date = date;
            this.orderStatus = orderStatus;
            this.confirmation = confirmation;
        }

        public void setConfirmation(String confirmation) {
            this.confirmation = confirmation;
        }

        public String getOrderID() {
            return orderID;
        }

        public String getItemID() {
            return itemID;
        }

        public String getItemName() {
            return itemName;
        }

        public String getItemPrice() {
            return itemPrice;
        }

        public String getItemQuantity() {
            return itemQuantity;
        }

        public String getCustomerID() {
            return customerID;
        }

        public String getCustomerName() {
            return customerName;
        }

        public String getTotalPriceOrder() {
            return totalPriceOrder;
        }

        public String getRunnerID() {
            return runnerID;
        }

        public String getDate() {
            return date;
        }

        public String getOrderStatus() {
            return orderStatus;
        }

        public String getConfirmation() {
            return confirmation;
        }

    }

    /**
     * Creates new form RunnerPage
     */
    public RunnerPage() throws IOException {
        try{
            initComponents();
        
        //loadData("OrderData.txt");
        updateTable("");
        checkCustomerID("CustomerData.txt");
        
         File f =new File("OrderData.txt");
            if(!f.exists()){
                f.createNewFile();
            }
            BufferedReader br= new BufferedReader(new FileReader(f));

            model = (DefaultTableModel) TaskTable.getModel();

            Object[] tableLines = br.lines().toArray();
            
            for (int i = 0; i < tableLines.length; i++) {
                String line = tableLines[i].toString().trim();
                String[] dataRow = line.split(",");
                model.addRow(dataRow);
            }
    }
        catch (IOException e) {
        e.printStackTrace();
    }
    

   }

    private void updateTable(String RunnerID) {
        DefaultTableModel model = (DefaultTableModel) TaskTable.getModel();
        model.setRowCount(0);
        for (Task task : tasks) {
            Object[] row = {
                task.getOrderID(), task.getItemID(), task.getItemName(),
                task.getItemPrice(), task.getItemQuantity(), task.getCustomerID(),
                task.getCustomerName(), task.getTotalPriceOrder(), task.getRunnerID(),
                task.getDate(), task.getOrderStatus(), task.getConfirmation()
            };
            model.addRow(row);
        }
    }
    /*
    private void loadData(String filepath) {

        File file = new File(filepath);
        try (BufferedReader br = new BufferedReader(new FileReader(filepath))) {
            String line;
            while ((line = br.readLine()) != null && !line.equals("")) {
                String[] data = line.split(",");
                Task task = new Task(data[0], data[1], data[2], data[3], data[4], data[5], data[6], data[7], data[8], data[9], data[10], data[11]);
                tasks.add(task);
            }
            br.close();
        } catch (IOException e) {
        }
    }
    */
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jScrollPane2 = new javax.swing.JScrollPane();
        TaskTable = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        acceptBtn = new javax.swing.JButton();
        declineBtn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        customerIDTxt = new javax.swing.JTextField();
        customerContactTxt = new javax.swing.JTextField();
        findBtn = new javax.swing.JButton();
        viewHistoryBtn = new javax.swing.JButton();
        btnGoLO4 = new javax.swing.JButton();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TaskTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order ID", "Item ID", "Item name", "Item Price", "Item Quantity", "Customer ID", "Customer name", "Total Price Order", "Runner ID", "Date", "Order Status", "Confirmation"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(TaskTable);

        acceptBtn.setText("Accept");
        acceptBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceptBtnActionPerformed(evt);
            }
        });

        declineBtn.setText("Decline");
        declineBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                declineBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(acceptBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(declineBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(acceptBtn)
                    .addComponent(declineBtn))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jLabel1.setText("Customer ID");

        jLabel2.setText("Customer contact");

        customerIDTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerIDTxtActionPerformed(evt);
            }
        });

        customerContactTxt.setEditable(false);
        customerContactTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerContactTxtActionPerformed(evt);
            }
        });

        findBtn.setText("Find");
        findBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findBtnActionPerformed(evt);
            }
        });

        viewHistoryBtn.setText("View History");
        viewHistoryBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewHistoryBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(customerIDTxt)
                    .addComponent(customerContactTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))
                .addContainerGap(158, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(findBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(viewHistoryBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(customerIDTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(customerContactTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(findBtn)
                    .addComponent(viewHistoryBtn))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        btnGoLO4.setText("Logout");
        btnGoLO4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoLO4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGoLO4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(107, 107, 107))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(btnGoLO4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void writeToFile(String filepath, DefaultTableModel model) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filepath))) {
            for (int row = 0; row < model.getRowCount(); row++) {
                StringBuilder line = new StringBuilder();
                for (int col = 0; col < model.getColumnCount(); col++) {
                    if (col > 0) {
                        line.append(",");
                    }
                    line.append(model.getValueAt(row, col));
                }
                writer.write(line.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace(); // Handle the exception according to your needs
        }
    }
    private void acceptBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceptBtnActionPerformed
        int selectedRow = TaskTable.getSelectedRow();
        if (selectedRow != -1) {
            DefaultTableModel model = (DefaultTableModel) TaskTable.getModel();
            String selectedTaskConfirmation = (String) model.getValueAt(selectedRow, 0);
            TaskTable.setValueAt("Accepted", selectedRow, 11);
            writeToFile("OrderData.txt", model);
        } else {
            JOptionPane.showMessageDialog(null, "Please select a task to accept.");
        }
    }//GEN-LAST:event_acceptBtnActionPerformed

    private void declineBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_declineBtnActionPerformed
        int selectedRow = TaskTable.getSelectedRow();
        if (selectedRow != -1) {
            DefaultTableModel model = (DefaultTableModel) TaskTable.getModel();
            String selectedTaskConfirmation = (String) model.getValueAt(selectedRow, 0);
            TaskTable.setValueAt("Decline", selectedRow, 11);
            writeToFile("OrderData.txt", model);
        } else {
            JOptionPane.showMessageDialog(null, "Please select a task to decline.");
        }
    }//GEN-LAST:event_declineBtnActionPerformed

    private String checkCustomerID(String filepath1) {
        for (CustomerData cdata : CData) {
            if (cdata.getCustomerID().equals(customerIDTxt.getText())) {
                return cdata.getCustomerContact(); 
            }
        }
        return null; 
    }
    private void findBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findBtnActionPerformed
        String searchedCustomerID = customerIDTxt.getText();
        String filepath = "CustomerData.txt";
        String customerContact = findCustomerContact(filepath, searchedCustomerID);

        if (customerContact != null) {
            customerContactTxt.setText(customerContact);
        } else {
            JOptionPane.showMessageDialog(null, "Invalid Customer ID, please try again");
        }
    }//GEN-LAST:event_findBtnActionPerformed

    private String findCustomerContact(String filepath, String searchedCustomerID) {
        try (BufferedReader br = new BufferedReader(new FileReader(filepath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length >= 3 && data[0].equals(searchedCustomerID)) {

                    return data[2];
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;

    }
    private void customerIDTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerIDTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customerIDTxtActionPerformed

    private void customerContactTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerContactTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customerContactTxtActionPerformed
    
    private void displayTaskHistory() {
    DefaultTableModel model = (DefaultTableModel) TaskTable.getModel();

    ArrayList<String> history = new ArrayList<>();

    //Filter the rows and check for accepted/declined tasks
    for (int row = 0; row < model.getRowCount(); row++) {
        String confirmationStatus = (String) model.getValueAt(row, 11);
        if (confirmationStatus != null && !confirmationStatus.isEmpty()) {
            history.add("Task ID: " + model.getValueAt(row, 0) + " - " + confirmationStatus);
        }
    }

    // Display the history in a dialog
    if (!history.isEmpty()) {
        String[] historyArray = history.toArray(new String[0]);
        JOptionPane.showMessageDialog(null, String.join("\n", historyArray), "Task History", JOptionPane.INFORMATION_MESSAGE);
    } else {
        JOptionPane.showMessageDialog(null, "No task history available.", "Task History", JOptionPane.INFORMATION_MESSAGE);
    }
}
    
    private void viewHistoryBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewHistoryBtnActionPerformed
        displayTaskHistory();
    }//GEN-LAST:event_viewHistoryBtnActionPerformed

    private void btnGoLO4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoLO4ActionPerformed
        dispose();
        Runner_Login rl = new Runner_Login();
        rl.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnGoLO4ActionPerformed

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
            java.util.logging.Logger.getLogger(RunnerPage.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RunnerPage.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RunnerPage.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RunnerPage.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new RunnerPage().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(RunnerPage.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TaskTable;
    private javax.swing.JButton acceptBtn;
    private javax.swing.JButton btnGoLO4;
    private javax.swing.JTextField customerContactTxt;
    private javax.swing.JTextField customerIDTxt;
    private javax.swing.JButton declineBtn;
    private javax.swing.JButton findBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton viewHistoryBtn;
    // End of variables declaration//GEN-END:variables
}
