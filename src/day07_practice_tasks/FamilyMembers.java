package day07_practice_tasks;

import java.util.Scanner;

public class FamilyMembers {

    public static void main(String[] args) {

        Scanner familyMembers = new Scanner(System.in);
        int people;

        System.out.println("How many people do you live with?");
        people = familyMembers.nextInt();

      if (people < 3){
          System.out.println("Live with less than three people.");
      } else if (people > 3 && people < 6) {
          System.out.println("Live with 3 - 6 people.");
      }else {
          System.out.println("Live with more than six people.");
      }

        familyMembers.close();




    }
}
