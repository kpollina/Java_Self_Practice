package day07_practice_tasks;

import java.util.Scanner;

public class MyInfo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age");
        int age = scanner.nextInt();

        System.out.println("Enter your gender");
        String gender = scanner.next();

        scanner.nextLine();

        System.out.println("Enter your full name");
        String fullName = scanner.nextLine();

        System.out.println("Enter your phone number");
        long phoneNumber = scanner.nextLong();


        System.out.println("Enter your zip code");
       int zipCode = scanner.nextInt();


        scanner.nextLine();

        System.out.println("Enter your School name");
        String schoolName = scanner.nextLine();

        System.out.println("Enter your city name ");
        String city = scanner.nextLine();

        System.out.println("Enter your state name ");
        String state = scanner.next();

        System.out.println("Enter your building number");
        int buildingNumber = scanner.nextInt();

        scanner.nextLine();
        System.out.println("Enter your Street name");
        String street = scanner.nextLine();




        System.out.println("Full name " + fullName);
        System.out.println("Age " + age);
        System.out.println("Gender " + gender);
        System.out.println("Phone number " + phoneNumber);
        System.out.println("Address: " + "\n\t\t" + buildingNumber + " " + street + "\n\t\t" + city + ", " + state + " " + zipCode );
        System.out.println("School name: "+schoolName);


        scanner.close();

    }
}
/*
Create a class called MyInfo and ask the user to:

      Enter your age (int)
      Enter your gender (String - One word ONLY)
      Enter your full name (String - Multiple words)
      Enter your phone number (long)
      Enter your zip code (int)
      Enter your School name (String - Can be Multiple words)
      Enter your city name (String - Can be Multiple words)
      Enter your state name (String - One word ONLY)
      Enter your building number (int)
      Enter your Street name

    Display all the inputs that the user entered in the following order in separate lines:

        Full name
        Age
        Gender
        Phone number
        Address:
             buildingNumber Street
             City, state zipCode
 */