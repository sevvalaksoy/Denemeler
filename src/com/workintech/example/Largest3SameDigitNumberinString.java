package com.workintech.example;

/*https://leetcode.com/problems/largest-3-same-digit-number-in-string/submissions/1373287475*/

/*You are given a string num representing a large integer. An integer is good if it meets the following conditions:

It is a substring of num with length 3.
It consists of only one unique digit.
Return the maximum good integer as a string or an empty string "" if no such integer exists.

Note:

A substring is a contiguous sequence of characters within a string.
There may be leading zeroes in num or a good integer.*/

import java.util.ArrayList;
import java.util.List;

public class Largest3SameDigitNumberinString {
    public static void main(String[] args) {
        largestGoodInteger("000400059");
    }
    public static String largestGoodInteger(String num) {
        List<String> subs = new ArrayList<>();
        char[] arr = num.toCharArray();
        char follow = arr[0];
        String check = "";
        for(int i = 1; i < num.length(); i++){
            if(follow!=arr[i]){
                follow = arr[i];
                check = "";
            } else {
                if(check.isEmpty()){
                    check += follow;
                    check += follow;
                } else {
                    check += follow;
                    subs.add(check);
                    check = "";
                }
            }
        }
        String result = "";
        if(subs.size()==0){
            System.out.println(result);
            return result;
        }
        Integer first = Integer.parseInt(subs.get(0));
        for(int i = 1; i < subs.size(); i++){
            if(first<Integer.parseInt(subs.get(i))){
                first = Integer.parseInt(subs.get(i));
            }
        }
        if(first==0){
            result = "000";
        } else {
            result = String.valueOf(first);
        }
        System.out.println(result);
        return result;
    }

    //Best solution:

    public static String largestGoodInteger2(String num)
    {
        for(int i=9;i>=0;i--)
        {
            String str=String.valueOf(i).repeat(3);
            if(num.contains(str))
            {
                return str;
            }
        }
        return "";
    }
}
