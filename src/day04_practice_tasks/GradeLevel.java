package day04_practice_tasks;

public class GradeLevel {

    public static void main(String[] args) {

       byte gradeLevel = 8;

       switch (gradeLevel){
           case 1,2,3,4,5:
           System.out.println("Elementary school");
           break;

           case 6,7,8:
               System.out.println("Middle school");
               break;

           case 9,10,11,12:
               System.out.println("High school");
               break;

           case 13,14,15,16:
               System.out.println("College");
               break;

           case 17,18:
               System.out.println("Grad School");
               break;

           default:
               System.out.println("Invalid grade level");

       }


    }
}
