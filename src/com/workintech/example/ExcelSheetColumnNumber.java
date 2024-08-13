package com.workintech.example;

/*https://leetcode.com/problems/excel-sheet-column-number/submissions/1354019685*/

/*Given a string columnTitle that represents the column title as appears in an Excel sheet, return its corresponding column number.*/

import java.util.HashMap;
import java.util.Map;

public class ExcelSheetColumnNumber {
    public static void main(String[] args) {
        titleToNumber("AB");
    }
    public static int titleToNumber(String columnTitle) {
        char[] words = columnTitle.toCharArray();
        int score = 0;
        Map<Character, Integer> letters = new HashMap<>();
        letters.put('A', 1);
        letters.put('B', 2);
        letters.put('C', 3);
        letters.put('D', 4);
        letters.put('E', 5);
        letters.put('F', 6);
        letters.put('G', 7);
        letters.put('H', 8);
        letters.put('I', 9);
        letters.put('J', 10);
        letters.put('K', 11);
        letters.put('L', 12);
        letters.put('M', 13);
        letters.put('N', 14);
        letters.put('O', 15);
        letters.put('P', 16);
        letters.put('Q', 17);
        letters.put('R', 18);
        letters.put('S', 19);
        letters.put('T', 20);
        letters.put('U', 21);
        letters.put('V', 22);
        letters.put('W', 23);
        letters.put('X', 24);
        letters.put('Y', 25);
        letters.put('Z', 26);
        for(int i = words.length-1; i >= 0; i--){
            score += Math.pow(26,words.length-i-1) * letters.get(words[i]);
        }
        System.out.println(score);
        return score;
    }
}

