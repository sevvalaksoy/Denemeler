package com.workintech.example;

/*https://leetcode.com/problems/check-if-numbers-are-ascending-in-a-sentence/submissions/1399335487*/

/*A sentence is a list of tokens separated by a single space with no leading or trailing spaces. Every token is either a positive number consisting of digits 0-9 with no leading zeros, or a word consisting of lowercase English letters.

For example, "a puppy has 2 eyes 4 legs" is a sentence with seven tokens: "2" and "4" are numbers and the other tokens such as "puppy" are words.
Given a string s representing a sentence, you need to check if all the numbers in s are strictly increasing from left to right (i.e., other than the last number, each number is strictly smaller than the number on its right in s).

Return true if so, or false otherwise.*/

import java.util.ArrayList;
import java.util.List;

public class CheckifNumbersAreAscendinginSentence {
    public static void main(String[] args) {
        String s = "1 box has 3 blue 4 red 6 green and 12 yellow marbles";
        areNumbersAscending(s);
    }
    public static boolean areNumbersAscending(String s) {
        String[] split = s.split(" ");
        List<Integer> numbers = new ArrayList<>();

        for (String x : split) {
            try {
                int num = Integer.parseInt(x);
                numbers.add(num);
            } catch (NumberFormatException e) {
                System.out.println("Ignored non-numeric string: " + x);
            }
        }

        for (int i = 0; i < numbers.size() - 1; i++) {
            if (numbers.get(i) >= numbers.get(i + 1)) {
                System.out.println(false);
                return false;
            }
        }
        System.out.println(true);
        return true;
    }

}
