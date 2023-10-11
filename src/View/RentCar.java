/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.ContCarData;
import Model.MCars;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import Controller.ContRent;
import Controller.ContRentData;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import Model.DbConnection;
import Model.MRent;
import com.toedter.calendar.JDateChooser;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JFrame;

/**
 *
 * @author Hp
 */
public class RentCar extends javax.swing.JFrame {
        
   
     MRent model=new MRent(); 
     private final ContRent controller;
    
  
    /**
     * Creates new form RentCar
     */
    public RentCar() {
        initComponents();
        loadCarRegistrationData();
        displayExistingCarData();
        loadCusName();
        controller = new ContRent(this, model);
        displayExistingRentData();
       
        setCurrentDate(rentDate);
        
       
    
        
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
        rentCarBtn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        rentFeeField = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        carTable = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        rentedCarTable = new javax.swing.JTable();
        RegistrationIDComboBox = new javax.swing.JComboBox<>();
        CustomerIDComboBox = new javax.swing.JComboBox<>();
        rentDate = new com.toedter.calendar.JDateChooser();
        returnDate = new com.toedter.calendar.JDateChooser();

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
        jLabel2.setText("RENT CARS");
        jLabel2.setFocusable(false);

        rentCarBtn.setBackground(new java.awt.Color(150, 103, 224));
        rentCarBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rentCarBtn.setForeground(new java.awt.Color(255, 255, 255));
        rentCarBtn.setText("Rent");
        rentCarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rentCarBtnActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(74, 78, 105));
        jLabel8.setText("Registeration ID");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(74, 78, 105));
        jLabel9.setText("Customer ID");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(74, 78, 105));
        jLabel10.setText("Return Date");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(74, 78, 105));
        jLabel11.setText("Rent Fee");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(74, 78, 105));
        jLabel12.setText("Rent Date");

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(74, 78, 105));
        jLabel13.setText("AVAILABLE CARS");
        jLabel13.setFocusable(false);

        rentFeeField.setEditable(false);

        carTable.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
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
        jScrollPane2.setViewportView(carTable);

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(74, 78, 105));
        jLabel14.setText("RENTED CARS");
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

        RegistrationIDComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        returnDate.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                returnDatePropertyChange(evt);
            }
        });

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
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CustomerIDComboBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(rentDate, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2)))
                                .addComponent(returnDate, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rentFeeField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(RegistrationIDComboBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(rentCarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 617, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(175, 175, 175)
                                .addComponent(jLabel13))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(201, 201, 201)
                                .addComponent(jLabel14)))
                        .addGap(31, 31, 31))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RegistrationIDComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CustomerIDComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rentDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(returnDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rentFeeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(rentCarBtn))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void setCurrentDate(JDateChooser dateChooser) {
        Calendar currentDate = Calendar.getInstance();
        dateChooser.setDate(currentDate.getTime());
       
    }
    
    private boolean validateRentDates() {
    Date rentDateValue = rentDate.getDate();
    Date returnDateValue = returnDate.getDate();

    if (rentDateValue == null ) {
        displayMessage("Please select rent date");
        return false; // Validation failed
    }

    if ( returnDateValue == null) {
        displayMessage("Please select return date");
        return false; // Validation failed
    }

    // All validations passed
    return true;
}
    
    private void rentCarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rentCarBtnActionPerformed
       
         if (validateRentDates()) {
         String carRegistration = (String) RegistrationIDComboBox.getSelectedItem();
        String customerId =(String) CustomerIDComboBox.getSelectedItem();
        Date rentalDate = rentDate.getDate();
        Date returnsDate=returnDate.getDate();
        double rentFee = Double.parseDouble(rentFeeField.getText());

        controller.saveRentToDatabase(carRegistration, customerId, rentalDate, returnsDate, rentFee);
         
             DefaultTableModel tableMode2 = (DefaultTableModel) rentedCarTable.getModel();
            
             tableMode2.setRowCount(0);

    // Call the method to fetch and display data 
             displayExistingRentData();
            
                  DefaultTableModel tableMode3 = (DefaultTableModel) carTable.getModel();
            
             tableMode3.setRowCount(0);

    // Call the method to fetch and display data 
             displayExistingCarData();
            loadCarRegistrationData();

      // TODO add your handling code here:
       
         
        
    }
       
    }//GEN-LAST:event_rentCarBtnActionPerformed

        public void clearInputFields() {
    RegistrationIDComboBox.setSelectedIndex(0); 
    CustomerIDComboBox.setSelectedIndex(0); 
    rentDate.setDate(null);
    returnDate.setDate(null);
    rentFeeField.setText("");
    // Reset to the first status option
   
}
    
        
    private void returnDatePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_returnDatePropertyChange
           Date rent = rentDate.getDate();
    Date returnD = returnDate.getDate();

    if (returnD != null && rent != null && returnD.before(rent)) {
        displayMessage("Return date cannot be earlier than the rent date.");
        returnDate.setDate(null); // Clear the return date field
    }
    else{
        String selectedCarRegistration = RegistrationIDComboBox.getSelectedItem().toString();
            double carPrice = model.getCarPriceByRegistration(selectedCarRegistration);
            calculatePrice(carPrice);
    }// TODO add your handling code here:
    }//GEN-LAST:event_returnDatePropertyChange

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

    private void loadCarRegistrationData() {
        try {
            // Establish a database connection
            try (Connection connection = DbConnection.getConnection()) {
                String sql = "SELECT carRegistration FROM Car where status='Available' ";
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                ResultSet resultSet = preparedStatement.executeQuery();

                // Create a DefaultComboBoxModel to store the car registration data
                DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>();

                // Iterate through the result set and add car registration values to the model
                while (resultSet.next()) {
                    String carRegistration = resultSet.getString("carRegistration");
                    comboBoxModel.addElement(carRegistration);
                }

                // Set the model with car registration data to the carCom JComboBox
                RegistrationIDComboBox.setModel(comboBoxModel);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
        }
    }
    
    private void calculatePrice(double carPrice) {
        Date rentalDate = rentDate.getDate();
        Date returnsDate = returnDate.getDate();
        
        double totalPrice = model.calculatePrice(rentalDate, returnsDate, carPrice);
        rentFeeField.setText(String.valueOf(totalPrice));
    }
    
     
     public void displayMessage(String message) {
        JOptionPane.showMessageDialog(this, message);
    }

 

       
 
    private void loadCusName() {
        try {
            // Establish a database connection
            try (Connection connection = DbConnection.getConnection()) {
                String sql = "SELECT CustomerID FROM Customer";
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                ResultSet resultSet = preparedStatement.executeQuery();

                // Create a DefaultComboBoxModel to store the car registration data
                DefaultComboBoxModel<String> comboBoxMode2 = new DefaultComboBoxModel<>();

                // Iterate through the result set and add car registration values to the model
                while (resultSet.next()) {
                    String CustomerID = resultSet.getString("CustomerID");
                    comboBoxMode2.addElement(CustomerID);
                }

                // Set the model with car registration data to the carCom JComboBox
               CustomerIDComboBox.setModel(comboBoxMode2);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
        }
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
    
    private void displayExistingCarData() {
    MRent carDAO = new MRent();
    List<ContCarData> carDataList = carDAO.getAvailableCarData();

    DefaultTableModel tableModel = (DefaultTableModel) carTable.getModel();
    tableModel.setRowCount(0); // Clear existing rows

    for (ContCarData carData : carDataList) {
        tableModel.addRow(new Object[]{carData.getCarRegistration(), carData.getBrand(), carData.getModel(), carData.getStatus(), carData.getPrice()});
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
            java.util.logging.Logger.getLogger(RentCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RentCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RentCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RentCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new RentCar().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CustomerIDComboBox;
    private javax.swing.JComboBox<String> RegistrationIDComboBox;
    private javax.swing.JTable carTable;
    private javax.swing.JLabel carrNav;
    private javax.swing.JLabel customerNav;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel logoutNav;
    private javax.swing.JButton rentCarBtn;
    private com.toedter.calendar.JDateChooser rentDate;
    private javax.swing.JTextField rentFeeField;
    private javax.swing.JTable rentedCarTable;
    private javax.swing.JLabel reportNav;
    private com.toedter.calendar.JDateChooser returnDate;
    private javax.swing.JLabel returnNav;
    // End of variables declaration//GEN-END:variables
}
