package com.reggie.passwordgenerator;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class PasswordGUI {
    // Basic JFrame (window)
    private JFrame gui;

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
        gui.add(panel);
    }

    // Event listeners
    private void setupActions() {
        
    }
}
