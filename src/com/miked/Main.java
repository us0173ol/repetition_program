package com.miked;

import java.util.Scanner;

public class Main {

    static Scanner numberScanner = new Scanner(System.in);
    static Scanner stringScanner = new Scanner(System.in);
        //all credit to Clara James for the outline of this program
        //I wasted so much time
    public static void main(String[] args) {
        //variable for to add up the total sales for the day
        double totalSales = 0;
        //create an array of strings to use for printing the product name in the question
        String[] productname = {"coffee", "hot chocolate", "tea", "cappuccino"};
        //for loop to ask questions for all four products
        for (int p = 0; p < productname.length; p++) {
            //call drinksales method to calculate profits
            double drinkSales = drinksales(productname[p]);
            //add the drink sales for each product to the total sales
            totalSales += drinkSales;
        }
        //print out total sales
        System.out.println("____________________________________");
        System.out.println(String.format("Total sales for the day are $%.2f", totalSales));
        System.out.println("____________________________________");
        stringScanner.close();
        numberScanner.close();
    }
    //method to ask about sales of each product and return them to main for calculating
    //total sales
    private static double drinksales(String prodName) {
        System.out.println("How many cups of " + prodName + " did you sell?");
        //variable for number of cups sold
        int cups = numberScanner.nextInt();
        System.out.println("What does a cup of " + prodName + " cost?");
        //variable for price per cup
        double price = numberScanner.nextDouble();
        //multiply the price of each cup by the number sold to get drink sales for each
        //product
        double drinkSales = cups * price;
        return drinkSales;
    }
}

