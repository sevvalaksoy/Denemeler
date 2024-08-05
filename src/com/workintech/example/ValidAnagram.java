package com.workintech.example;

/* https://leetcode.com/problems/valid-anagram/submissions/1345470016 */

/*Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.*/

import java.util.Arrays;

public class ValidAnagram {
    public static void main(String[] args) {
        isAnagram("anagram", "nagaram");
    }
    public static boolean isAnagram(String s, String t) {
        char[] divided = s.toCharArray();
        char[] divided2 = t.toCharArray();
        Arrays.sort(divided);
        Arrays.sort(divided2);
        System.out.println(Arrays.equals(divided, divided2));
        return Arrays.equals(divided, divided2);
    }
}
