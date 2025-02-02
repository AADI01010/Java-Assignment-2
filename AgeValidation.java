package utilities;
import java.util.Scanner;
import java.util.logging.*;
import java.io.*;

class InvalidAgeException extends Exception {
    InvalidAgeException(String message) {
        super(message);
    }
}

public class AgeValidation {
    // Create a logger for the class
    private static final Logger logger = Logger.getLogger(AgeValidation.class.getName());
    public static void main(String[] args) {
        // Set up logging configuration to log to a file
        try {
            FileHandler fileHandler = new FileHandler("error_log.txt", true); // Append to the file
            fileHandler.setFormatter(new SimpleFormatter()); // Simple text format
            logger.addHandler(fileHandler);
            Scanner in = new Scanner(System.in);
            System.out.print("Enter your age: ");
            int age = in.nextInt();
            if (age < 18) {
                throw new InvalidAgeException("Age is less than 18, invalid age!");
            } else {
                System.out.println("Age is valid.");
            }

        } catch (InvalidAgeException e) {
            // Handle custom exception and log it to a file
            logger.log(Level.SEVERE, e.getMessage(), e);
            System.out.println("Exception caught: " + e.getMessage());
        } catch (IOException e) {
            // Handle potential IO exception when setting up logging
            System.out.println("Error in logging: " + e.getMessage());
        }
    }
}
