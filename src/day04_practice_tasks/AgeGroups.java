package day04_practice_tasks;

public class AgeGroups {

    public static void main(String[] args) {
        
        int age = 42;
        
        if (age >= 0 && age <= 20){
            System.out.println("teenager");
        } else if (age >= 21 && age <=55) {
            System.out.println("adult");
        } else if (age >=55) {
            System.out.println("senior");
        } else if (age <0 || age > 150 ) {
            System.out.println("Invalid");
        }


    }
}
