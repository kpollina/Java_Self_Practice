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
