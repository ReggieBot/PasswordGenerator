package com.reggie.passwordgenerator;

import javax.swing.*;
import java.awt.*;

public class PasswordGUI {
    private JFrame gui;
    private JTextField lengthField;
    private JTextField lettersField;
    private JTextField numbersField;
    private JTextField specialsField;
    private JTextField resultField;
    private JButton generateButton;

    public PasswordGUI() {
        gui = new JFrame("Password Generator");
        gui.setSize(600, 400);
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setupGUI();
        setupActions();

        gui.setVisible(true);
    }

    private void setupGUI() {
        JPanel mainPanel = new JPanel(new GridBagLayout());
        mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        GridBagConstraints gbc = new GridBagConstraints();

        // Common constraints
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5, 5, 5, 5);

        // Initialize components
        JLabel[] labels = {
            new JLabel("Password Length"),
            new JLabel("Frequency of Letters"),
            new JLabel("Frequency of Numbers"),
            new JLabel("Frequency of Special Characters")
        };

        lengthField = new JTextField(15);
        lettersField = new JTextField(15);
        numbersField = new JTextField(15);
        specialsField = new JTextField(15);
        generateButton = new JButton("Generate Password");
        resultField = new JTextField(30);
        resultField.setEditable(false);

        // Add labels and fields
        for (int i = 0; i < labels.length; i++) {
            // Label
            gbc.gridx = 0;
            gbc.gridy = i;
            gbc.weightx = 0.1;
            gbc.anchor = GridBagConstraints.EAST;
            mainPanel.add(labels[i], gbc);

            // Field
            gbc.gridx = 1;
            gbc.weightx = 0.9;
            gbc.anchor = GridBagConstraints.WEST;
            mainPanel.add(getFieldForRow(i), gbc);
        }

        // Add generate button
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.weightx = 0.1;
        mainPanel.add(generateButton, gbc);

        // Add result field
        gbc.gridx = 1;
        gbc.weightx = 0.9;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        mainPanel.add(resultField, gbc);

        gui.add(mainPanel);
        gui.setVisible(true);
    }

    private JTextField getFieldForRow(int row) {
        switch (row) {
            case 0: return lengthField;
            case 1: return lettersField;
            case 2: return numbersField;
            case 3: return specialsField;
            default: return null;
        }
    }

    private void setupActions() {
        // To be implemented
    }
}