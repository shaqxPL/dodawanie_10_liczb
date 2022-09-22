package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner userInput = new Scanner(System.in);

        int number;
        char choice;
        int evenSum = 0;
        int oddSum = 0;

        do {
            System.out.println("Enter the number: ");
            number = userInput.nextInt();
// np. dla number = 4 sprawdzam czy liczba podzielona przez 2 zostawia reszte 0
            if (number % 2 == 0) {
                evenSum = evenSum + number;

            } else {
                oddSum = oddSum + number;
            }
            System.out.println("Do you want to continue: Y or N");
            choice = userInput.next().charAt(0);
            System.out.println();
        } while (choice == 'Y' || choice =='y');

        System.out.println("Sum of even numbers is: " + evenSum);
        System.out.println("Sum of odd numbers is: " + oddSum);
    }
}
