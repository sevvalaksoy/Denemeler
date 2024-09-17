package com.workintech.example;

/*https://leetcode.com/problems/hamming-distance/submissions/1392897730*/

/*The Hamming distance between two integers is the number of positions at which the corresponding bits are different.

Given two integers x and y, return the Hamming distance between them.*/

import java.util.LinkedList;
import java.util.Queue;

public class HammingDistance {
    public static void main(String[] args) {
        hammingDistance(1,4);
    }
    public static int hammingDistance(int x, int y) {
        Queue<Integer> firstX = new LinkedList<>();
        Queue<Integer> secondY = new LinkedList<>();
        while (x > 0) {
            firstX.offer(x % 2);
            x = x / 2;
        }
        while (y > 0) {
            secondY.offer(y % 2);
            y = y / 2;
        }
        int count = 0;
        while (!firstX.isEmpty() || !secondY.isEmpty()) {
            int bitX = firstX.isEmpty() ? 0 : firstX.poll();
            int bitY = secondY.isEmpty() ? 0 : secondY.poll();
            if (bitX != bitY) {
                count++;
            }
        }
        System.out.println(count);
        return count;
    }
    // BITWISE OPERATIONS!!
    public static int hammingDistance2(int x, int y) {
        // XOR x and y to get the differing bits
        int xor = x ^ y;

        // Count the number of 1s in the XOR result
        int distance = 0;
        while (xor != 0) {
            // Increment distance for each 1-bit
            distance += xor & 1;
            // Right shift to check the next bit
            xor >>= 1;
        }

        return distance;
    }
}
