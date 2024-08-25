package com.workintech.example;

/* https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/submissions/1367576732 */

/*Given a valid parentheses string s, return the nesting depth of s. The nesting depth is the maximum number of nested parentheses.*/

import java.util.LinkedList;
import java.util.List;

public class MaximumNestingDepthOfParantheses {

    public static void main(String[] args) {
        maxDepth("()(())((()()))");
    }

    public static int maxDepth(String s) {
        char[] letters = s.toCharArray();
        int count = 0;
        List<Integer> arr = new LinkedList<>();
        for(Character c: letters){
            switch(c){
                case '(':
                    count++;
                    break;
                case ')':
                    arr.add(count);
                    count--;
                    break;
                default:
                    break;
            }
        }
        for(int i = 0; i < arr.size(); i++){
            if(arr.get(i)> count){
                count=arr.get(i);
            }
        }
        System.out.println(count);
        return count;
    }
}
