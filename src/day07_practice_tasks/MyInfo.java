package day07_practice_tasks;

import java.util.Scanner;

public class MyInfo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int age;
        String gender;
        String fullName;
        long phoneNumber;
        int zipCode;
        String schoolName;
        String city;
        String state;
        int buildingNumber;
        String street;

        System.out.println("Enter your age");
        age = scanner.nextInt();


        System.out.println("Enter your gender");
        gender = scanner.next();

        scanner.nextLine();

        System.out.println("Enter your full name");
        fullName = scanner.nextLine();

        System.out.println("Enter your phone number");
        phoneNumber = scanner.nextLong();


        System.out.println("Enter your zip code");
        zipCode = scanner.nextInt();


        scanner.nextLine();

        System.out.println("Enter your School name");
        schoolName = scanner.nextLine();

        System.out.println("Enter your city name ");
        city = scanner.nextLine();

        System.out.println("Enter your state name ");
        state = scanner.next();

        System.out.println("Enter your building number");
        buildingNumber = scanner.nextInt();

        scanner.nextLine();
        System.out.println("Enter your Street name");
        street = scanner.nextLine();




        System.out.println("Full name " + fullName);
        System.out.println("Age " + age);
        System.out.println("Gender " + gender);
        System.out.println("Phone number " + phoneNumber);
        System.out.println("Address: " + "\n\t\t" + buildingNumber + " " + street + "\n\t\t" + city + ", " + state + " " + zipCode );


        scanner.close();

    }
}