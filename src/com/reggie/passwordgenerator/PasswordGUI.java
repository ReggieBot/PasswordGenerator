package com.reggie.passwordgenerator;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.script.ScriptEngineManager;
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
    private SpringLayout layout;
    

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
        layout = new SpringLayout();
        JPanel panel = new JPanel(layout);
        // 6 rows, 2 columns, with gaps
        
        //panel.setLayout(layout);

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

        // Spring layout constraints
        // Length field
        layout.putConstraint(SpringLayout.WEST, lengthLabel, 20, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, lengthLabel, 20, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, lengthField, 20, SpringLayout.EAST, lengthLabel);
        layout.putConstraint(SpringLayout.NORTH, lengthField, 20, SpringLayout.NORTH, panel);
        
        // Letters field
        layout.putConstraint(SpringLayout.WEST, lettersLabel, 20, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, lettersLabel, 20, SpringLayout.NORTH, lengthLabel);
        layout.putConstraint(SpringLayout.WEST, lettersField, 20, SpringLayout.EAST, lettersLabel);
        layout.putConstraint(SpringLayout.NORTH, lettersField, 20, SpringLayout.NORTH, lengthField);

        // Numbers row
        layout.putConstraint(SpringLayout.WEST, numbersLabel, 20, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, numbersLabel, 20, SpringLayout.SOUTH, lettersLabel);
        layout.putConstraint(SpringLayout.WEST, numbersField, 20, SpringLayout.EAST, numbersLabel);
        layout.putConstraint(SpringLayout.NORTH, numbersField, 20, SpringLayout.SOUTH, lettersField);
       
        // Specials row
        layout.putConstraint(SpringLayout.WEST, specialsLabel, 20, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, specialsLabel, 20, SpringLayout.SOUTH, numbersLabel);
        layout.putConstraint(SpringLayout.WEST, specialsField, 20, SpringLayout.EAST, specialsLabel);
        layout.putConstraint(SpringLayout.NORTH, specialsField, 20, SpringLayout.SOUTH, numbersField);
       
        // Generate button
        layout.putConstraint(SpringLayout.WEST, generateButton, 20, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, generateButton, 20, SpringLayout.SOUTH, specialsLabel);
       
        // Result field
        layout.putConstraint(SpringLayout.WEST, resultField, 20, SpringLayout.EAST, generateButton);
        layout.putConstraint(SpringLayout.NORTH, resultField, 20, SpringLayout.SOUTH, specialsField);
       
        gui.add(panel);
        gui.setVisible(true);
    }

    // Event listeners
    private void setupActions() {
        
    }
}
