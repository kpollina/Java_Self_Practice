package day08_practice_tasks;

public class CydeoSchool {
    public static void main(String[] args) {

        String firstName = capitalize("cyDEo");
        String lastName = capitalize("SCHOOL");

        System.out.println(firstName + " " + lastName);
    }


    public static String capitalize(String word) {
        return word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
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