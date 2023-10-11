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
public class AddressTextFieldKeyListener extends KeyAdapter {
    @Override
    public void keyTyped(KeyEvent e) {
        char c = e.getKeyChar();

        // Allow letters, digits, spaces, common punctuation marks, and some special characters
        if (!Character.isLetterOrDigit(c) && !Character.isWhitespace(c) &&
            c != ',' && c != '.' && c != '-' && c != '/' && c != '#' &&
            c != '(' && c != ')' && c != '&' && c != '\'') {
            e.consume(); // Ignore the key event
        }

        JTextField textField = (JTextField) e.getSource();
        String text = textField.getText();
        
        // Limit the input to a reasonable length (adjust as needed)
        if (text.length() >= 100) {
            e.consume(); // Ignore the key event
        }
    }
}
