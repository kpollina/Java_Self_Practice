package day16_practice_tasks;

import java.util.*;

public class Anagram {

    public static void main(String[] args) {

        String str1 = "abcd";
        String str2 = "ccddabaa";

        System.out.println(isAnagram(str1, str2));

    }

    public static boolean isAnagram (String str1, String str2){
        char[] arr1 = str1.toCharArray();  //convert string to char array ([a, b, c, d])
        char []arr2 = str2.toCharArray();

        Set<Character>set1 = new HashSet<>();  //create Hashset to remove duplicates
        Set<Character>set2 = new HashSet<>();  //create Hashset to remove duplicates

        for (char eachCharacterFromArr1 : arr1) {   //add each character from arr1 to set1
            set1.add(eachCharacterFromArr1);
        }
        for (char eachCharacterFromArr2 : arr2) {   //add each character from arr2 to set2
            set2.add(eachCharacterFromArr2);
        }

        if(set1.equals(set2)) return true;
        else return false;
    }
}
/*
5. Create a class named Anagram and write a program that checks if two strings are anagrams of each other,
 considering only the distinct characters in each string (ignoring duplicates).

         Example1:
            str1 = "abcd"
            str2 = "ccddabaa"

         Output:
            true


         Example2:
            str1 = "xyze"
            str2 = "xyzd"

         Output:
            false


            solution from muhktar:
            public static void main(String[] args) {

        String str1 = "abcd";
        String str2 = "ccddabaa";

        Set<String> s1 = new TreeSet<>(Arrays.asList(str1.split("")));
        Set<String> s2 = new TreeSet<>(Arrays.asList(str2.split("")));

        boolean isAnagram = s1.equals(s2);

        System.out.println("isAnagram = " + isAnagram);

    }
 */