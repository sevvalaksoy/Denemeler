package com.workintech.example;

/* https://leetcode.com/problems/remove-duplicates-from-sorted-array/submissions/1343524581 */

/*Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums.

Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:

Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially. The remaining elements of nums are not important as well as the size of nums.
Return k.*/

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        removeDuplicates(nums);
    }
    public static int removeDuplicates(int[] nums) {
        int count = 0;
        for (int i = 1; i < nums.length; i++){
            if(nums[count] == nums[i]){
                continue;
            } else {
                count++;
                nums[count] = nums[i];
            }
        }
        System.out.println(count+1);
        return count+1;
    }
}
