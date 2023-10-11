/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;
import javax.swing.JTextField;
/**
 *
 * @author Hp
 */
public class PhoneNumberTextFieldKeyListener extends KeyAdapter {
    @Override
    public void keyTyped(KeyEvent e) {
        char c = e.getKeyChar();

        // Allow digits, hyphens, and spaces
        if (!Character.isDigit(c) && c != '-' && c != ' ') {
            e.consume(); // Ignore the key event
        }
        
        JTextField textField = (JTextField) e.getSource();
        String text = textField.getText().replaceAll("[^0-9]", ""); // Remove non-digit characters
        
        // Check if the input is a valid phone number
        if (text.length() >= 1 && text.charAt(0) != '0') {
            e.consume(); // Ignore the key event
        }
        
        // Limit the input to 10 digits
        if (text.length() >= 10) {
            e.consume(); // Ignore the key event
        }
    }
}
