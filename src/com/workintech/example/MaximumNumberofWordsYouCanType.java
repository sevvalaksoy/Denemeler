package com.workintech.example;

/*https://leetcode.com/problems/maximum-number-of-words-you-can-type/submissions/1414518528*/

/*There is a malfunctioning keyboard where some letter keys do not work. All other keys on the keyboard work properly.

Given a string text of words separated by a single space (no leading or trailing spaces) and a string brokenLetters of all distinct

letter keys that are broken, return the number of words in text you can fully type using this keyboard.*/

public class MaximumNumberofWordsYouCanType {
    public static void main(String[] args) {
        String text = "hello world";
        String brokenLetters = "ad";
        canBeTypedWords(text,brokenLetters);
    }
    public static int canBeTypedWords(String text, String brokenLetters) {
        char[] lettersNotToUse = brokenLetters.toCharArray();
        String[] words = text.split(" ");
        int count = 0;
        for(String w: words){
            boolean isCorrect = true;
            for(char c: lettersNotToUse){
                if(w.contains(String.valueOf(c))){
                    isCorrect = false;
                    break;
                }
            }
            if (isCorrect) {
                count++;
            }
        }
        System.out.println(count);
        return count;
    }
}
