package com.reggie.passwordgenerator;

import javax.swing.*;
import com.formdev.flatlaf.FlatDarculaLaf;
import net.miginfocom.swing.MigLayout;
import java.awt.*;

public class PasswordGUI {
    private JFrame frame;
    private JTextField lengthField;
    private JTextField lettersField;
    private JTextField numbersField;
    private JTextField specialsField;
    private JTextField resultField;
    private JButton generateButton;

    public PasswordGUI() {
        // Set up Flatlaf
        try {
            UIManager.setLookAndFeel(new FlatDarculaLaf());
        } catch (Exception ex) {
            System.err.println("Failed to initialize Flatlaf");
        }

    }
}