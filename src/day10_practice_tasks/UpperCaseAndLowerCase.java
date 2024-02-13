package day10_practice_tasks;

public class UpperCaseAndLowerCase {
    public static void main(String[] args) {

        String str = "JAVA java";

        int upperCase = 0; // getting number of character
        int lowerCase = 0;

        for (int i = 0; i < str.length(); i++) {

            if (!(Character.isLetter(str.charAt(i)))) {
                continue;
            }

            if (Character.isUpperCase(str.charAt(i))) {
                upperCase++;
            } else {
                lowerCase++;
            }

        }

        if (upperCase == lowerCase) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
/*
Create a class called UpperCaseAndLowerCase and write a program with the following specifications:
   2.1 Given a string, return true if the total number of uppercase characters is equal to the total number of lowercase characters.

	        Example:
	            str = "JAVA java";

	        output:
	            true

 */