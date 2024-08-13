package com.workintech.example;

/*https://leetcode.com/problems/minimum-difference-between-highest-and-lowest-of-k-scores/submissions/1354408657*/

/*You are given a 0-indexed integer array nums, where nums[i] represents the score of the ith student. You are also given an integer k.

Pick the scores of any k students from the array so that the difference between the highest and the lowest of the k scores is minimized.

Return the minimum possible difference.*/

import java.util.Arrays;

public class MinDifBtwHighestLowestKScores {
    public static void main(String[] args) {
        int[] nums = {11181,23291,24520,92567,19530,12631,11048,37325,36730,45935,43785,85701,60558,4847,88701,27809,76264,73637,50367,48998,31556,28617,60992,76542,71383,22035,95023,89149,54342,12712,93885,1243,5682,75211,60667,68766,94505,67043,98893,80977,6367,13446,64482,13383,71717,22432,49079,52101,61754,98448,42679,35519,523,93809,91584,12763,49377,42131,9990,23324,22887,91557,21905,49635,14267};
        minimumDifference(nums, 39);
    }
    public static int minimumDifference(int[] nums, int k) {
        if(nums.length == 1){
            return 0;
        }
        Arrays.sort(nums);
        int dif = nums[k-1]-nums[0];
        for(int i = nums.length-k; i >= 1; i--){
            if(nums[i+k-1]-nums[i] < dif){
                dif = nums[i+k-1]-nums[i];
            }
        }
        System.out.println(dif);
        return dif;
    }
}
