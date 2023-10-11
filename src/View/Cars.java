/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Model.MCars;
import Controller.ContCars;
import Controller.ContCarData;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Controller.NumericTextFieldKeyListener;
import Controller.SriLankaVehiclePlateInputVerifier;
import Controller.LettersSpaceDotTextFieldKeyListener;
import javax.swing.JFrame;


/**
 *
 * @author Hp
 */
public class Cars extends javax.swing.JFrame {

    private final ContCars controller;
    public Cars() {
        initComponents();
        MCars model = new MCars();
        controller = new ContCars(this, model);
        displayExistingCarData();
        priceField.addKeyListener(new NumericTextFieldKeyListener());
        carRegistrationField.setInputVerifier(new SriLankaVehiclePlateInputVerifier());
        brandField.addKeyListener(new LettersSpaceDotTextFieldKeyListener());
        

    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        reportNav = new javax.swing.JLabel();
        logoutNav = new javax.swing.JLabel();
        customerNav = new javax.swing.JLabel();
        rentNav = new javax.swing.JLabel();
        returnNav = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        carUpdateBtn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        carSaveBtn = new javax.swing.JButton();
        carDeleteBtn = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        carRegistrationField = new javax.swing.JTextField();
        brandField = new javax.swing.JTextField();
        modelField = new javax.swing.JTextField();
        priceField = new javax.swing.JTextField();
        statusComboBox = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        carTable = new javax.swing.JTable();

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

        customerNav.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        customerNav.setForeground(new java.awt.Color(74, 78, 105));
        customerNav.setText("Customers");
        customerNav.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customerNavMouseClicked(evt);
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
                    .addComponent(customerNav)
                    .addComponent(rentNav))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(238, 238, 238)
                .addComponent(customerNav)
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
        jLabel2.setText("MANAGE CARS");
        jLabel2.setFocusable(false);

