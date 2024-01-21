package day04_practice_tasks;

public class MonthName {

    public static void main(String[] args) {

        int number = 10;

        switch (number){
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                    System.out.println("June");
                    break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Invalid");



        }



    }
}
/*
Create a class named MonthName. Given an integer variable named number representing the number
of the month, write a program that displays the month's name based on the given number.

			Example 1:
				     number = 10

			Output:
				  October

			Example 2:
				     number = -20

			Output:
				  No such month

 */
