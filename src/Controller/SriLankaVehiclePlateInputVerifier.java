/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.JTextField;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import View.Customers;
/**
 *
 * @author Hp
 */
public class SriLankaVehiclePlateInputVerifier extends InputVerifier {
    Customers View=new Customers();
      @Override
    public boolean verify(JComponent input) {
        JTextField textField = (JTextField) input;
        String plate = textField.getText().trim();

         String oldFormat = "^[A-Z]{1,2} \\d{1,4}$";
        String sinhalaFormat = "^1 Sri \\d{1,4}$";
        String currentFormat = "^[A-Z]{3} \\d{4}$";
        String hyphenFormat = "^\\d{1,3}-\\d{1,4}$";
        String letterFormat = "^[A-Z]{2,3}-\\d{1,4}$";

        // Create pattern objects
        Pattern oldPattern = Pattern.compile(oldFormat);
        Pattern sinhalaPattern = Pattern.compile(sinhalaFormat);
        Pattern currentPattern = Pattern.compile(currentFormat);
        Pattern hyphenPattern = Pattern.compile(hyphenFormat);
        Pattern letterPattern = Pattern.compile(letterFormat);

        // Check if the plate matches any of the valid formats
        Matcher oldMatcher = oldPattern.matcher(plate);
        Matcher sinhalaMatcher = sinhalaPattern.matcher(plate);
        Matcher currentMatcher = currentPattern.matcher(plate);
        Matcher hyphenMatcher = hyphenPattern.matcher(plate);
        Matcher letterMatcher = letterPattern.matcher(plate);

        boolean isValid = oldMatcher.matches() || sinhalaMatcher.matches() || currentMatcher.matches() || hyphenMatcher.matches() || letterMatcher.matches();
        
        
          if (plate.isEmpty()) {
            return true; // Allow empty input
           }
          else if (!isValid) {
            View.displayMessage("Invalid Car Registration number.");
            // Display an error message for invalid plates
            textField.setText(""); // Clear the text field
            textField.requestFocus(); // Set focus to the text field
        }
        

        return isValid;
    }


}