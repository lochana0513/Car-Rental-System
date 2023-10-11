/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.util.Date;
import Model.MReturn;
import View.ReturnCars;
/**
 *
 * @author Hp
 */
public class ContReturn {
    
    private final ReturnCars View;
    private final MReturn Model;
    private int delayInDays;
    
    
     public ContReturn(ReturnCars View, MReturn Model) {
        this.View = View;
        this.Model = Model;
        
        // Add action listeners and set up the controller logic here
    }
    
     public int ReturnDelay(String rentIDCom,Date returnedDate) {                                           
        String selectedrentid =rentIDCom ;
        Date selectedReturnDate = returnedDate;
        
        
        Date expectedReturnDate =Model.getExpectedReturnDate(selectedrentid);

        // Calculate the delay in days
        long delayInMilliseconds = selectedReturnDate.getTime() - expectedReturnDate.getTime();
        delayInDays = (int) (delayInMilliseconds / (24 * 60 * 60 * 1000));
        if (delayInDays < 0) {
            delayInDays=0;
        }
        
	return delayInDays;
    }  
     
     
     public double FindTotal(double fine,double rentfee)
     {
         double totalfee=rentfee+fine;
         return totalfee;
     }
     
     
       public void saveReturnToDatabase( int rentid,Date returnedDate, int delay, Double fine, Double totalfee) {
         boolean success  = Model.saveReturn( rentid, returnedDate, delay, fine,totalfee);
        
        
        if (success) {
        View.displayMessage("Return added successfully.");
      

        // Clear the input fields after successful insertion
        View.clearInputFields();
    } else {
        View.displayMessage("Failed to Return rent.");
    }

   
}
       
   
}
