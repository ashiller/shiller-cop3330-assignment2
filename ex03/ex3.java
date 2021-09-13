package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        var scanner = new java.util.Scanner(System.in);
        System.out.print("What is the quote? ");
        var quote = scanner.nextLine();
        System.out.println("Who said it? ");
        var author = scanner.nextLine();
        System.out.println(author + "says, " + quote);
    }
}
