package day08_practice_tasks;
import java.util.Scanner;
public class StartsWithX {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter a word");

        //String str ="xcodex";

        String str = input.next();

        if(str.charAt(0)=='x') {
            str = str.replaceFirst("x", "a");
        }
        System.out.println(str);

        input.close();


    }
}
/*
Create a class named StartsWithX and write a program that asks the user to enter a word.
If the word starts with 'x,' replace it with 'a'.

        Example:
              Input:
                 xcodex

              Output:
                 acodex

 */