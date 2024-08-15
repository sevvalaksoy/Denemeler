package com.workintech.example;

/* https://leetcode.com/problems/reverse-string/submissions/1356264212 */

/* Write a function that reverses a string. The input string is given as an array of characters s.

You must do this by modifying the input array in-place with O(1) extra memory. */

public class ReverseString {
    public static void main(String[] args) {
        char[] s = {'h','e','l', 'l', 'o'};
        reverseString(s);
    }
    public static void reverseString(char[] s) {
        for(int i = 0; i < s.length/2; i++){
            char x = s[i];
            s[i] = s[s.length-1-i];
            s[s.length-1-i] = x;
        }
        System.out.println(s);
    }
}
