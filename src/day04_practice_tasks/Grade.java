package day04_practice_tasks;

public class Grade {

    public static void main(String[] args) {

        char grade = 'B';

        switch (grade){
            case 'A':
                System.out.println("Excellent");

                break;

            case 'B':
                System.out.println("Great job");
                break;

            case 'C':
                System.out.println("Good");

                break;

            case 'D':
                System.out.println("Passed");
                break;

            case 'F':
                System.out.println("Failed");
            default:
                System.out.println("Invalid Grade");
        }





    }
}
