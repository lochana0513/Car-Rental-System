/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;


import javax.swing.JOptionPane;
import Model.MCars;
import View.Cars;

/**
 *
 * @author Hp
 */
public class ContCars {
    
     private final Cars View;
    private final MCars Model;
    
     public ContCars(Cars View, MCars Model) {
        this.View = View;
        this.Model = Model;
        
        // Add action listeners and set up the controller logic here
    }
     
       public void saveCarToDatabase(String carRegistration, String brand, String model, String status, double price) {
        boolean isSuccess = Model.saveCar(carRegistration, brand, model, status, price);
        
        if (isSuccess) {
            View.displayMessage("Car added successfully.");
            View.addToCarList(carRegistration, brand, model, status, price);

            // Clear the input fields after successful insertion
            View.clearInputFields();
        } else {
            View.displayMessage("Failed to add car.");
        }
    }
       
    
       public void deleteCar(String carRegistration) {
        int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this car?", "Confirm Deletion", JOptionPane.YES_NO_OPTION);

        if (confirm == JOptionPane.YES_OPTION) {
            boolean deletionSuccessful = Model.deleteCar(carRegistration);

            if (deletionSuccessful) {
                // Notify the view or handle success as needed
                JOptionPane.showMessageDialog(null, "Car deleted successfully.");
                  View.clearInputFields();
            } else {
                // Notify the view or handle failure as needed
                JOptionPane.showMessageDialog(null, "Failed to delete car from the database.");
            }
        }
    }
       
     public void updateCar(int selectedRow, String updatedCarRegistration, String updatedBrand, String updatedModel, String updatedStatus, double updatedPrice) {
        int confirm = JOptionPane.showConfirmDialog(View, "Are you sure you want to update this car?", "Confirm Update", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            boolean success = Model.updateCar(updatedCarRegistration, updatedBrand, updatedModel, updatedStatus, updatedPrice);
            if (success) {
                // Update the view or show a success message
                View.updateCarRow(selectedRow, updatedCarRegistration, updatedBrand, updatedModel, updatedStatus, updatedPrice);
                JOptionPane.showMessageDialog(View, "Car updated successfully.");
                  View.clearInputFields();
            } else {
                JOptionPane.showMessageDialog(View, "Failed to update car in the database.");
            }
        }
    }   
       
       
    
}
