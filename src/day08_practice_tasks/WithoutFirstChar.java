package day08_practice_tasks;

import java.util.Scanner;

public class WithoutFirstChar {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter two word");


       // String word1 = "apple";
       // String word2 = "banana";

        String word1 = input.next();
        String word2 = input.next();


        word1 = word1.substring(1);
        word2 = word2.substring(1);
        System.out.println(word1+word2);

        input.close();






    }
}
/*
Create a class named WithoutFirstChar. Ask the user to enter two words. Print the first word without its
first character, then print the second word without its first character.

        Example:
              Inputs:
                  apple
                  banana

              Output:
                   ppleanana
 */