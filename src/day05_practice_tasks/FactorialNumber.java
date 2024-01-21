package day05_practice_tasks;

public class FactorialNumber {
    public static void main(String[] args) {

        int sum = 1;
        for (int num = 5; num > 0 ; num--) {
             sum *= num;
        }
        System.out.println(sum);

    }
}

/*
Create a class named FactorialNumber. Write a program that can return the factorial number of any given number.

				Example:
					  num = 5
				Output:
					  120
			(because: 5! = 5 * 4 * 3 * 2* 1 = 120 )
 */