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
        StringBuilder password = new StringBuilder();
        Random random = new Random();

        // Generate each character in the password
        for (int i = 0; i < length; i++) {

            // Gets a random number within the range of the total weight
            int targetWeight = random.nextInt(totalWeight);

            // Determines the character type based on the weights
            if (targetWeight < letterWeight) {
                // Random letter selected and appended to password
                password.append(letters.charAt(random.nextInt(letters.length())));
            } else if (targetWeight < letterWeight + numberWeight) {
                 // Random number selected and appended to password
                password.append(numbers.charAt(random.nextInt(numbers.length())));
            } else {
                // Random special character selected and appended to password
                password.append(specials.charAt(random.nextInt(specials.length())));
            }
        }

       // Return generated password as type String
       return password.toString();
    }
}
