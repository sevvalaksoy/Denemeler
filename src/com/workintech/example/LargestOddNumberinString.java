package com.workintech.example;

/*https://leetcode.com/problems/largest-odd-number-in-string/submissions/1408233757*/
/*You are given a string num, representing a large integer. Return the largest-valued odd integer (as a string) that is a non-empty substring of num, or an empty string "" if no odd integer exists.

A substring is a contiguous sequence of characters within a string.*/

public class LargestOddNumberinString {
    public static void main(String[] args) {
        largestOddNumber("35427");
    }
    public static String largestOddNumber(String num) {
        char[] numbers = num.toCharArray();
        String result = "";
        for(int i = numbers.length-1; i >= 0; i--){
            if(Integer.parseInt(String.valueOf(numbers[i])) % 2 != 0){
                System.out.println(num.substring(0,i+1));
                return num.substring(0,i+1);
            }
        }
        System.out.println(result);
        return result;
    }
}
