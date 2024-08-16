package com.workintech.example;

/* https://leetcode.com/problems/detect-capital/submissions/1357766506 */

/*We define the usage of capitals in a word to be right when one of the following cases holds:

All letters in this word are capitals, like "USA".
All letters in this word are not capitals, like "leetcode".
Only the first letter in this word is capital, like "Google".
Given a string word, return true if the usage of capitals in it is right.*/

public class DetectCapital {
    public static void main(String[] args) {
        detectCapitalUse("FlaG");
    }
    public static boolean detectCapitalUse(String word) {
        if(word.equals(word.substring(0,1).toUpperCase() + word.substring(1).toLowerCase()) ||
                word.equals(word.toUpperCase()) ||
                word.equals(word.toLowerCase())) {
            System.out.println("true");
            return true;
        } else System.out.println("false"); return false;
    }
}
