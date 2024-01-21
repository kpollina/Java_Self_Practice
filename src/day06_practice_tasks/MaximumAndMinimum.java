package day06_practice_tasks;

public class MaximumAndMinimum {
    public static void main(String[] args) {

        int max = maxNumber(10, 30);
        System.out.println(max);

        double max1 = maximumNumber(10.5, 30.2);
        System.out.println(max1);

        int min = minNumber(100, 200);
        System.out.println(min);

        double min1 = minimumNumber(100, 200);
        System.out.println(min1);

    }
    public static int maxNumber(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }

    public static double maximumNumber(double num1, double num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }

    public static int minNumber(int num1, int num2) {
        if (num1 < num2) {
            return num1;
        } else {
            return num2;
        }
    }

    public static double minimumNumber(double num1, double num2) {
        if (num1 < num2) {
            return num1;
        } else {
            return num2;
        }
    }

}


