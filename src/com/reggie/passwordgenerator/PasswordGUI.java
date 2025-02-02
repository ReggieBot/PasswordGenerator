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

        // Using MigLayout for panel
        JPanel panel = new JPanel(new MigLayout("wrap 2", "[right]10[grow, fill]", "[]10[]"));
        // Panel padding
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        // Add labels and fields in pairs
        panel.add(new JLabel("Password Length:"));
        panel.add(lengthField);

        panel.add(new JLabel("Frequency of Letters:"));
        panel.add(lettersField);

        panel.add(new JLabel("Frequency of Numbers"));
        panel.add(numbersField);

        panel.add(new JLabel("Frequency of Special Characters"));
        panel.add(specialsField);

        // Add the generate button spanning both columns + centered
        panel.add(generateButton, "span, center");

        // Add the result field spanning both columns + allows horizontal expansion
        panel.add(resultField, "span, growx");

        // Add panel to frame, pack, and center window
        frame.add(panel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        setupActions();
    }

    
}