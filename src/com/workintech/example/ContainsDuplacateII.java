package com.workintech.example;

/* https://leetcode.com/problems/contains-duplicate-ii/submissions/1355176410 */

/*Given an integer array nums and an integer k,
return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.*/

import java.util.HashMap;

public class ContainsDuplacateII {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,2,3};
        containsNearbyDuplicate(nums, 2);
        containsNearbyDuplicate2(nums, 2);
    }
    // Saves up memory space
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        for(int i = 0; i < nums.length-1; i++){
            for(int j = i+1; j < nums.length; j++){
                if(j-i>k){
                    break;
                } else if(j-i<=k && nums[i] == nums[j]){
                    System.out.println(true);
                    return true;
                }
            }
        }
        System.out.println(false);
        return false;
    }
    // Better runtime
    public static boolean containsNearbyDuplicate2(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                if (Math.abs(map.get(nums[i]) - i) <= k)
                    return true;
                else
                    map.put(nums[i], i);
            } else
                map.put(nums[i], i);
        }
        return false;
    }
}
