package com.workintech.example;

/*https://leetcode.com/problems/sign-of-the-product-of-an-array/submissions/1407090442*/

/*Implement a function signFunc(x) that returns:

1 if x is positive.
-1 if x is negative.
0 if x is equal to 0.
You are given an integer array nums. Let product be the product of all values in the array nums.

Return signFunc(product).*/

public class SignoftheProductofanArray {
    public static void main(String[] args) {
        int[] nums = {-1,-2,-3,-4,3,2,-1};
        arraySign(nums);
    }
    public static int arraySign(int[] nums) {
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i]<0){
                count++;
                continue;
            }
            if( nums[i] == 0 ){
                System.out.println(0);
                return 0;
            }
        }
        if(count % 2 == 0){
            System.out.println(1);
            return 1;
        } else
            System.out.println(-1);
            return -1;
    }
}
