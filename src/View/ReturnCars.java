/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.ContCarData;
import Model.DbConnection;
import Model.MReturn;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Controller.ContRentData;
import Controller.ContReturn;
import Controller.ContReturnData;
import Model.MRent;
import java.util.Date;
import javax.swing.JFrame;

public class ReturnCars extends javax.swing.JFrame {

      MReturn model=new MReturn(); 
      private final ContReturn controller;
    /**
     * Creates new form ReturnCars
     */
    public ReturnCars() {
        initComponents();
        loadRentID();
        controller = new ContReturn(this,model);
        displayExistingRentData();
        displayExistingReturnData();
        
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        reportNav = new javax.swing.JLabel();
        logoutNav = new javax.swing.JLabel();
        carrNav = new javax.swing.JLabel();
        customerNav = new javax.swing.JLabel();
        returnNav = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        returnBtn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        fineBtn = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        delayFeild = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        rentedCarTable = new javax.swing.JTable();
        RentIDComboBox = new javax.swing.JComboBox<>();
        returnedDate = new com.toedter.calendar.JDateChooser();
        jLabel15 = new javax.swing.JLabel();
        fineFeild = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        returnCarTable = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        totalFeeFeild = new javax.swing.JTextField();

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

        customerNav.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        customerNav.setForeground(new java.awt.Color(74, 78, 105));
        customerNav.setText("Customers");
        customerNav.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customerNavMouseClicked(evt);
            }
        });

        returnNav.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        returnNav.setForeground(new java.awt.Color(74, 78, 105));
        returnNav.setText("Rent Cars");
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
                    .addComponent(customerNav))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(238, 238, 238)
                .addComponent(carrNav)
                .addGap(18, 18, 18)
                .addComponent(customerNav)
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
        jLabel2.setText("RETURN CARS");
        jLabel2.setFocusable(false);

        returnBtn.setBackground(new java.awt.Color(150, 103, 224));
        returnBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        returnBtn.setForeground(new java.awt.Color(255, 255, 255));
        returnBtn.setText("Return");
        returnBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnBtnActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(74, 78, 105));
        jLabel8.setText("Return ID");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(74, 78, 105));
        jLabel10.setText("Returned Date");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(74, 78, 105));
        jLabel11.setText("Delay");

        fineBtn.setBackground(new java.awt.Color(150, 103, 224));
        fineBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        fineBtn.setForeground(new java.awt.Color(255, 255, 255));
        fineBtn.setText("Fine");
        fineBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fineBtnActionPerformed(evt);
            }
        });

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(74, 78, 105));
        jLabel13.setText("RENTED CARS");
        jLabel13.setFocusable(false);

        delayFeild.setEditable(false);

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(74, 78, 105));
        jLabel14.setText("RETURNED CARS");
        jLabel14.setFocusable(false);

        rentedCarTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "RentID", "RegistrationID", "CustomerID", "RentDate", "ReturnDate", "RentFee"
            }
        ));
        jScrollPane1.setViewportView(rentedCarTable);

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(74, 78, 105));
        jLabel15.setText("Fine");

        fineFeild.setEditable(false);

        returnCarTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ReturnID", "RentID", "ReturnedDate", "Delay", "Fine", "Total"
            }
        ));
        jScrollPane3.setViewportView(returnCarTable);

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(74, 78, 105));
        jLabel16.setText("Total Fee");

        totalFeeFeild.setEditable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addGap(235, 235, 235))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(returnedDate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(RentIDComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, 130, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(delayFeild, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(fineFeild, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(returnBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(fineBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(totalFeeFeild, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(232, 232, 232)
                                .addComponent(jLabel14)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))))))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(196, 196, 196)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 627, Short.MAX_VALUE)
                    .addGap(21, 21, 21)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RentIDComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(returnedDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel11))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(delayFeild, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fineFeild, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(totalFeeFeild, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(fineBtn)
                .addGap(18, 18, 18)
                .addComponent(returnBtn)
                .addContainerGap(78, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(392, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(46, 46, 46)))
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
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

      private boolean validateReturendDate() {
    Date returnedDateValue = returnedDate.getDate();
 
    if (returnedDateValue == null ) {
        displayMessage("Please select returned date");
        return false; // Validation failed
    }

   

    // All validations passed
    return true;
}
    
    private void fineBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fineBtnActionPerformed
        if (validateReturendDate()) {
        String rentid = (String) RentIDComboBox.getSelectedItem();
        Date realreturnedDate=returnedDate.getDate();
        int delayInDays=controller.ReturnDelay(rentid,realreturnedDate);
        double fine=model.calculateFine(delayInDays,rentid);
        double rentFee=model.FindRentFee(rentid);
        double totalFee=controller.FindTotal(fine, rentFee);
        delayFeild.setText(Integer.toString(delayInDays));
        fineFeild.setText(Double.toString(fine));
        totalFeeFeild.setText(Double.toString(totalFee));
        }
        
// TODO add your handling code here:
    }//GEN-LAST:event_fineBtnActionPerformed

    private void returnBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnBtnActionPerformed
        String rentidStr = (String) RentIDComboBox.getSelectedItem();
        int rentid = Integer.parseInt(rentidStr);
        Date realreturnedDate = returnedDate.getDate();
        String delayS = delayFeild.getText().trim();
        String fineS = fineFeild.getText().trim();
        String totalFeeS = totalFeeFeild.getText().trim();
        
     

    // Input validation
        if (totalFeeS.isEmpty()  || delayS.isEmpty() || fineS.isEmpty()  ) {
        // Display an error message for invalid customer ID
        displayMessage("Please Calculate the Total First");
        return; // Exit the method to prevent saving invalid data
        }
        
        int delay = Integer.parseInt(delayS);
        double totalFee = Double.parseDouble(totalFeeS);
        double fine = Double.parseDouble(fineS);
        controller.saveReturnToDatabase(rentid, realreturnedDate, delay, fine, totalFee);
         
        DefaultTableModel tableMode2 = (DefaultTableModel) rentedCarTable.getModel();
            
        tableMode2.setRowCount(0);

    // Call the method to fetch and display data 
        displayExistingRentData();
             
             
        DefaultTableModel tableMode3 = (DefaultTableModel) returnCarTable.getModel();
            
        tableMode3.setRowCount(0);

    // Call the method to fetch and display data 
             
        displayExistingReturnData();
        loadRentID();
            

      // TODO add your handling code here:
       
              
    }//GEN-LAST:event_returnBtnActionPerformed

    private void carrNavMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carrNavMouseClicked
        dispose(); 
        Cars newForm = new Cars();

        // Set the behavior of the new form 
        newForm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Display the new form
        newForm.pack();
        newForm.setVisible(true);
        // TODO add your handling code here:
      
    }//GEN-LAST:event_carrNavMouseClicked

    private void customerNavMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerNavMouseClicked
          dispose(); 
        Customers newForm = new Customers();

        // Set the behavior of the new form 
        newForm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Display the new form
        newForm.pack();
        newForm.setVisible(true);
        // TODO add your handling code here:
        
    }//GEN-LAST:event_customerNavMouseClicked

    private void returnNavMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_returnNavMouseClicked
        dispose(); 
        RentCar newForm = new RentCar();

        // Set the behavior of the new form 
        newForm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Display the new form
        newForm.pack();
        newForm.setVisible(true);
        // TODO add your handling code here:
      
    }//GEN-LAST:event_returnNavMouseClicked

    private void logoutNavMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutNavMouseClicked
        dispose(); 
        Login newForm = new Login();

        // Set the behavior of the new form 
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
    
      public void displayMessage(String message) {
        JOptionPane.showMessageDialog(this, message);
    }
    private void displayExistingRentData() {
    MRent rentDAO = new MRent();
    List<ContRentData> customerDataList = rentDAO.getRentedData();

    DefaultTableModel tableModel = (DefaultTableModel) rentedCarTable.getModel();
    tableModel.setRowCount(0); // Clear existing rows

    for (ContRentData rentData : customerDataList) {
        tableModel.addRow(new Object[]{rentData.getrentid(), rentData.getcarRegistration(),rentData.getcustomerId(), rentData.getrentdate(), rentData.getreturndate(), rentData.getrentfee()});
    }
}
    
        public void clearInputFields() {
    RentIDComboBox.setSelectedIndex(0); 
    returnedDate.setDate(null);
    delayFeild.setText("");
    fineFeild.setText("");
    totalFeeFeild.setText("");
    // Reset to the first status option
   
}
    private void displayExistingReturnData() {
    MReturn returnDAO = new MReturn();
    List<ContReturnData> creturnDataList = returnDAO.getReturnData();

    DefaultTableModel tableModel = (DefaultTableModel) returnCarTable.getModel();
    tableModel.setRowCount(0); // Clear existing rows

    for (ContReturnData returnData : creturnDataList) {
        tableModel.addRow(new Object[]{returnData.getreturnid(), returnData.getrentid(),returnData.getreturnedDate(), returnData.getdelay(), returnData.getfine(), returnData.gettotalfee()});
    }
}
    
    private void loadRentID() {
        try {
            // Establish a database connection
            try (Connection connection = DbConnection.getConnection()) {
                String sql = "SELECT rentid FROM rent ";
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                ResultSet resultSet = preparedStatement.executeQuery();

                // Create a DefaultComboBoxModel to store the car registration data
                DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>();

                // Iterate through the result set and add car registration values to the model
                while (resultSet.next()) {
                    String rentid = resultSet.getString("rentid");
                    comboBoxModel.addElement(rentid);
                }

                // Set the model with car registration data to the carCom JComboBox
                RentIDComboBox.setModel(comboBoxModel);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
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
            java.util.logging.Logger.getLogger(ReturnCars.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReturnCars.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReturnCars.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReturnCars.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReturnCars().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> RentIDComboBox;
    private javax.swing.JLabel carrNav;
    private javax.swing.JLabel customerNav;
    private javax.swing.JTextField delayFeild;
    private javax.swing.JButton fineBtn;
    private javax.swing.JTextField fineFeild;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel logoutNav;
    private javax.swing.JTable rentedCarTable;
    private javax.swing.JLabel reportNav;
    private javax.swing.JButton returnBtn;
    private javax.swing.JTable returnCarTable;
    private javax.swing.JLabel returnNav;
    private com.toedter.calendar.JDateChooser returnedDate;
    private javax.swing.JTextField totalFeeFeild;
    // End of variables declaration//GEN-END:variables
}
