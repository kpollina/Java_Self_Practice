package day08_practice_tasks;

public class EmailTask2 {

    public static void main(String[] args) {

        String email = "craig_federighi@apple.com";

        String firstName = email.substring(0,5).replaceFirst("c", "C");
        String lastName = email.substring(6,15).replaceFirst("f", "F");
        String domain = email.substring(16,21);

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