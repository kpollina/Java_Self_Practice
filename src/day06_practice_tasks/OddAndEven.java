package day06_practice_tasks;

public class OddAndEven {
    public static void main(String[] args) {
        boolean result = isOdd(100);
        System.out.println(result);

        boolean result2 = isEven(100);
        System.out.println(result2);

    }


    public static boolean isOdd(int num1) {
        if (num1 % 2 == 0) {
            return false;
        } else {
            return true;
        }

    }
    public static boolean isEven(int num2) {
        if (num2 % 2 == 0) {
            return true;
        } else {
            return false;
        }

    }

}
/*
Create a class named OddAndEven:

	1.1 Create a method named isOdd that returns true if a number is odd. Otherwise, it returns false.

			Example:
				boolean result = isOdd(100);

			Output:
				false

	1.2 Create a method named isEven that returns true if a number is even. Otherwise, it returns false.

			Example:
				boolean result = isEven(100);

			Output:
				true
 */