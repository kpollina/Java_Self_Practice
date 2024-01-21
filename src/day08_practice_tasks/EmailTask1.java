package day08_practice_tasks;

public class EmailTask1 {
    public static void main(String[] args) {
        String email  = "mike_tyson@gmail.com";

        email = email.replace("mike_tyson", "tyson_mike");
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