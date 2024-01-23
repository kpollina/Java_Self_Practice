package day08_practice_tasks;

public class EmailTask1 {
    public static void main(String[] args) {
        String email = "mike_tyson@gmail.com";

        String firstName = email.substring(0,email.indexOf("_"));

        String lastName = email.substring(email.indexOf("_")+1, email.indexOf("@"));
        String domain = email.substring(email.indexOf("@"));

        email = lastName + "_" + firstName + domain;
        System.out.println(email);


    }
}
/*
Create a class called EmailTask1. Assume that the email address is constructed by a person's first name followed
by an underscore and last name. Write a program that can swap the first name with the last name in the email
(separated by an underscore). If the email doesn't contain an underscore, print the given input email.

        Example:
              Input:
                 mike_tyson@gmail.com

              Output:
                  tyson_mike@gmail.com
 */

/*
public class EmailTask1 {
    public static void main(String[] args) {
        // Test the swapEmail method
        String inputEmail = "mike_tyson@gmail.com";
        String outputEmail = swapEmail(inputEmail);
        System.out.println("Input: " + inputEmail);
        System.out.println("Output: " + outputEmail);
    }

    // Method to swap first name with last name in the email
    public static String swapEmail(String email) {
        // Check if the email contains an underscore
        if (email.contains("_")) {
            // Split the email into parts using the underscore
            String[] parts = email.split("_");

            // Check if there are exactly two parts (first name and last name)
            if (parts.length == 2) {
                // Swap the first name with the last name
                return parts[1] + "_" + parts[0] + "@" + parts[2];
            }
        }

        // If the email doesn't contain an underscore or doesn't follow the expected format, return the given input email
        return email;
    }
}
 */