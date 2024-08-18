package com.workintech.example;
/* https://leetcode.com/problems/unique-number-of-occurrences/submissions/1360587949 */

/* Given an array of integers arr, return true if the number of occurrences of each value in the array is unique or false otherwise. */
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueNumberOfOccurrences {
    public static void main(String[] args) {
        int[] num = {-3,0,1,-3,1,1,1,-3,10,0};
        uniqueOccurrences(num);
    }
    public static boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> occ = new HashMap<>();

        for (int num : arr) {
            occ.put(num, occ.getOrDefault(num, 0) + 1);
        }

        Set<Integer> occurrences = new HashSet<>();
        for (int count : occ.values()) {
            if (!occurrences.add(count)) {
                System.out.println("false");
                return false;
            }
        }
        System.out.println("true");
        return true;
    }
}
