package com.company;

import java.util.*;
public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Random rand = new Random();    // create instance of Random class

        int correctNumber = rand.nextInt(100) + 1;   // Generate random integers in range 0 to 99
        //that's why adding 1 to it.

        int noOfTries = 0;

        // the loop will run till user guess the correct number.
        while(true)
        {
            System.out.println("Enter Your Guess (1 - 100) :");

            int guessedNumber = sc.nextInt();
            noOfTries++;

            if (guessedNumber > correctNumber) {
                System.out.println("Nope, the correct number is lower, guess again");
            } else if (guessedNumber < correctNumber) {
                System.out.println("Nope, the correct number is higher, guess again");
            } else {
                System.out.println("Correct, YOU WIN :) ");
                System.out.println("You got the correct number in "+noOfTries+" tries");
                break;                                                          //user got the correct number. hence, break the loop.
            }
        }

        sc.close();
    }
}
