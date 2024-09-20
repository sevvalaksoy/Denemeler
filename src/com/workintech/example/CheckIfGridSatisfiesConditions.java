package com.workintech.example;

/*https://leetcode.com/problems/check-if-grid-satisfies-conditions/submissions/1396241928*/

/*You are given a 2D matrix grid of size m x n. You need to check if each cell grid[i][j] is:

Equal to the cell below it, i.e. grid[i][j] == grid[i + 1][j] (if it exists).
Different from the cell to its right, i.e. grid[i][j] != grid[i][j + 1] (if it exists).
Return true if all the cells satisfy these conditions, otherwise, return false.*/

public class CheckIfGridSatisfiesConditions {
    public static void main(String[] args) {
        int[][] grid = {{1},{2},{3}};
        satisfiesConditions(grid);
    }
    public static boolean satisfiesConditions(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if( i < m-1 && grid[i][j]!=grid[i+1][j]){
                    System.out.println(false);
                    return false;
                }
                if( j < n-1 && grid[i][j]==grid[i][j+1]){
                    System.out.println(false);
                    return false;
                }
            }
        }
        System.out.println(true);
        return true;
    }
}
