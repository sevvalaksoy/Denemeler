package com.workintech.example;

/*https://leetcode.com/problems/palindrome-number/submissions/1373576829*/

/*Given an integer x, return true if x is a palindrome, and false otherwise.*/

public class PalindromNumber {
    public static void main(String[] args) {
        isPalindrome(121);
    }
    public static boolean isPalindrome(int x) {
        if(x<0){
            System.out.println(false);
            return false;
        }
        if(x==0){
            System.out.println(true);
            return true;
        }
        int copy = x;
        String result = "";
        while(copy>=1){
            result += String.valueOf(copy % 10);
            copy = copy/10;
        }
        if(result.equals(String.valueOf(x))){
            System.out.println(true);
            return true;
        } else {
            System.out.println(false);
            return false;
        }
    }
    //Fastest solution
    public static boolean isPalindrome1(int x) {
        boolean b = false;
        int n = x,s=0;
        while(n>0){
            s = s*10 + n%10;
            n/=10;
        }
        if(s==x){
            b=true;
        }
        return b;
    }
}
