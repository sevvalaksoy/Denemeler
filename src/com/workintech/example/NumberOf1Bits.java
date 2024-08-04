package com.workintech.example;

/* https://leetcode.com/problems/number-of-1-bits/submissions/1344622211 */

/*Write a function that takes the binary representation of a positive integer and returns the number of
set bits
 it has (also known as the Hamming weight).*/

public class NumberOf1Bits {
    public static void main(String[] args) {
        int n = 2147483645;
        hammingWeight(n);
    }
    public static int hammingWeight(int n) {
        int count = 0;
        for (int i = 0; i< 32; i++){
            if(Math.pow(2,i)>n){
                for (int j = i-1; j>=0; j--){
                    if(n-Math.pow(2,j)>=0){
                        count++;
                        n-=Math.pow(2,j);
                    }
                }
            }
        }
        System.out.println(count);
        return count;
    }
}
