package day05_practice_tasks;

public class SumOfNumbers {

    public static void main(String[] args) {

        int givenNumber = 100;
        int sum = 0;

        for (int i = 1; i <= 100 ; i++) {
            sum += i;

        }
        System.out.print(sum);


        System.out.println();


        int nNumber = 50;
        int sum2 = 0;

        for (int i = 1; i <=50 ; i++) {
            sum2 += i;
        }
        System.out.print(sum2);



    }
}

/*
 Create a class named SumOfNumbers and write a program to calculate the sum of all numbers between 1 and any given number.

				Example 1:
					   number = 100
				Output:
					  5050

				Example 2:
					    number = 50
				Output:
					  1275
 */