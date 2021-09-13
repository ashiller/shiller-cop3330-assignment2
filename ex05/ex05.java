/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);

   System.out.println("What is the first number?");
   String firstNumber=sc.next();
   System.out.println("What is the second number?");
   String secondNumber=sc.next();

   int convertedFirtstNumber=Integer.parseInt(firstNumber);
   int convertedSecondNumber=Integer.parseInt(secondNumber);

   //Calculating sum
   int sum=convertedFirtstNumber+convertedSecondNumber;

   //Calculating  difference
   int difference=convertedFirtstNumber-convertedSecondNumber;

   //Calculating  multiplication
   int multiplication=convertedFirtstNumber*convertedSecondNumber;

   //Calculating  quotient
   int quotient=convertedFirtstNumber/convertedSecondNumber;


        System.out.println(convertedFirtstNumber+" + "+convertedSecondNumber+" = "+sum);
        System.out.println(convertedFirtstNumber+" - "+convertedSecondNumber+" = "+difference);
        System.out.println(convertedFirtstNumber+" * "+convertedSecondNumber+" = "+multiplication);
        System.out.println(convertedFirtstNumber+" / "+convertedSecondNumber+" = "+quotient);
    }
}