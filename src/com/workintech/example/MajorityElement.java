package com.workintech.example;

/* https://leetcode.com/problems/majority-element/submissions/1338930522 */

/*Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.*/

public class MajorityElement {
    public static void main(String[] args) {
        majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2});

    }
    public static int majorityElement(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int[] digit = new int[nums.length];
        int[] exist = new int[nums.length];
        for ( int i = 0; i < nums.length-1; i++){
            if(nums[i]==0){
                continue;
            }
            int count = 1;
            digit[i] = nums[i];
            for ( int j = i+1; j < nums.length; j++){
                if(nums[i]==nums[j]){
                    count++;
                    nums[j] = 0;
                } else {
                    continue;
                }
            }
            exist[i] = count;
        }
        int max = 0;
        int index = 0;
        for (int i = 0; i < exist.length; i++){
            if(max<exist[i]){
                max = exist[i];
                index = i;
            }
        }
        System.out.println(digit[index]);
        return digit[index];
    }
}
