package com.workintech.example;

/* https://leetcode.com/problems/distribute-elements-into-two-arrays-i/submissions/1348873829 */

/*You are given a 1-indexed array of distinct integers nums of length n.

You need to distribute all the elements of nums between two arrays arr1 and arr2 using n operations. In the first operation, append nums[1] to arr1. In the second operation, append nums[2] to arr2. Afterwards, in the ith operation:

If the last element of arr1 is greater than the last element of arr2, append nums[i] to arr1. Otherwise, append nums[i] to arr2.
The array result is formed by concatenating the arrays arr1 and arr2. For example, if arr1 == [1,2,3] and arr2 == [4,5,6], then result = [1,2,3,4,5,6].

Return the array result.*/

import java.util.ArrayList;
import java.util.List;

public class DistributeElementsIntoTwoArraysI {
    public static void main(String[] args) {
        int[] nums = {5,4,3,8};
        resultArray(nums);
    }
    public static int[] resultArray(int[] nums) {
        List<Integer> arr1 = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();
        arr1.add(nums[0]);
        arr2.add(nums[1]);
        for(int i = 2; i < nums.length; i++){
            if(arr1.get(arr1.size()-1) > arr2.get(arr2.size()-1)){
                arr1.add(nums[i]);
            } else {
                arr2.add(nums[i]);
            }
        }
        arr1.addAll(arr2);
        int[] result = new int[arr1.size()];
        for(int i = 0; i < arr1.size(); i++){
            result[i] = arr1.get(i);
        }
        System.out.println(arr1);
        return result;
    }
}
