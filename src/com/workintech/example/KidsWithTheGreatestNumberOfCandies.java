package com.workintech.example;

/* https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/submissions/1367586627 */

/*There are n kids with candies. You are given an integer array candies, where each candies[i] represents the number of candies the ith kid has, and an integer extraCandies, denoting the number of extra candies that you have.

Return a boolean array result of length n, where result[i] is true if, after giving the ith kid all the extraCandies, they will have the greatest number of candies among all the kids, or false otherwise.

Note that multiple kids can have the greatest number of candies.*/

import java.util.ArrayList;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies {
    public static void main(String[] args) {
        int[] arr = {2,3,5,1,3};
        kidsWithCandies(arr, 3);
    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int max = findMax(candies);
        for(int i = 0; i < candies.length; i++){
            if((candies[i]+extraCandies) >= max){
                result.add(true);
            } else result.add(false);
        }
        System.out.println(result);
        return result;
    }
    public static int findMax(int[] candies){
        int first = candies[0];
        for(int i = 1; i < candies.length; i++){
            if(candies[i]>first){
                first = candies[i];
            }
        }
        return first;
    }
}
