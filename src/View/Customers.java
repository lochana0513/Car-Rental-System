/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;
import Controller.ContCarData;
import Controller.ContCustomerData;
import Model.MCustomers;
import Controller.ContCustomers;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Controller.NICInputVerifier;
import Controller.NICFieldKeyListener;
import Controller.LettersSpaceDotTextFieldKeyListener;
import Controller.PhoneNumberTextFieldKeyListener;
import Controller.AddressTextFieldKeyListener;
import javax.swing.JFrame;

/**
 *
 * @author Hp
 */
public class Customers extends javax.swing.JFrame {

     private ContCustomers controller;
    /**
     * 
     * Creates new form Customers
     */
    public Customers() {
        initComponents();
         MCustomers model = new MCustomers();
         controller = new ContCustomers(model, this);
         displayExistingCustomerData();
       
          customerIDField.setInputVerifier(new NICInputVerifier());    
          customerIDField.addKeyListener(new NICFieldKeyListener());
          CustomerNameFeild.addKeyListener(new LettersSpaceDotTextFieldKeyListener());
          phoneNoField.addKeyListener(new PhoneNumberTextFieldKeyListener());
          AddressFeild.addKeyListener(new AddressTextFieldKeyListener());
          
          
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        reportNav = new javax.swing.JLabel();
        logoutNav = new javax.swing.JLabel();
        carrNav = new javax.swing.JLabel();
        rentNav = new javax.swing.JLabel();
        returnNav = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        customerUpdateBtn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        customerSaveBtn = new javax.swing.JButton();
        customerDeleteBtn = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        customerIDField = new javax.swing.JTextField();
        CustomerNameFeild = new javax.swing.JTextField();
        AddressFeild = new javax.swing.JTextField();
        phoneNoField = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        CustomerTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        reportNav.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        reportNav.setForeground(new java.awt.Color(74, 78, 105));
        reportNav.setText("Reports");
        reportNav.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reportNavMouseClicked(evt);
            }
        });

        logoutNav.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        logoutNav.setForeground(new java.awt.Color(74, 78, 105));
        logoutNav.setText("Log out");
        logoutNav.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutNavMouseClicked(evt);
            }
        });

        carrNav.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        carrNav.setForeground(new java.awt.Color(74, 78, 105));
        carrNav.setText("Cars");
        carrNav.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                carrNavMouseClicked(evt);
            }
        });

        rentNav.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        rentNav.setForeground(new java.awt.Color(74, 78, 105));
        rentNav.setText("Rent Cars");
        rentNav.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rentNavMouseClicked(evt);
            }
        });

        returnNav.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        returnNav.setForeground(new java.awt.Color(74, 78, 105));
        returnNav.setText("Return Cars");
        returnNav.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                returnNavMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logoutNav)
                    .addComponent(returnNav)
                    .addComponent(reportNav, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carrNav)
                    .addComponent(rentNav))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(238, 238, 238)
                .addComponent(carrNav)
                .addGap(18, 18, 18)
                .addComponent(rentNav)
                .addGap(18, 18, 18)
                .addComponent(returnNav)
                .addGap(18, 18, 18)
                .addComponent(reportNav)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoutNav)
                .addGap(22, 22, 22))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(74, 78, 105));
        jLabel2.setText("MANAGE CUSTOMERS");
        jLabel2.setFocusable(false);

        customerUpdateBtn.setBackground(new java.awt.Color(150, 103, 224));
        customerUpdateBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        customerUpdateBtn.setForeground(new java.awt.Color(255, 255, 255));
        customerUpdateBtn.setText("Update");
        customerUpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerUpdateBtnActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(74, 78, 105));
        jLabel8.setText("Customer ID");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(74, 78, 105));
        jLabel9.setText("Customer Name");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(74, 78, 105));
        jLabel11.setText("Phone Number");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(74, 78, 105));
        jLabel12.setText("Address");

        customerSaveBtn.setBackground(new java.awt.Color(150, 103, 224));
        customerSaveBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        customerSaveBtn.setForeground(new java.awt.Color(255, 255, 255));
        customerSaveBtn.setText("Register");
        customerSaveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerSaveBtnActionPerformed(evt);
            }
        });

        customerDeleteBtn.setBackground(new java.awt.Color(150, 103, 224));
        customerDeleteBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        customerDeleteBtn.setForeground(new java.awt.Color(255, 255, 255));
        customerDeleteBtn.setText("Delete");
        customerDeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerDeleteBtnActionPerformed(evt);
            }
        });

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(74, 78, 105));
        jLabel13.setText("REGISTERED CUSTOMERS");
        jLabel13.setFocusable(false);

        CustomerTable.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CustomerTable.setForeground(new java.awt.Color(74, 78, 105));
        CustomerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "CustomerID", "CustomerName", "Address", "PhoneNo"
            }
        ));
        CustomerTable.setGridColor(new java.awt.Color(255, 255, 255));
        CustomerTable.setSelectionBackground(new java.awt.Color(255, 255, 255));
        CustomerTable.setSelectionForeground(new java.awt.Color(74, 78, 105));
        CustomerTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CustomerTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(CustomerTable);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(customerSaveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(customerDeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(customerUpdateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 214, Short.MAX_VALUE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(customerIDField, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(CustomerNameFeild, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(AddressFeild)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(phoneNoField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(31, 31, 31))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(customerIDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CustomerNameFeild, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddressFeild, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneNoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(customerUpdateBtn)
                    .addComponent(customerSaveBtn)
                    .addComponent(customerDeleteBtn))
                .addGap(18, 18, 18)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void customerSaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerSaveBtnActionPerformed
               String customerID = customerIDField.getText().trim();
    String customerName = CustomerNameFeild.getText().trim();
    String phoneNumber = phoneNoField.getText().trim();
    String address = AddressFeild.getText().trim();

    // Input validation
    if (customerID.isEmpty()) {
        // Display an error message for invalid customer ID
        displayMessage("Invalid customer ID. Please enter a numeric ID.");
        return; // Exit the method to prevent saving invalid data
    }

    if (customerName.isEmpty()) {
        // Display an error message for empty customer name
        displayMessage("Please enter a customer name.");
        return; // Exit the method to prevent saving invalid data
    }

  
    if (address.isEmpty() || address.length() > 100) {
        // Display an error message for invalid address
        displayMessage("Invalid address. Please enter a valid address ");
        return; // Exit the method to prevent saving invalid data
    }
    
     if (phoneNumber.isEmpty() || !phoneNumber.matches("\\d{10}")) {
    // Display an error message for invalid phone number
    displayMessage("Invalid phone number.");
    return; // Exit the method to prevent saving invalid data
}

     
    // If all validations pass, proceed to save the data to the database
    saveCusToDatabase();
   // TODO add your handling code here:
    }//GEN-LAST:event_customerSaveBtnActionPerformed

    private void CustomerTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CustomerTableMouseClicked
                  int selectedRow = CustomerTable.getSelectedRow();
    if (selectedRow != -1) {
        // A row is selected, so you can retrieve the data from the selected row
        DefaultTableModel tableModel = (DefaultTableModel) CustomerTable.getModel();
        String customerID = tableModel.getValueAt(selectedRow, 0).toString();
        String customerName = tableModel.getValueAt(selectedRow, 1).toString();
        String address = tableModel.getValueAt(selectedRow, 2).toString();
        int phone = Integer.parseInt(tableModel.getValueAt(selectedRow, 3).toString());

        // Populate the text fields and combo box with the selected customer's data
        customerIDField.setText(String.valueOf(customerID));
        CustomerNameFeild.setText(customerName);
        AddressFeild.setText(address);
        phoneNoField.setText(String.valueOf(phone));

        // You can also enable the "Update" and "Delete" buttons here if needed
        customerUpdateBtn.setEnabled(true);
        customerDeleteBtn.setEnabled(true);
    }
        // TODO add your handling code here:
    }//GEN-LAST:event_CustomerTableMouseClicked

    private void customerDeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerDeleteBtnActionPerformed
                  int selectedRow = CustomerTable.getSelectedRow();
        if (selectedRow != -1) {
            DefaultTableModel tableModel = (DefaultTableModel) CustomerTable.getModel();
            String CustomerID = (String) tableModel.getValueAt(selectedRow, 0); // Assuming carRegistration is in the first column

            // Call the controller to delete the car
            controller.deleteCustomer(CustomerID);
            
            // Remove the selected row from the table (optional)
            tableModel.removeRow(selectedRow);
        } else {
            JOptionPane.showMessageDialog(this, "Please select a Customer to delete.");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_customerDeleteBtnActionPerformed

    private void customerUpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerUpdateBtnActionPerformed
                     int selectedRow = CustomerTable.getSelectedRow();
        if (selectedRow != -1) {
            // Get the updated data from the UI components
            String updatedCustomerID = customerIDField.getText();
            String updatedCustomerName = CustomerNameFeild.getText();
            String updatedAddress = AddressFeild.getText();
            int updatedPhone = Integer.parseInt(phoneNoField.getText());
            
            // Call the controller's updateCar method
            controller.updateCustomer(selectedRow,updatedCustomerID, updatedCustomerName, updatedAddress, updatedPhone);
        } else {
            JOptionPane.showMessageDialog(this, "Please select a customer to update.");
        }             // TODO add your handling code here:
    }//GEN-LAST:event_customerUpdateBtnActionPerformed

    private void carrNavMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carrNavMouseClicked
        dispose(); 
        Cars newForm = new Cars();

        // Set the behavior of the new form (e.g., default close operation)
        newForm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Display the new form
        newForm.pack();
        newForm.setVisible(true);
        // TODO add your handling code here:
    
    }//GEN-LAST:event_carrNavMouseClicked

    private void rentNavMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rentNavMouseClicked
        dispose(); 
        RentCar newForm = new RentCar();

        // Set the behavior of the new form (e.g., default close operation)
        newForm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Display the new form
        newForm.pack();
        newForm.setVisible(true);
        // TODO add your handling code here:
      
    }//GEN-LAST:event_rentNavMouseClicked

    private void returnNavMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_returnNavMouseClicked
        dispose(); 
        ReturnCars newForm = new ReturnCars();

        // Set the behavior of the new form (e.g., default close operation)
        newForm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Display the new form
        newForm.pack();
        newForm.setVisible(true);
        // TODO add your handling code here:
      
    }//GEN-LAST:event_returnNavMouseClicked

    private void logoutNavMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutNavMouseClicked
          dispose(); 
        Login newForm = new Login();

        // Set the behavior of the new form (e.g., default close operation)
        newForm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Display the new form
        newForm.pack();
        newForm.setVisible(true);
        // TODO add your handling code here:
       
    }//GEN-LAST:event_logoutNavMouseClicked

    private void reportNavMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportNavMouseClicked
                dispose(); 
        Reports newForm = new Reports();

        // Set the behavior of the new form 
        newForm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Display the new form
        newForm.pack();
        newForm.setVisible(true);         // TODO add your handling code here:
    }//GEN-LAST:event_reportNavMouseClicked

    
      private void saveCusToDatabase() {
        String customerID = customerIDField.getText();
        String customerName = CustomerNameFeild.getText();
        String address = AddressFeild.getText();
        int phone = Integer.parseInt(phoneNoField.getText());

        // Call the controller's saveCustomer method
        controller.saveCustomer(customerID, customerName, address, phone);
    }

    public void addCustomerRow(String customerID, String customerName, String address, int phoneNo) {
        DefaultTableModel tableModel = (DefaultTableModel) CustomerTable.getModel();
        tableModel.addRow(new Object[]{customerID, customerName, address, phoneNo});
    }
     
     public void updateCustomerRow(int selectedRow, String updatedCustomerID, String updatedCustomerName, String updatedAddress, int updatedPhone) {
        DefaultTableModel tableModel = (DefaultTableModel) CustomerTable.getModel();
        tableModel.setValueAt(updatedCustomerID, selectedRow, 0);
        tableModel.setValueAt(updatedCustomerName, selectedRow, 1);
        tableModel.setValueAt(updatedAddress, selectedRow, 2);
        tableModel.setValueAt(updatedPhone, selectedRow, 3);
       
    }
     
      public void displayMessage(String message) {
        JOptionPane.showMessageDialog(this, message);
    }

     
     

    public void clearInputFields() {
        customerIDField.setText("");
        CustomerNameFeild.setText("");
        AddressFeild.setText("");
        phoneNoField.setText("");
    }
    
    private void displayExistingCustomerData() {
    MCustomers CustomerDAO = new MCustomers();
    List<ContCustomerData> customerDataList = CustomerDAO.getAllCustomerData();

    DefaultTableModel tableModel = (DefaultTableModel) CustomerTable.getModel();
    tableModel.setRowCount(0); // Clear existing rows

    for (ContCustomerData customerData : customerDataList) {
        tableModel.addRow(new Object[]{customerData.getcustomerID(), customerData.getcustomerName(), customerData.getaddress(), customerData.getPhone()});
    }
}
    
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
            java.util.logging.Logger.getLogger(Customers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Customers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Customers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Customers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Customers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AddressFeild;
    private javax.swing.JTextField CustomerNameFeild;
    private javax.swing.JTable CustomerTable;
    private javax.swing.JLabel carrNav;
    private javax.swing.JButton customerDeleteBtn;
    private javax.swing.JTextField customerIDField;
    private javax.swing.JButton customerSaveBtn;
    private javax.swing.JButton customerUpdateBtn;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel logoutNav;
    private javax.swing.JTextField phoneNoField;
    private javax.swing.JLabel rentNav;
    private javax.swing.JLabel reportNav;
    private javax.swing.JLabel returnNav;
    // End of variables declaration//GEN-END:variables
}
