package com.workintech.example;

/*https://leetcode.com/problems/teemo-attacking/submissions/1392268512*/

/*Our hero Teemo is attacking an enemy Ashe with poison attacks! When Teemo attacks Ashe, Ashe gets poisoned for a exactly duration seconds. More formally, an attack at second t will mean Ashe is poisoned during the inclusive time interval [t, t + duration - 1]. If Teemo attacks again before the poison effect ends, the timer for it is reset, and the poison effect will end duration seconds after the new attack.

You are given a non-decreasing integer array timeSeries, where timeSeries[i] denotes that Teemo attacks Ashe at second timeSeries[i], and an integer duration.

Return the total number of seconds that Ashe is poisoned.*/

public class TeemoAttacking {
    public static void main(String[] args) {
        int[] timeSeries = {1,3,5,7,9,11,13,15};
        findPoisonedDuration(timeSeries, 1);
    }
    public static int findPoisonedDuration(int[] timeSeries, int duration) {
        if (timeSeries == null || timeSeries.length == 0) {
            return 0;
        }
        int totalDuration = 0;

        for (int i = 0; i < timeSeries.length - 1; i++) {
            int attackTime = timeSeries[i];
            int nextAttackTime = timeSeries[i + 1];

            int interval = nextAttackTime - attackTime;

            if (interval < duration) {
                totalDuration += interval;
            } else {
                totalDuration += duration;
            }
        }

        totalDuration += duration;
        System.out.println(totalDuration);
        return totalDuration;
    }
}
