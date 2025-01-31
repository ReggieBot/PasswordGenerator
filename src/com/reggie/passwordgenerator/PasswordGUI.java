package com.reggie.passwordgenerator;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.BorderFactory;
import javax.swing.SpringLayout;


public class PasswordGUI {
    // Basic JFrame (window)
    private JFrame gui;

    // Component Initialization
    private JTextField lengthField;
    private JTextField lettersField;
    private JTextField numbersField;
    private JTextField specialsField;
    private JTextField resultField;
    private JButton generateButton;
    

    // Constructor
    public PasswordGUI() {
        gui = new JFrame("Password Generator"); // Set title
        gui.setSize(600, 400); // Set size
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close operation

        setupGUI(); // Add components
        setupActions(); // Add event listeners

        gui.setVisible(true); // Show window
    }

    // GUI components
    private void setupGUI() {
        JPanel panel = new JPanel();
        // 6 rows, 2 columns, with gaps
  

        // Add padding
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        // Create components
        JLabel lengthLabel = new JLabel("Password Length");
        JLabel lettersLabel = new JLabel("Frequency of Letters");
        JLabel numbersLabel = new JLabel("Frequency of Numbers");
        JLabel specialsLabel = new JLabel("Frequency of Special Charactes");

        lengthField = new JTextField(15);
        lettersField = new JTextField(15);
        numbersField = new JTextField(15);
        specialsField = new JTextField(15);
        generateButton = new JButton("Generate Password");
        resultField = new JTextField(30);
        resultField.setEditable(false);

        // Add all components to panel
        panel.add(lengthLabel);
        panel.add(lengthField);
        panel.add(lettersLabel);
        panel.add(lettersField);
        panel.add(numbersLabel);
        panel.add(numbersField);
        panel.add(specialsLabel);
        panel.add(specialsField);
        panel.add(generateButton);
        panel.add(resultField);



        gui.add(panel);
    }

    // Event listeners
    private void setupActions() {
        
    }
}
