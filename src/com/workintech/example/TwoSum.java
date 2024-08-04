package com.workintech.example;
/* https://leetcode.com/problems/two-sum/submissions/1344034631 */

/*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.*/

public class TwoSum {

    public static void main(String[] args) {
        int[] nums = {-3,4,3,90};
        twoSum(nums,0);
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length-1; i++){
            for (int j = i+1; j < nums.length; j++){
                if(nums[i]+nums[j]==target){
                    result[0]=i;
                    result[1]=j;
                    System.out.println(result[0]);
                    System.out.println(result[1]);
                    return result;
                }
            }
        }
        System.out.println(result);
        return result;
    }
}
