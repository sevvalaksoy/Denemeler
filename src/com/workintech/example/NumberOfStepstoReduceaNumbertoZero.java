package com.workintech.example;

/*https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/submissions/1361142298 */

/* Given an integer num, return the number of steps to reduce it to zero.

In one step, if the current number is even, you have to divide it by 2, otherwise, you have to subtract 1 from it. */

public class NumberOfStepstoReduceaNumbertoZero {
    public static void main(String[] args) {
        numberOfSteps(14);
    }
    public static int numberOfSteps(int num) {
        int count = 0;
        while(num>0){
            if(num % 2 == 0){
                num = num/2;
                count++;
            } else {
                if(num == 1){
                    count++;
                    break;
                }
                num = (num-1) / 2;
                count += 2;
            }
        }
        System.out.println(count);
        return count;
    }
}

