package day16_practice_tasks;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DifferenceBetweenTwoSets {

    public static void main(String[] args) {

        Set<Integer> set1 = Set.of(1, 2, 3, 5);
        Set<Integer> set2 = Set.of(2, 3, 4);

        Set<Integer> difference = calculateDifference(set1, set2);

        System.out.println("Difference: " + difference);
    }

    public static Set<Integer> calculateDifference(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> difference = new HashSet<>(set1);
        difference.removeAll(set2);
        return difference;
    }
}
/*
4. Create a class named DifferenceBetweenTwoSets and write a program that calculates the
difference between two sets of integers (elements in the first set but not in the second)
and displays the result.

         Example:
            Set1 = {1, 2, 3, 5}
            Set2 = {2, 3, 4}

         Output:
            {1, 5}

 */