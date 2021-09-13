/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Anthony Shiller
 */
import java.util.Scanner;
import java.lang.Math;

public class TaxCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to take user inputs from keyboard
        Scanner input = new Scanner(System.in);

        // Ask user to enter order amount
        System.out.print("What is the order amount? ");
        double orderAmount = input.nextDouble();

        // Ask user to enter the state.
        System.out.print("What is the state? ");
        String state = input.next();

        double tax;
        if(state.equalsIgnoreCase("WI")) {
            // Display subtotal amount.
            System.out.printf("The subtotal is $%.2f\n", orderAmount);

            // Calculate tax amount.
            tax = 5.5/10;
            System.out.printf("The tax is $%.2f\n", tax);
        } else {
            tax = 0;
        }

        // Calculate total amount.
        double total = orderAmount + tax;

        // Print the total amount
        System.out.printf("The total is $%.2f\n", total);

        input.close();
    }
}