        carUpdateBtn.setBackground(new java.awt.Color(150, 103, 224));
        carUpdateBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        carUpdateBtn.setForeground(new java.awt.Color(255, 255, 255));
        carUpdateBtn.setText("Update");
        carUpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carUpdateBtnActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(74, 78, 105));
        jLabel8.setText("Registeration ID");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(74, 78, 105));
        jLabel9.setText("Brand");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(74, 78, 105));
        jLabel10.setText("Status");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(74, 78, 105));
        jLabel11.setText("Price PerDay");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(74, 78, 105));
        jLabel12.setText("Model");

        carSaveBtn.setBackground(new java.awt.Color(150, 103, 224));
        carSaveBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        carSaveBtn.setForeground(new java.awt.Color(255, 255, 255));
        carSaveBtn.setText("Register");
        carSaveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carSaveBtnActionPerformed(evt);
            }
        });

        carDeleteBtn.setBackground(new java.awt.Color(150, 103, 224));
        carDeleteBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        carDeleteBtn.setForeground(new java.awt.Color(255, 255, 255));
        carDeleteBtn.setText("Delete");
        carDeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carDeleteBtnActionPerformed(evt);
            }
        });

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(74, 78, 105));
        jLabel13.setText("REGISTERED CARS");
        jLabel13.setFocusable(false);

        statusComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Available", "Booked" }));

        carTable.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        carTable.setForeground(new java.awt.Color(74, 78, 105));
        carTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Registration", "Brand", "Model", "Status", "PricePerDay"
            }
        ));
        carTable.setGridColor(new java.awt.Color(255, 255, 255));
        carTable.setSelectionBackground(new java.awt.Color(255, 255, 255));
        carTable.setSelectionForeground(new java.awt.Color(74, 78, 105));
        carTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                carTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(carTable);

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
                                .addComponent(carSaveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(carDeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(carUpdateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(carRegistrationField, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(brandField, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(modelField, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(statusComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(priceField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(carRegistrationField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(brandField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modelField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(priceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(statusComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(carUpdateBtn)
                    .addComponent(carSaveBtn)
                    .addComponent(carDeleteBtn))
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
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void carSaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carSaveBtnActionPerformed
        
    String carRegistration = carRegistrationField.getText().trim();
    String brand = brandField.getText().trim();
    String model = modelField.getText().trim();
    String priceS = priceField.getText().trim();
    String status = (String) statusComboBox.getSelectedItem();

   
    if (carRegistration.isEmpty()) {
       
        
        displayMessage("Please enter Registration ID ");
        return;
    }

   
    if (brand.isEmpty()) {
        
       
        displayMessage("Please enter Brand ");
        return;
        
    }

    
    if (model.isEmpty()) {
        
      
        displayMessage("Please enter Model ");
        return;
    }

   
    if (priceS.isEmpty()) {
                
        displayMessage("Please enter Price ");
       return;
    }
    
        double price = Double.parseDouble(priceS);
        controller.saveCarToDatabase(carRegistration, brand, model, status, price);
  
    }//GEN-LAST:event_carSaveBtnActionPerformed

  

    private void carDeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carDeleteBtnActionPerformed
                     int selectedRow = carTable.getSelectedRow();
        if (selectedRow != -1) {
            DefaultTableModel tableModel = (DefaultTableModel) carTable.getModel();
            String carRegistration = (String) tableModel.getValueAt(selectedRow, 0); // Assuming carRegistration is in the first column

            // Call the controller to delete the car
            controller.deleteCar(carRegistration);
            
            // Remove the selected row from the table (optional)
            tableModel.removeRow(selectedRow);
        } else {
            JOptionPane.showMessageDialog(this, "Please select a car to delete.");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_carDeleteBtnActionPerformed

    private void carUpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carUpdateBtnActionPerformed
             int selectedRow = carTable.getSelectedRow();
        if (selectedRow != -1) {
            // Get the updated data from the UI components
            String updatedCarRegistration = carRegistrationField.getText();
            String updatedBrand = brandField.getText();
            String updatedModel = modelField.getText();
            String updatedStatus = (String) statusComboBox.getSelectedItem();
            double updatedPrice = Double.parseDouble(priceField.getText());
            
            // Call the controller's updateCar method
            controller.updateCar(selectedRow, updatedCarRegistration, updatedBrand, updatedModel, updatedStatus, updatedPrice);
        } else {
            JOptionPane.showMessageDialog(this, "Please select a car to update.");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_carUpdateBtnActionPerformed

    private void carTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carTableMouseClicked

    int selectedRow = carTable.getSelectedRow();
    if (selectedRow != -1) {
        // A row is selected, so you can retrieve the data from the selected row
        DefaultTableModel tableModel = (DefaultTableModel) carTable.getModel();
        String carRegistration = (String) tableModel.getValueAt(selectedRow, 0);
        String brand = (String) tableModel.getValueAt(selectedRow, 1);
        String model = (String) tableModel.getValueAt(selectedRow, 2);
        String status = (String) tableModel.getValueAt(selectedRow, 3);
        double price = (double) tableModel.getValueAt(selectedRow, 4);

        // Populate the text fields and combo box with the selected car's data
        carRegistrationField.setText(carRegistration);
        brandField.setText(brand);
        modelField.setText(model);
        statusComboBox.setSelectedItem(status);
        priceField.setText(String.valueOf(price));

        // You can also enable the "Update" and "Delete" buttons here if needed
        carUpdateBtn.setEnabled(true);
        carDeleteBtn.setEnabled(true);
    }       
    }//GEN-LAST:event_carTableMouseClicked

    private void customerNavMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerNavMouseClicked
        dispose(); 
        Customers newForm = new Customers();

        // Set the behavior of the new form (e.g., default close operation)
        newForm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Display the new form
        newForm.pack();
        newForm.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_customerNavMouseClicked

    private void rentNavMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rentNavMouseClicked
        dispose(); 
        RentCar newForm = new RentCar();

        // Set the behavior of the new form (e.g., default close operation)
        newForm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Display the new form
        newForm.pack();
        newForm.setVisible(true);
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

        // Set the behavior of the new form 
        newForm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Display the new form
        newForm.pack();
        newForm.setVisible(true);
     
    }//GEN-LAST:event_logoutNavMouseClicked

    private void reportNavMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportNavMouseClicked
              dispose(); 
        Reports newForm = new Reports();

        // Set the behavior of the new form 
        newForm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Display the new form
        newForm.pack();
        newForm.setVisible(true);       // TODO add your handling code here:
    }//GEN-LAST:event_reportNavMouseClicked

    
     public void displayMessage(String message) {
        JOptionPane.showMessageDialog(this, message);
    }

    public void addToCarList(String carRegistration, String brand, String model, String status, double price) {
        DefaultTableModel tableModel = (DefaultTableModel) carTable.getModel();
        tableModel.addRow(new Object[]{carRegistration, brand, model, status, price});
    }
    
    public void clearInputFields() {
    carRegistrationField.setText("");
    brandField.setText("");
    modelField.setText("");
    statusComboBox.setSelectedIndex(0); // Reset to the first status option
    priceField.setText("");
}
    
    private void displayExistingCarData() {
    MCars carDAO = new MCars();
    List<ContCarData> carDataList = carDAO.getAllCarData();

    DefaultTableModel tableModel = (DefaultTableModel) carTable.getModel();
    tableModel.setRowCount(0); // Clear existing rows

    for (ContCarData carData : carDataList) {
        tableModel.addRow(new Object[]{carData.getCarRegistration(), carData.getBrand(), carData.getModel(), carData.getStatus(), carData.getPrice()});
    }
}
    
     public void updateCarRow(int selectedRow, String updatedCarRegistration, String updatedBrand, String updatedModel, String updatedStatus, double updatedPrice) {
        DefaultTableModel tableModel = (DefaultTableModel) carTable.getModel();
        tableModel.setValueAt(updatedCarRegistration, selectedRow, 0);
        tableModel.setValueAt(updatedBrand, selectedRow, 1);
        tableModel.setValueAt(updatedModel, selectedRow, 2);
        tableModel.setValueAt(updatedStatus, selectedRow, 3);
        tableModel.setValueAt(updatedPrice, selectedRow, 4);
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
            java.util.logging.Logger.getLogger(Cars.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cars.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cars.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cars.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cars().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField brandField;
    private javax.swing.JButton carDeleteBtn;
    private javax.swing.JTextField carRegistrationField;
    private javax.swing.JButton carSaveBtn;
    private javax.swing.JTable carTable;
    private javax.swing.JButton carUpdateBtn;
    private javax.swing.JLabel customerNav;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JTextField modelField;
    private javax.swing.JTextField priceField;
    private javax.swing.JLabel rentNav;
    private javax.swing.JLabel reportNav;
    private javax.swing.JLabel returnNav;
    private javax.swing.JComboBox<String> statusComboBox;
    // End of variables declaration//GEN-END:variables
}
