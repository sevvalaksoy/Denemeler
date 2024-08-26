package com.workintech.example;

/* https://leetcode.com/problems/divide-a-string-into-groups-of-size-k/submissions/1368351875 */

/*A string s can be partitioned into groups of size k using the following procedure:

The first group consists of the first k characters of the string, the second group consists of the next k characters of the string, and so on. Each character can be a part of exactly one group.
For the last group, if the string does not have k characters remaining, a character fill is used to complete the group.
Note that the partition is done so that after removing the fill character from the last group (if it exists) and concatenating all the groups in order, the resultant string should be s.

Given the string s, the size of each group k and the character fill, return a string array denoting the composition of every group s has been divided into, using the above procedure.*/

public class DivideStringIntoGroupOfSizeK {
    public static void main(String[] args) {
        divideString("abcdefghi", 5, 'x');
    }
    public static String[] divideString(String s, int k, char fill) {
        int num = s.length() / k;
        int remaining = s.length() % k;
        int fillings = k - remaining;
        int size = remaining==0? num : num+1;
        String[] result = new String[size];
        char[] letters = s.toCharArray();
        String x = "";
        int count = 0;
        for(int i = 0; i < letters.length-remaining; i++){
            if ( (i+1) % k != 0){
                x += letters[i];
            } else {
                x += letters[i];
                result[count] = x;
                x = "";
                count++;
            }
        }
        if(remaining != 0){
            do {
                x += letters[letters.length-remaining];
                remaining -= 1;
            } while (remaining>0);
            while(fillings>0){
                x += fill;
                fillings--;
            }
            result[size-1] = x;
        }
        for(String a : result){
            System.out.println(a);
        }
        return result;
    }
}
