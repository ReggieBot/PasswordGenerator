package com.reggie.passwordgenerator;
import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            PasswordGUI gui = new PasswordGUI();
        });
    }
}