/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import View.Customers;


/**
 *
 * @author Hp
 */
public class NICInputVerifier  extends InputVerifier {
      
    @Override
    public boolean verify(JComponent input) {
        
        Customers View=new Customers();
        
        JTextField textField = (JTextField) input;
        String nic = textField.getText().trim();

          if (nic.isEmpty()) {
            return true; // Allow empty input
        }
        // Check if the NIC is valid
        if (isOldNICValid(nic) || isNewNICValid(nic)) {
            return true;
        } else {
          View.displayMessage( "Invalid NIC number.");
            textField.requestFocus();
            return false;
        }
    }

    // Validation methods for old and new NICs (as provided earlier)
    private boolean isOldNICValid(String nic) {
        // Old NIC format: 000000000V
        if (nic.matches("\\d{9}[VvXx]")) {
            int yearOfBirth = Integer.parseInt(nic.substring(0, 2));
            int dayOfYear = Integer.parseInt(nic.substring(2, 5));
            char genderCode = nic.charAt(5);
            int serialNumber = Integer.parseInt(nic.substring(6, 9));
            char checkDigit = nic.charAt(9);

            // Add 1900 or 2000 based on the birth year
            if (yearOfBirth < 10) {
                yearOfBirth += 2000;
            } else {
                yearOfBirth += 1900;
            }

            // Check validity based on the rules
            if (yearOfBirth >= 1900 && dayOfYear >= 1 && dayOfYear <= 366
                    && serialNumber >= 1 && serialNumber <= 999) {
                // Implement additional checks if needed (e.g., check gender based on 'genderCode')
                return true;
            }
        }
        return false;
    }

    private boolean isNewNICValid(String nic) {
         // New NIC format: 197419202757
        if (nic.matches("\\d{12}")) {
            int yearOfBirth = Integer.parseInt(nic.substring(0, 4));
            int daysTillBirthday = Integer.parseInt(nic.substring(4, 7));
            int serialNumber = Integer.parseInt(nic.substring(7, 11));
            char checkDigit = nic.charAt(11);

            // Check validity based on the rules
            if (yearOfBirth >= 1900 && daysTillBirthday >= 0 && daysTillBirthday <= 999
                    && serialNumber >= 1 && serialNumber <= 9999) {
                // Implement additional checks if needed
                return true;
            }
        }
        return false;
    }
    
    
   
    
    
}
