package com.workintech.example;

/* https://leetcode.com/problems/minimum-moves-to-convert-string/submissions/1373561467 */

/*You are given a string s consisting of n characters which are either 'X' or 'O'.

A move is defined as selecting three consecutive characters of s and converting them to 'O'. Note that if a move is applied to the character 'O', it will stay the same.

Return the minimum number of moves required so that all the characters of s are converted to 'O'.*/

public class MinimumMovestoConvertString {
    public static void main(String[] args) {
        minimumMoves("XXOX");
    }
    public static int minimumMoves(String s) {
        char[] letters = s.toCharArray();
        int count = 0;
        for(int i = 0; i < letters.length; i++){
            if(letters[i]=='X'){
                count++;
                i= i +2;
            }
        }
        System.out.println(count);
        return count;
    }

}
