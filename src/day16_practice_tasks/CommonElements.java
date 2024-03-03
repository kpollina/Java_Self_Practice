package day16_practice_tasks;

import java.util.*;

public class CommonElements {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<Integer>();
        set1.addAll(Arrays.asList(10, 8, 11, 20, 5, 0));

        Set<Integer> set2 = new HashSet<Integer>();
        set2.addAll(Arrays.asList(30, 0, 20, 40, 50, 10, 60));

        set1.retainAll(set2);

        List<Integer> sortedList = new ArrayList<>(set1); // using list because collections do not sort sets
        Collections.sort(sortedList);

        System.out.println(sortedList);

    }
}
/*
3. Create a class named CommonElements and write a program that identifies
the common elements in two given sets of integers and returns a third set
containing these common elements.

         Example:
            set1 = {10, 8, 11, 20, 5, 0}
            set2 = {30, 0, 20, 40, 50, 10, 60}

         Output:
            set3 = {0, 10, 20}

public static void main(String[] args) {

        Set<Integer> set1 = new HashSet<>(Arrays.asList(10, 8, 11, 20, 5, 0));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(30, 0, 20, 40, 50, 10, 60));

        Set<Integer> set3 = new HashSet<>();

        for (Integer each : set1) {
            if(set2.contains(each)) {
                set3.add(each);
            }
        }

        System.out.println(set3);

    }

 */