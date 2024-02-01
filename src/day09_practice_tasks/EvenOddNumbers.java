package day09_practice_tasks;

public class EvenOddNumbers {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int evenCount = 0;
        int oddCount = 0;

        for (int number : array) {
            if(number % 2 == 0){
                evenCount++;
            }else{
                oddCount++;
            }
        }
        System.out.println("The array has " + oddCount + " odd numbers and " + evenCount + " even numbers.");
    }

    }

/*
Create a class named EvenOddNumbers and write a program that counts the even and odd numbers from an array of integers.

			Example:
				array = {1, 2, 3, 4, 5, 6, 7};

			Output:
				The array has 4 odd numbers and 3 even numbers.
 */