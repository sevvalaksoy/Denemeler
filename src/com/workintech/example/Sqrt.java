package com.workintech.example;
/* https://leetcode.com/problems/sqrtx/submissions/1341861044 */

/*Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.

You must not use any built-in exponent function or operator.*/

public class Sqrt {
    public static void main(String[] args) {
        mySqrt(2147395599);
    }
    public static int mySqrt(int x) {
        long y;
        int resulti = 0;
        long resultl = 0;
        if(x>=1000000){
            y = Long.parseLong(String.valueOf(x));
            for (long i = 0; i <= y/1000; i++){
                if(i*i<x && (i+1)*(i+1)>=x){
                    if((i+1)*(i+1)==x){
                        resultl = i+1;
                    } else {
                        resultl = i;
                    }
                }
            }
        } else {
            for (int i = 0; i <= x/2; i++){
                if(i*i<x && (i+1)*(i+1)>=x){
                    if((i+1)*(i+1)==x){
                        resulti = i+1;
                    } else {
                        resulti = i;
                    }
                }
            }
        }
        if(resulti==0){
            resulti = Integer.parseInt(String.valueOf(resultl));
        }
        System.out.println(resulti);
        return resulti;
    }
}
