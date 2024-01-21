package day07_practice_tasks;

import java.util.Scanner;

public class CentsToDollars {
    public static void main(String[] args) {

        Scanner convert = new Scanner(System.in);

        System.out.println("Enter the number of cents: ");

        int cents = convert.nextInt();

        int dollar = cents / 100;
        int remainder = cents % 100;

        System.out.println(cents + " cents is equal to " + dollar + " dollars and " + remainder + " cents");

        convert.close();


    }
}
/*
Create a class named CentsToDollars and write a program that asks the user to enter the number of cents and
convert the given cents to dollars. Include any remainder in the result.

        Example:
             Enter the cents:
             Input: 225

        Output:
             225 cents is equal to 2 dollars and 25 cents

 */
