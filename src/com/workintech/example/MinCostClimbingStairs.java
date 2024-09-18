package com.workintech.example;

/*https://leetcode.com/problems/min-cost-climbing-stairs/submissions/1394084761*/

/*You are given an integer array cost where cost[i] is the cost of ith step on a staircase. Once you pay the cost, you can either climb one or two steps.

You can either start from the step with index 0, or the step with index 1.

Return the minimum cost to reach the top of the floor.*/

public class MinCostClimbingStairs {
    public static void main(String[] args) {
        int[] costs = {1,100,1,1,1,100,1,1,100,1};
        minCostClimbingStairs(costs);
    }
    public static int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        if (n == 0) return 0;
        if (n == 1) return cost[0];

        int first = cost[0]; // Cost to reach step 0
        int second = cost[1]; // Cost to reach step 1

        for (int i = 2; i < n; i++) {
            int current = cost[i] + Math.min(first, second);
            first = second; // Move first to second
            second = current; // Update second to current
        }
        System.out.println(Math.min(first,second));
        return Math.min(first, second);
    }
}
