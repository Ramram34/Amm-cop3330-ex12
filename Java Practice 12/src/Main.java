/*
 *  UCF COP3330 Fall 2021 Assignment 12 Solution
 *  Copyright 2021 Rami Amm
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double principal;
        double rate;
        double percentage;
        double years;
        double invested;

        System.out.println("Enter the principal:");
        Scanner in = new Scanner(System.in);
        principal = in.nextDouble();

        System.out.println("Enter the annual rate of interest:");
        rate = in.nextDouble();

        System.out.println("Enter the number of years:");
        years = in.nextDouble();

       percentage = rate / 100;

       invested = Math.round(principal * (1 + percentage * years) * 100)/100;

       System.out.println("After " + years + " years at " + rate + "%, " +
                           "the investment will be worth " + invested );

    }
}
