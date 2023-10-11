/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Model.MRent;
import View.RentCar;
import java.util.Date;
/**
 *
 * @author Hp
 */
public class ContRent {
    
    private final RentCar view;
    private final MRent model;

    public ContRent(RentCar view,MRent model) {
        this.view = view;
        this.model = new MRent();
    }
    
    
    public void saveRentToDatabase( String carRegistration, String customerId,
            Date rentdate, Date returndate, double rentfee) {
         boolean success  = model.saveRent( carRegistration, customerId, rentdate, returndate,rentfee);
        
        
        if (success) {
        view.displayMessage("Rent added successfully.");
      

        // Clear the input fields after successful insertion
        view.clearInputFields();
    } else {
        view.displayMessage("Failed to add rent.");
    }

   
}
       
    
}
