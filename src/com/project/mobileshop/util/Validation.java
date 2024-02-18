/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.mobileshop.util;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Janitha Dhananjaya
 */
public class Validation {

    public static void phoneNumber(JTextField textFild) {
        String txt = textFild.getText();
        int caretPosition = textFild.getCaretPosition();
        if (!txt.matches("^[0-9]{10}$")) {
            
            txt = txt.substring(0, caretPosition - 1) + txt.substring(caretPosition);
            textFild.setText(txt);
            textFild.setCaretPosition(caretPosition - 1);
        }

    }

    public static void priceText(JTextField textField) {
        String text = textField.getText();
        if (!text.isEmpty()) {
            boolean res = text.matches("[0-9]+[.]?[0-9]{0,2}");
            if (!res) {
                textField.setText(text.substring(0, text.length() - 1));
            }
        }
    }

    public static void NIC(JTextField textField) {
        String text = textField.getText();
        if (!text.isEmpty()) {
            boolean res = text.matches("[0-9]{0,9}[v]{0,1}");
            if (!res) {
                textField.setText(text.substring(0, text.length() - 1));
            }
        }
    }

    public static void name(JTextField textFild) {
        try {
            String txt = textFild.getText();
            int caretPosition = textFild.getCaretPosition();
            if (!txt.matches("^[A-Za-z// ]*$")) {
                textFild.setText(txt.substring(0, caretPosition - 1) + txt.substring(caretPosition));
                textFild.setCaretPosition(caretPosition - 1);
            }
        } catch (Exception ex) {
        }
    }

    public static void numberOnly(JTextField textFild) {
        String txt = textFild.getText();
        int caretPosition = textFild.getCaretPosition();
        if (!txt.matches("^[1-9]{1,2}$")) {
            textFild.setText(txt.substring(0, caretPosition - 1) + txt.substring(caretPosition));
            textFild.setCaretPosition(caretPosition - 1);
        }
    }

    public static void Year(JTextField textFild) {
        String txt = textFild.getText();
        int caretPosition = textFild.getCaretPosition();
        if (!txt.matches("^[0-9]{4}$")) {
            textFild.setText(txt.substring(0, caretPosition - 1) + txt.substring(caretPosition));
            textFild.setCaretPosition(caretPosition - 1);
        }
    }
}
