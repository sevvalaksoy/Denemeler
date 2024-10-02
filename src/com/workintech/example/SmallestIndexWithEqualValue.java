package com.workintech.example;

/*https://leetcode.com/problems/smallest-index-with-equal-value/submissions/1409382452*/

/*Given a 0-indexed integer array nums, return the smallest index i of nums such that i mod 10 == nums[i], or -1 if such index does not exist.

x mod y denotes the remainder when x is divided by y.*/

public class SmallestIndexWithEqualValue {
    public static void main(String[] args) {
        int[] nums = {4,3,2,1};
        smallestEqual(nums);
    }
    public static int smallestEqual(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            if((i % 10 == nums[i])){
                System.out.println(i);
                return i;
            }
        }
        System.out.println(-1);
        return -1;
    }
}
