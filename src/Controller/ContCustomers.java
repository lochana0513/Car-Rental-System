/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.MCustomers;
import View.Customers;
import javax.swing.JOptionPane;
/**
 *
 * @author Hp
 */
public class ContCustomers {
    
     private MCustomers model;
     private Customers view;  // Assuming 'Customers' is the name of your Swing JFrame

    public ContCustomers(MCustomers model, Customers view) {
        this.model = model;
        this.view = view;
    }

    public void saveCustomer(String customerID, String customerName, String address, int phone) {
        boolean success = model.saveCustomer(customerID, customerName, address, phone);
        if (success) {
            // Update the view or show a success message
            view.addCustomerRow(customerID, customerName, address, phone);
            JOptionPane.showMessageDialog(view, "Customer added successfully.");
            // Clear the input fields after successful insertion
            view.clearInputFields();
        } else {
            JOptionPane.showMessageDialog(view, "Failed to add Customer.");
        }
    }
    
         public void deleteCustomer(String CustomerID) {
        int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this Customer?", "Confirm Deletion", JOptionPane.YES_NO_OPTION);

        if (confirm == JOptionPane.YES_OPTION) {
            boolean deletionSuccessful = model.deleteCustomer(CustomerID);

            if (deletionSuccessful) {
              
                // Notify the view or handle success as needed
                JOptionPane.showMessageDialog(null, "Customer deleted successfully.");
                 view.clearInputFields();
            } else {
                // Notify the view or handle failure as needed
                JOptionPane.showMessageDialog(null, "Failed to delete Customer from the database.");
            }
        }
    }
    
         
             public void updateCustomer(int selectedRow, String updatedCustomerID, String updatedCustomerName, String updatedAddress, int updatedPhone) {
        int confirm = JOptionPane.showConfirmDialog(view, "Are you sure you want to update this Customer?", "Confirm Update", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            boolean success = model.updateCustomer(updatedCustomerID, updatedCustomerName, updatedAddress, updatedPhone);
            if (success) {
                // Update the view or show a success message
                view.updateCustomerRow(selectedRow, updatedCustomerID, updatedCustomerName, updatedAddress, updatedPhone);
                JOptionPane.showMessageDialog(view, "Customer updated successfully.");
                  view.clearInputFields();
            } else {
                JOptionPane.showMessageDialog(view, "Failed to update Customer in the database.");
            }
        }
    }   
}
