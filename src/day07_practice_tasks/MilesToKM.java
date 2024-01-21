package day07_practice_tasks;

import java.util.Scanner;

public class MilesToKM {
    public static void main(String[] args) {

        Scanner convert = new Scanner(System.in);

        System.out.println("enter the number of miles: ");

        double miles = convert.nextDouble();

        double kilometers = miles * 1.609;


        System.out.println(miles + " miles is equal to " + kilometers + " kilometers");

        convert.close();

    }
}
