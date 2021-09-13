/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Anthony Shiller
 */
import java.util.*;
class TaxCalculater{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amount;
        double tAmount = 0.0, tax = 0.0;
        System.out.print("What is order amount? ");
        amount = sc.nextInt();
        System.out.print("What state do you live in? ");
        String state = sc.next();
        if(state.equals("Wisconsic")){
            System.out.print("What country do you live in? ");
             String county = sc.next();
            if(county.equals("EauClaire")){
                tax = (amount*5.005)/100;
                tAmount = tax + amount;
            }
            else if(county.equals("Dunn")){
                tax = (amount*5.004)/100;
                tAmount = tax + amount; 
            }
            else{
                System.out.println("Plese enter correct country");
            }
        }
        else if(state.equals("Illinous")){
            tax = (amount*8)/100;
            tAmount = tax + amount;
        }
        else{
            tax = 0.0;
            tAmount = amount;
        }
        System.out.println("The tax is  $"+String.format("%.2f",tax));
        System.out.println("The total is  $"+String.format("%.2f",tAmount));
    }
}