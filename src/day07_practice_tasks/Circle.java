package day07_practice_tasks;

import java.util.Scanner;

public class Circle {

    public static void main(String[] args) {

        Scanner circle = new Scanner(System.in);

        System.out.println("enter the radius of the circle");
        double radius = circle.nextDouble();

        double area = 3.14 * (radius * radius);
        System.out.println("The area of the circle is " + area);

        double perimeter = 2*3.14 * radius;
        System.out.println("The perimeter is " + perimeter);

        circle.close();

    }
}
/*
Create a class named Circle and write a program that asks the user to enter the radius of the Circle and calculate
the area and perimeter of the Circle.

        Example:
             Enter the radius:
             Input: 5

        Output:
             The area of the Circle is 78.5
             The perimeter of the Circle is 31.4


 */