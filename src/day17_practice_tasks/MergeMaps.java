package day17_practice_tasks;

import java.util.HashMap;
import java.util.Map;

public class MergeMaps {
    public static void main(String[] args) {

        Map<Character, Integer> map1 = new HashMap<>();
        map1.put('A',10);
        map1.put('B', 20);

        Map<Character, Integer> map2 = new HashMap<>();
        map2.put('B',30);
        map2.put('C', 40);

        Map<Character, Integer> mergedMap = new HashMap<>(map1);

        for (Map.Entry<Character, Integer> eachEntry : map2.entrySet()) {
            char key = eachEntry.getKey();
            int value = eachEntry.getValue();

            // If key is present in both maps, add their corresponding values together
            if(mergedMap.containsKey(key)){
                mergedMap.put(key, mergedMap.get(key) + value);
            }else{
                mergedMap.put(key, value); // If key is not present in map1, add it to the merged map
            }
        }
        // Print the merged map
        System.out.println(mergedMap);
    }
}
/*
Create a class named MergeMaps and write a program that merge two given maps.
If a key is present in both maps, add their corresponding values together.

         Example:
               map1 = {'A'=10, 'B'=20}
               map2 = {'B'=30, 'C'=40}

         Output:
               {'A'=10, 'B'=50, 'C'=40}


 public static void main(String[] args) {
        Map<Character, Integer> map1 = new HashMap<>();
        map1.put('A', 10);
        map1.put('B', 20);

        Map<Character, Integer> map2 = new HashMap<>();
        map2.put('B', 30);
        map2.put('C', 40);

        Map<Character, Integer> mergedMap = new HashMap<>();
        mergedMap.putAll(map1);
        mergedMap.putAll(map2);

        System.out.println(mergedMap);
    }

 */