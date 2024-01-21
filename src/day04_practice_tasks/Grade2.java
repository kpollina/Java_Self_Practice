package day04_practice_tasks;

public class Grade2 {

    public static void main(String[] args) {

        char grade = 'B';
        
        if ( grade == 'A'){
            System.out.println("Excellent");
        } else if (grade == 'B') {
            System.out.println("Great job");
        } else if (grade == 'C' ) {
            System.out.println("Good");
        } else if (grade == 'D') {
            System.out.println("Passed");
        } else if (grade == 'F') {
            System.out.println("Failed");
        }else{
            System.out.println("Invalid");
        }


    }
}
/*
Create a class called Grade2. A char variable named grade is given.
   Write a program to print the following messages:

		'A': Excellent
		'B': Great job
		'C': Good
		'D': Passed
		'F': Failed
		Otherwise: Invalid Grade

			Example:
				   grade = 'B'

			Output:
				   Great job


 */