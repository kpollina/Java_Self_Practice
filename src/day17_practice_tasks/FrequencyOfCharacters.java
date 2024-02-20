package day17_practice_tasks;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

        String str = "bbcccaaaaa";
        char[] arr = str.toCharArray(); // ['b','b'......]

        Map<Character, Integer> map1 = new HashMap<>();


        for (char c : arr) {

            if (map1.containsKey(c)) {

                map1.put(c,map1.get(c)+1);
            }
            else {
                map1.put(c, 1); // { b = 1 }
            }

        }

        System.out.println(map1);



    }
}
/*
Create a class named FrequencyOfCharacters and write a program that returns the frequency of each
character in a given string as a map, without using nested loops.
         Example:
               string = "bbcccaaaaa"

         Output:
               {b=2, c=3, a=5}
 */