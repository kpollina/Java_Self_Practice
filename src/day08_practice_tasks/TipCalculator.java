package day08_practice_tasks;

import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Split or No split (Yes or No) ?");
        String splitOrNot = scanner.next().toLowerCase();

        System.out.println("Enter the number of people:");
        int numberOfPeople = scanner.nextInt();
        
        System.out.println("Enter the check amount:");
        double checkAmount = scanner.nextDouble();

        System.out.println("How was the service quality? (Excellent/Great/Good/Fair/Poor) ");
        String serviceQuality = scanner.next().toLowerCase();

        scanner.close();


        double totalTip = 0;
        switch (serviceQuality) {
            case "excellent" -> totalTip = 0.25 * checkAmount;
            case "great" -> totalTip = 0.2 * checkAmount;
            case "good" -> totalTip = 0.15 * checkAmount;
            case "fair" -> totalTip = 0.1 * checkAmount;
            case "poor" -> totalTip = 0.05 * checkAmount;
            default -> totalTip = 0;
        }

        double totalPerPerson = (totalTip + checkAmount) / numberOfPeople;
        double totalToPay = checkAmount + totalTip;
        double tipPerPerson = totalTip / numberOfPeople;


        if (splitOrNot.equals("yes") || splitOrNot.equals("no")) {
            System.out.println("Number of people entered: " + numberOfPeople);
            System.out.println("Total to pay: " + totalToPay);
            System.out.println("Total tip: " + totalTip);

            if (splitOrNot.equals("yes")) {
                System.out.println("Total per person: " + totalPerPerson);
                System.out.println("Tip per person: " + tipPerPerson);
            }
        } else {
            System.out.println("Invalid entry");
        }


    }
}


/*
Create a class called TipCalculator and write a program for a tip calculator. There will be different service
quality benchmarks that will determine the tip given. There will also be the ability to calculate based on the
number of people in the party and whether there is a split of the bill.

        Poor = 5%, Fair = 10%, Good = 15%, Great = 20%, Excellent = 25%

      The program should ask the user to enter:
          - Split or No split (Yes or No),
          - Enter the number of people (number)
          - Enter the check amount (number)
          - Service Quality (String)

      And display the output in the following format:

            Example:
                  Split or No Split (Yes or No)?
                  Input: Yes
                  Enter the number of people:
                  Input: 4
                  Enter the check amount:
                  Input: 476
                  How was the service quality? (Excellent/Great/Good/Fair/Poor)
                  Input: Excellent

            Output:
                 Number of people entered: 4
                 Total to pay: 595.0
                 Total tip: 119.0
                 Total per person: 148.75
                 Tip per person: 29.75

 */