package com.workintech.example;

/*https://leetcode.com/problems/partition-array-into-three-parts-with-equal-sum/submissions/1392075107*/
/*Given an array of integers arr, return true if we can partition the array into three non-empty parts with equal sums.*/

public class PartitionArrayIntoThreePartsWithEqualSum {
    public static void main(String[] args) {
        int[] arr = {0,0,0,0};
        canThreePartsEqualSum(arr);
    }
    public static boolean canThreePartsEqualSum(int[] arr) {
        int total=0;
        for(Integer x:arr){
            total+=x;
        }
        int oneThird=total/3;
        if(total % 3 != 0){
            return false;
        }
        int check=0;
        int count=0;
        for(int i = 0; i < arr.length; i++){
            check+=arr[i];
            if(check==oneThird){
                check=0;
                count++;
            }
        }
        System.out.println(true);
        return count>=3;
    }
}
