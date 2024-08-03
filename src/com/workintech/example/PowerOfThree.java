package com.workintech.example;
/* https://leetcode.com/problems/power-of-three/submissions/1342231932 */
/*Given an integer n, return true if it is a power of three. Otherwise, return false.

An integer n is a power of three, if there exists an integer x such that n == 3x.*/

public class PowerOfThree {
    public static void main(String[] args) {
        isPowerOfThree(19684);
    }
    public static boolean isPowerOfThree(int n) {
        boolean result = false;
        if(n<=0){
            System.out.println(result);
            return false;
        }
        while(n%3==0){
            n = n/3;
        }
        if(n!=1){
            System.out.println(result);
            return false;
        }
        result = true;
        System.out.println(result);
        return true;
    }
}
