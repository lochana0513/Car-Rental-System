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
public class NICFieldKeyListener extends KeyAdapter {
    @Override
    public void keyTyped(KeyEvent e) {
        char c = e.getKeyChar();

        // Allow digits, 'V', and 'v'
        if (!Character.isDigit(c) && c != 'V' && c != 'v') {
            e.consume(); // Ignore the key event
        }

        // Convert 'v' to 'V'
        if (c == 'v') {
            JTextField textField = (JTextField) e.getSource();
            textField.setText(textField.getText() + "V");
            e.consume(); // Ignore the key event
        }
    }
}
