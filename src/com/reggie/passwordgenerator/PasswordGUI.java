package com.reggie.passwordgenerator;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.GridLayout;


public class PasswordGUI {
    // Basic JFrame (window)
    private JFrame gui;

    // Component Initialization
    private JTextField lengthField;
    private JTextField lettersField;
    private JTextField numbersField;
    private JTextField SpecialsField;
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
        panel.setLayout(new GridLayout(7, 2, 20, 20));
        // Add padding
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));

        // Add length input
        panel.add(new JLabel("Password Length"));
        lengthField = new JTextField(2);
        panel.add(lengthField);

        // Add text input
        panel.add(new JLabel("Number of Letters"));
        lettersField = new JTextField(2);
        panel.add(lettersField);




        gui.add(panel);
    }

    // Event listeners
    private void setupActions() {
        
    }
}
