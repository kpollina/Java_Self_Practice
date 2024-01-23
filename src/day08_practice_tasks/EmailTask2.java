package day08_practice_tasks;
import java.util.Scanner;
public class EmailTask2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String email = input.next();

        //String email = "craig_federighi@apple.com";

        int underscore = email.indexOf("_");
        int at = email.indexOf("@");
        int dot = email.indexOf(".");

        String firstName = email.substring(0,underscore);
        String lastName = email.substring(underscore +1,at);
        String domain = email.substring(at + 1,dot);

        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("Domain: " + domain);

    }
}
/*
Create a class called EmailTask2. Assume that the email address is constructed by a person's first name followed
by an underscore and last name. Write a program that will print out information about the user based on the email.
Print the first name, last name, and domain. First and last names should be printed with the proper format.
(uppercase first letter and remaining lowercase)

        Example:
              Input:
                 craig_federighi@apple.com

              Output:
                   First name: Craig
                   Last name: Federighi
                   Domain: apple
 */