package day09_practice_tasks;

import java.util.Arrays;

public class ClassMatesReversed {
    public static void main(String[] args) {

        String[] classMates = {"Alice Johnson", "Bob Smith", "Charlie Brown", "David Clark", "Eva Martinez",
                "Frank Miller", "Grace Lee", "Hank Williams", "Ivy Anderson", "Jack Taylor"};


//        StringBuilder sb;
//
//        for (String classMate : classMates) {
//
//            sb = new StringBuilder(classMate);
//            System.out.println(sb.reverse());
//
//        }

        System.out.println("-------------------------------------");

        for (String classMate : classMates) {

            String res = "";
            char[]arr = classMate.toCharArray();
            for (int i = arr.length - 1; i >= 0; i--) {
                res+= arr[i] +"";
            }
            System.out.println(res);
        }


        //the other way:
        //for (int i = 0; i < classMates.length; i++) {
        //    String name = classMates[i];
        //    String res = "";
        //    for (int j = name.length() - 1; j >= 0; j--) {
        //       res += name.charAt(j);
        //   }
        //   System.out.println(res);
    }
}
/*
Create a class named ClassMatesReversed and write a program with the following specifications:
   6.1 Create an array of strings named classmates.
   6.2 Store full names of 10 classmates.
   6.3 Reverse each student's name and print them on separate lines.

 */