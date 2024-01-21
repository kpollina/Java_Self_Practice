package day07_practice_tasks;

import java.util.Scanner;

public class PlaceAnOrder {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String product;
        double price;
        int quantity;
        String firstName;


        System.out.println("enter the product name: ");
        product = scanner.nextLine();

        System.out.println("enter the price: ");
        price = scanner.nextDouble();

        System.out.println("enter quantity: ");
        quantity = scanner.nextInt();

        System.out.println("enter your first name: ");
        firstName = scanner.next();

        double total = price * quantity;

        System.out.println(firstName + ", your order for " + quantity + " " + product + " has been placed. Your total is " + total + ".");

        scanner.close();
    }
}

/*
Create a class named PlaceAnOrder:

    Ask the user to enter the product name (multiple words).
    Ask the user to enter the price (double).
    Ask the user to enter the quantity (int).
    Ask the user to enter their first name (String, single word).

    Print in the following format:

        Example:
             Inputs: "Apples", 1.5, 5, "Luke"

        Output:
             Luke, your order for 5 Apples has been placed. Your total is 7.5.
 */
