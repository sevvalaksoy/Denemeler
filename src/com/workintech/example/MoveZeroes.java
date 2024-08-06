package com.workintech.example;

/* https://leetcode.com/problems/move-zeroes/submissions/1346559655 */

/*Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.*/

public class MoveZeroes {
    public static void main(String[] args) {
        int[] example = new int[]{0, 1, 0, 3, 12};
        moveZeroes(example);
        printResults(example);
    }
    public static void moveZeroes(int[] nums) {
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i]==0){
                count++;
                continue;
            }
            if(nums[i]!= 0){
                nums[i-count] = nums[i];
                if(count!=0){
                    nums[i]= 0;
                }
            }
        }
    }
    public static void printResults(int[] x){
        for(int i:x){
            System.out.println(i);
        }
    }
}
