package com.workintech.example;

/*https://leetcode.com/problems/final-prices-with-a-special-discount-in-a-shop/submissions/1400512777*/

/*You are given an integer array prices where prices[i] is the price of the ith item in a shop.

There is a special discount for items in the shop. If you buy the ith item, then you will receive a discount equivalent to prices[j] where j is the minimum index such that j > i and prices[j] <= prices[i]. Otherwise, you will not receive any discount at all.

Return an integer array answer where answer[i] is the final price you will pay for the ith item of the shop, considering the special discount.*/

public class FinalPricesWithaSpecialDiscountinaShop {
    public static void main(String[] args) {
        int[] n = {8,4,6,2,3};
        finalPrices(n);
    }
    public static int[] finalPrices(int[] prices) {
        int[] result = new int[prices.length];
        for(int i = 0; i < prices.length-1; i++){
            boolean isLess = false;
            for(int j = i+1; j <prices.length; j++){
                if(prices[j]<=prices[i]){
                    result[i]=prices[i]-prices[j];
                    isLess = true;
                    break;
                }
            }
            if(isLess){
                isLess = false;
            } else {
                result[i]=prices[i];
            }
        }
        result[prices.length-1]=prices[prices.length-1];
        for(int x: result){
            System.out.println(x);
        }
        return result;
    }
}
