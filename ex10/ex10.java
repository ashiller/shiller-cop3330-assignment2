/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Anthony Shiller
 */
 import java.util.Scanner;
public class Main
{
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in); //scanner object
       System.out.print("Enter the price of item 1: ");
       double price_item1 = sc.nextDouble(); //take price of 1st item
       System.out.print("Enter the quantity of item 1: ");
       int qty_item1 = sc.nextInt(); //take quantity of first item
       System.out.print("Enter the price of item 2: ");
       double price_item2 = sc.nextDouble(); //take price of 2nd item
       System.out.print("Enter the quantity of item 2: ");
       int qty_item2 = sc.nextInt(); //take quantity of 2nd item
       System.out.print("Enter the price of item 3: ");
       double price_item3 = sc.nextDouble(); //taka print of 3rd item
       System.out.print("Enter the quantity of item 3: ");
       int qty_item3 = sc.nextInt(); //taka quantity of 3rd item
       double subTotal = (price_item1*qty_item1)+(price_item2*qty_item2)+(price_item3*qty_item3); //calculate subTotal
       double tax = (subTotal*5.5)/100; //calculate tax
       double total = subTotal+tax; //calculate final total
       System.out.println("Subtotal: $"+subTotal); //print output
       System.out.println("Tax: $"+tax);
       System.out.println("Total: $"+total);
   }
}