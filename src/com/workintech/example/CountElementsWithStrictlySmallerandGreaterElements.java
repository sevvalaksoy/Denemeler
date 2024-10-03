package com.workintech.example;

/*https://leetcode.com/problems/count-elements-with-strictly-smaller-and-greater-elements/submissions/1410130004*/

/*Given an integer array nums, return the number of elements that have both a strictly smaller and a strictly greater element appear in nums.*/

public class CountElementsWithStrictlySmallerandGreaterElements {
    public static void main(String[] args) {
        int[] nums = {11,7,2,15};
        countElements(nums);
    }
    public static int countElements(int[] nums) {
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            boolean smaller = false;
            boolean bigger = false;
            for(int j = 0; j < nums.length; j++){
                if(nums[i]< nums[j]){
                    smaller = true;
                }
                if(nums[i]> nums[j]){
                    bigger = true;
                }
                if(bigger && smaller){
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
        return count;
    }
    // Better Solution:
    public static int countElements2(int[] nums) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int curr : nums) {
            min = Math.min(min, curr);
            max = Math.max(max, curr);
        }
        int result = 0;
        for (int curr : nums) {
            if (curr != min && curr != max) result++;
        }
        return result;
    }
}
