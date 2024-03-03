package day17_practice_tasks;

import java.util.HashMap;
import java.util.Map;

public class UniqueCharacters {
    public static void main(String[] args) {

        String str = "aabcccdeeeef";

        char[] arr = str.toCharArray(); // ['b','b'......]

        Map<Character, Integer> map1 = new HashMap<>();
        for (char c : arr) {
            if (map1.containsKey(c)) {
                map1.put(c,map1.get(c)+1);
            } else {
                map1.put(c, 1); // { b = 1 }
            }
        }

        Map<Character, Integer> map2 = new HashMap<>();
        for (Map.Entry<Character, Integer> each : map1.entrySet()) {
            if (each.getValue() ==1) {
                map2.put(each.getKey(), each.getValue());
            };
        }
        System.out.println(map2);
    }
}
/*
Create a class named UniqueCharacters and write a program that returns the unique characters from a given
string as a map, with each character's frequency as the value. This should be done without using nested loops.

         Example:
               string = "aabcccdeeeef"

         Output:
               {b=1, d=1, f=1}

               public static void main(String[] args) {

        String str = "aabcccdeeeef";
        Map<String, Integer> uniqueCharactersMap = new LinkedHashMap<>();

        for (String each : str.split("")) {
            if(Collections.frequency(Arrays.asList(str.split("")), each) ==1){
                uniqueCharactersMap.put( each, 1);
            }
        }

        System.out.println(uniqueCharactersMap);

    }
 */