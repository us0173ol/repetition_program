package com.miked;

import java.util.Scanner;

public class Main {

    static Scanner numberScanner = new Scanner(System.in);
    static Scanner stringScanner = new Scanner(System.in);

    public static void main(String[] args) {

        String[] productname = productArray();
        for (String n:productname)
        System.out.println("How many cups of " + n + " did you sell?");
        int cups = numberScanner.nextInt();
            String [] proName = productArray();
            for (String c:proName)
            System.out.println("What does a cup of " + c + " cost?");
        double price = numberScanner.nextInt();
        double drinkSales = drinkSales(cups, price);
        double totalSales = totalSales(drinkSales);
        System.out.println("Total sales for the day are $" +totalSales);
    }

    private static double totalSales(double d) {
        double totalSales=+ d;
        return totalSales;
    }

    public static String [] productArray(){
        String [] productname = {"coffee" , "hot chocolate" , "tea" , "cappuccino"};
        String [] ret = new String [4];
        ret[0]=productname[0];//http://stackoverflow.com/questions/15360170/returning-string-array-to-the-method-and-print-returned-array
        ret[1]=productname[1];
        ret[2]=productname[2];
        ret[3]=productname[3];
        return ret;
    }
    public static double drinkSales(int c, double p){
        double drinkSales = c * p;
        return drinkSales;

    }
}
