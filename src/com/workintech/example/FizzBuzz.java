package com.workintech.example;

/* https://leetcode.com/problems/fizz-buzz/submissions/1347063450 */

/*Given an integer n, return a string array answer (1-indexed) where:

answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
answer[i] == "Fizz" if i is divisible by 3.
answer[i] == "Buzz" if i is divisible by 5.
answer[i] == i (as a string) if none of the above conditions are true.*/

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static void main(String[] args) {
        fizzBuzz(15);
    }
    public static List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            if(i % 15 == 0){
                result.add("FizzBuzz");
            } else if(i % 3 == 0){
                result.add("Fizz");
            } else if (i % 5 == 0){
                result.add("Buzz");
            } else {
                result.add(String.valueOf(i));
            }
        }
        System.out.println(result);
        return result;
    }
}
