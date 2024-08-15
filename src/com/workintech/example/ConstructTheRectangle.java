package com.workintech.example;

/* https://leetcode.com/problems/construct-the-rectangle/submissions/1356276666 */

/*A web developer needs to know how to design a web page's size. So, given a specific rectangular web page’s area, your job by now is to design a rectangular web page, whose length L and width W satisfy the following requirements:

The area of the rectangular web page you designed must equal to the given target area.
The width W should not be larger than the length L, which means L >= W.
The difference between length L and width W should be as small as possible.
Return an array [L, W] where L and W are the length and width of the web page you designed in sequence.

*/

import java.util.LinkedList;
import java.util.List;

public class ConstructTheRectangle {
    public static void main(String[] args) {
        constructRectangle(122122);
    }
    public static int[] constructRectangle(int area) {
        List<int[]> r = new LinkedList<>();
        for(int i  = 1; i <= area; i++){
            if(area % i == 0){
                int[] x = {i, area/i};
                r.add(x);
            }
        }
        for(int x:r.get(r.size()/2)){
            System.out.println(x);
        }
        return r.get(r.size()/2);
    }
    public static int[] constructRectangleII(int area) {
        for(int i=(int)(Math.floor(Math.sqrt(area)));i>0;i--){
            if(area%i==0)return new int[]{area/i,i};
        }
        return new int[]{area,1};
    }
}
