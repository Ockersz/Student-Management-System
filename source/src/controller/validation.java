package controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Shenal Ockersz
 */
public class validation {

    public static void validateNumber(JTextField text, int limit) {

        if (!text.getText().isEmpty()) {
            for (int i = 0; i < text.getText().length(); i++) {
                char c = text.getText().charAt(i);
                if (!Character.isDigit(c)) {
                    String s = text.getText().substring(0, i);
                    text.setText(s);
                }
                if (text.getText().length() > limit) {
                    String ss = text.getText().substring(i, limit);
                    text.setText(null);
                    text.setText(ss);
                }
            }
        } else {
            return;

        }

    }

    public static void emailValiadtion(String input, JLabel error) {

        Pattern pattent = Pattern.compile("[@]").compile("[.]");
        Matcher matcher = pattent.matcher(input);

        if (!matcher.find()) {
            error.setText("Invalid email address");
        } else {
            error.setText("");
        }
    
    }

}
