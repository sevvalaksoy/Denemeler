package com.workintech.example;
/* https://leetcode.com/problems/first-unique-character-in-a-string/submissions/1339536567 */
/* Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1. */
public class FirstUniqCharacter {
    public static void main(String[] args) {
        firstUniqChar("loveleetcode");
        firstUniqChar("z");
        firstUniqChar("aabb");
    }
    public static int firstUniqChar(String s) {
        char[] characters = s.toCharArray();
        if(characters.length==1){
            System.out.println(0);
            return 0;
        }
        int[] indexes = new int[characters.length];
        for (int i = 0; i < characters.length; i++ ){
            if(indexes[i]!=0){
                continue;
            }
            if(i==characters.length-1){
                System.out.println(i);
                return i;
            }
            boolean isSingle = true;
            for ( int j = i+1; j < characters.length; j++){
                if(characters[i]==characters[j]){
                    indexes[j] = j;
                    isSingle = false;
                }
            }
            if(isSingle){
                System.out.println(i);
                return i;
            }
        }
        System.out.println(-1);
        return -1;
    }
}
// THE SOLUTION I HAVE FOUND AND EXAMINED.
/* class Solution {
    public int firstUniqChar(String s) {
        int[] count = new int[26];
        for(char ch : s.toCharArray())
        count[ch-'a']++;

        int n = s.length();
        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            if(count[ch - 'a'] == 1)
            return i;
        }
        return -1;
    }
}
*/
