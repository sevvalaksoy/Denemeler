package com.workintech.example;

import java.util.Arrays;

public class FairCandySwap {
    public static void main(String[] args) {
        fairCandySwap(new int[]{1, 2, 5}, new int[]{2, 4});
    }
    public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sum1 = Arrays.stream(aliceSizes).sum();
        int sum2 = Arrays.stream(bobSizes).sum();
        int diff = Math.abs(sum1 - sum2)/2;
        int[] result = new int[2];
        if(sum1>sum2){
            for(int i = 0; i < aliceSizes.length; i++) {
                if(aliceSizes[i]< diff) continue;
                int target = aliceSizes[i]-diff;
                boolean contains = Arrays.stream(bobSizes).anyMatch(n -> n == target);
                if(contains){
                    result[0] = aliceSizes[i];
                    result[1] = aliceSizes[i]-diff;
                    System.out.println(result[0]);
                    System.out.println(result[1]);
                    return result;
                }
            }
        } else {
            for(int i = 0; i < bobSizes.length; i++) {
                if(bobSizes[i]< diff) continue;
                int target = bobSizes[i]-diff;
                boolean contains = Arrays.stream(aliceSizes).anyMatch(n -> n == target);
                if(contains){
                    result[0] = bobSizes[i]-diff;
                    result[1] = bobSizes[i];
                    System.out.println(result[0]);
                    System.out.println(result[1]);
                    return result;
                }
            }
        }
        System.out.println(result[0]);
        System.out.println(result[1]);
        return result;
    }
}
