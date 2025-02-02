package com.reggie.passwordgenerator;
import java.util.Random;


// Class for the logic for generating password
// Uses weights for letters, numbers, and speical characters
// To determine prob. of each character type appearing in generated string

public class GenerateLogic {
    
    public static String generatePassword(int length, int letterWeight, int numberWeight, int specialWeight) {
        
        // Calculates the total weight - determines the range for selection
        int totalWeight = letterWeight + numberWeight + specialWeight;
        
        // Base validation
        if (totalWeight <= 0) {
            throw new IllegalArgumentException("Total weight must be greater than 0");
        }

        // Define character sets
        String letters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numbers = "0123456789";
        String specials = "!@#$%^&*()-_=+[]{}|;:,.<>?";

        // Using StringBuilder to build password character by character
    }
}
