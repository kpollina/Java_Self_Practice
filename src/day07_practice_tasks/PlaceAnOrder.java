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
