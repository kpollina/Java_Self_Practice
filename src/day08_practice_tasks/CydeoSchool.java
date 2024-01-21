package day08_practice_tasks;

public class CydeoSchool {
    public static void main(String[] args) {

        String firstName = "cyDEo";
        String lastName = "SCHOOL";


        firstName = firstName.replace("cyDEo", "Cydeo");
        lastName = lastName.toLowerCase().replaceFirst("s", "S");

        System.out.println(firstName + " " + lastName);


    }
}

/*
Write a program that asks the user to enter first and last names and then prints the full name in regular format
(first character in uppercase).

        Example:
              Input:
                  firstName = "cyDEo";
                  lastName = "SCHOOL";

              Output:
                   Cydeo School
 */