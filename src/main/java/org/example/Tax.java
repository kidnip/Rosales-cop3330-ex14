package org.example;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jeremy Rosales
 */
public class Tax
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        float amount, tax;
        String state;

        System.out.print("What is the order amount?" );
        amount = input.nextFloat();
        System.out.print("What is the state?" );
        state = input.next();
        state = state.toUpperCase();

        if(state.equals("WI") || state.equals("WISCONSIN")){
            System.out.printf("The subtotal is $%.2f\n", amount);
            tax = (float) (0.055 * amount);
            System.out.printf("The tax is $%.2f\n", tax);
            amount = tax + amount;
        }

        System.out.printf("The total is $%.2f", amount);
    }
}
