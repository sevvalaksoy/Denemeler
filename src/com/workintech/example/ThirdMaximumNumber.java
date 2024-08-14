package com.workintech.example;

/*https://leetcode.com/problems/third-maximum-number/submissions/1355380699*/

/*Given an integer array nums, return the third distinct maximum number in this array. If the third maximum does not exist, return the maximum number.*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ThirdMaximumNumber {
    public static void main(String[] args) {
        int[] nums = {2,2,3,1};
        thirdMax(nums);
    }
    public static int thirdMax(int[] nums) {
        List<Integer> order = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            if(order.contains(nums[i])){
                continue;
            } else order.add(nums[i]);
        }
        Collections.sort(order, Collections.reverseOrder());
        if(order.size()>=3){
            System.out.println(order.get(2));
            return order.get(2);
        } else System.out.println(order.get(0));return order.get(0);
    }
}
