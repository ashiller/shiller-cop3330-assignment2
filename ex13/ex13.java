/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Anthony Shiller
 */
import java.util.Scanner;
import java.lang.Math;

public class CompoundInterest {
    public static void main(String[] args) {
        // Create a Scanner object to take user inputs from keyboard
        Scanner input = new Scanner(System.in);

        // Ask user to enter principal amount
        System.out.print("What is the principal amount? ");
        int principalAmount = input.nextInt();

        // Ask user to enter the annual rate of interest.
        System.out.print("What is the rate? ");
        double rate = input.nextDouble();

        // Ask user to enter the number of years the amount is invested.
        System.out.print("What is the number of years? ");
        int year = input.nextInt();

        // Ask user to enter the number of times the interest is compounded per year.
        System.out.print("What is the number of times the interest is compounded per year? ");
        int n = input.nextInt();

        // Calculate the amount at the end of the investment.
        double A = principalAmount*Math.pow(1+((rate*0.01)/n),n*year);
        
        // Print the user entered data and calculated data
        System.out.printf("$%d invested at %.1f%% for %d years compounded %d times per year is $%.2f.\n", 
                            principalAmount, rate, year, n, A);

        input.close();
    }
}