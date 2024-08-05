package com.workintech.example;

import java.util.ArrayList;
import java.util.List;

public class IntersectionOfTwoArraysII {
    public static void main(String[] args) {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        intersect(nums1,nums2);
    }
    public static int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list1 = new ArrayList<>();
        for (int num : nums1) {
            list1.add(num);
        }
        ArrayList<Integer> list2 = new ArrayList<>();
        for(int i=0;i<nums2.length;i++){
            if(list1.contains(nums2[i])){
                list2.add(nums2[i]);
                list1.remove(Integer.valueOf(nums2[i]));
            }
        }
        int[] resultArray = new int[list2.size()];
        for (int i = 0; i < list2.size(); i++) {
            resultArray[i] = list2.get(i);
        }
        for(int num: resultArray){
            System.out.println(num);
        }
        return resultArray;
    }
}

