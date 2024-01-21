package day08_practice_tasks;
import java.util.Scanner;
public class CombineWords {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter two word");

        String word1 = input.next();
        String word2 = input.next();
        String result;

        result = word1.concat(word2.substring(1));
        System.out.println(result);

        input.close();




    }
}
/*
Create a class named CombineWords. Ask the user to enter two words. Then, add them together and print. But if the
last letter of the first word and the first letter of the second word are the same, print that character once.

        Example:
              Input:
                 one
                 eight

              Output:
                   oneight

 */