package com.reggie.passwordgenerator;

import javax.swing.*;
import com.formdev.flatlaf.FlatDarculaLaf;
import net.miginfocom.swing.MigLayout;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;

public class PasswordGUI {
    private JFrame frame;
    private JTextField lengthField;
    private JTextField lettersField;
    private JTextField numbersField;
    private JTextField specialsField;
    private JTextField resultField;
    private JButton generateButton;
    private JButton copyClipboard;

    public PasswordGUI() {
        // Set up Flatlaf
        try {
            UIManager.setLookAndFeel(new FlatDarculaLaf());
        } catch (Exception ex) {
            System.err.println("Failed to initialize Flatlaf");
        }

        // Frame setup
        frame = new JFrame("Password Generator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Component Initialization
        lengthField = new JTextField(15);
        lettersField = new JTextField(15);
        numbersField = new JTextField(15);
        specialsField = new JTextField(15);
        resultField = new JTextField(20);
        resultField.setEditable(false);
        generateButton = new JButton("Generate Password");
        copyClipboard = new JButton("Copy to Clipboard");
        copyClipboard.setText("Copy to Clipboard");

        // Using MigLayout for panel
        JPanel panel = new JPanel(new MigLayout("wrap 2", "[right]10[grow, fill]", "[]10[]"));
        // Panel padding
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        // Add labels and fields in pairs
        panel.add(new JLabel("Password Length:"));
        panel.add(lengthField);

        panel.add(new JLabel("Frequency of Letters:"));
        panel.add(lettersField);

        panel.add(new JLabel("Frequency of Numbers:"));
        panel.add(numbersField);

        panel.add(new JLabel("Frequency of Special Characters:"));
        panel.add(specialsField);

        // Add the generate button spanning both columns + centered
        panel.add(generateButton, "span, center");

        // Add the result field spanning both columns + allows horizontal expansion
        panel.add(resultField, "span, growx");

        panel.add(copyClipboard, "span, center");

        // Add panel to frame, pack, and center window
        frame.add(panel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        setupActions();
    }

    private void setupActions() {
        generateButton.addActionListener(e -> {
            try {
                // Parse the input values from textFields to type Int
                int length = Integer.parseInt(lengthField.getText());
                int letterWeight = Integer.parseInt(lettersField.getText());
                int numberWeight = Integer.parseInt(numbersField.getText());
                int specialWeight = Integer.parseInt(specialsField.getText());

                // Generate password using GenerateLogic class
                String password = GenerateLogic.generatePassword(length, letterWeight, numberWeight, specialWeight);

                // Set result field to new generated password
                resultField.setText(password);

            } catch (NumberFormatException ex) {
                // Display error message if input is invalid (not type Int)
                resultField.setText("Please enter valid numbers in all fields.");
            } catch (IllegalArgumentException ex) {
                // Display error message if GenerateLogic produces error
                resultField.setText(ex.getMessage());
            }
            
        });

        // Copy to clipboard
        copyClipboard.addActionListener(e -> {
            // Get the generated password from the result field
            String generatedPassword = resultField.getText();

            // Create StringSelection containing the password
            StringSelection stringSelection = new StringSelection(generatedPassword);

            // Get the system clipboard and set content
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            clipboard.setContents(stringSelection, null);

            // Show dialog box alerting user that password has been copied
            JOptionPane.showMessageDialog(frame, "Copied!");
        });
    }

}