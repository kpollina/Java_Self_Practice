package day16_practice_tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemovePalindromes {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.addAll(Arrays.asList(
                "Java", "Python", "Cydeo", "Car", "Level", "civic", "radar", "kayak",
                "reviver", "racecar", "madam"
        ));

        //   list.removeIf(p -> isPalindrome(p));

        List<String> list2 = new ArrayList<>();

        for (String eachString : list) {
            if (!isPalindrome(eachString)) list2.add(eachString);
        }
        System.out.println(list2);
    }
    public static boolean isPalindrome(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
//        if (sb.toString().equalsIgnoreCase(str)) return true;
//        else return false;
        return sb.toString().equalsIgnoreCase(str);
    }
}
/*
6. Create a class named RemovePalindromes and write a program that removes all
 palindrome strings from a given list of strings. The removal should be performed
 without using the removeIf method.

         Example:
            list = {"Java", "Python", "Cydeo", "Car", "Level", "civic", "radar", "kayak",
                     "reviver", "racecar", "madam"}

         Output:
            {"Java", "Python", "Cydeo", "Car"}

 */