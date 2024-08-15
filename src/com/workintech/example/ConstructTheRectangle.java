package com.workintech.example;

import java.util.Iterator;
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
}
