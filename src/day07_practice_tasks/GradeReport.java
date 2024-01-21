package day07_practice_tasks;
import java.util.Scanner;
public class GradeReport {
    public static void main(String[] args) {

        Scanner score = new Scanner(System.in);

        System.out.println("enter your score");

        int grade = score.nextInt();

        if(grade < 0 || grade > 100 ){
            System.out.println("Invalid score");
        } else if (grade >= 90) {
            System.out.println("Your grade is A");
        } else if (grade >=80) {
            System.out.println("Your grade is B");
        } else if (grade >= 70) {
            System.out.println("Your grade is C");
        } else if (grade>= 60) {
            System.out.println("Your grade is D");
        }else {
            System.out.println("Your grade is F");
        }

        score.close();

    }
}
