package com.workintech.example;

/* https://leetcode.com/problems/greatest-english-letter-in-upper-and-lower-case/submissions/1369119513 */

/* Given a string of English letters s, return the greatest English letter which occurs as both a lowercase and uppercase letter in s. The returned letter should be in uppercase. If no such letter exists, return an empty string.

An English letter b is greater than another letter a if b appears after a in the English alphabet. */

public class GreatestEnglishLetterinUpperandLowerCase {
    public static void main(String[] args) {
        greatestLetter("arRAzFif");
    }
    public static String greatestLetter(String s) {
        char[] letters = s.toCharArray();
        char both = '1';
        for(int i = 0; i < letters.length-1; i++){
            for(int j = i+1; j < letters.length; j++){
                if(((int)letters[i])+32==(int)letters[j]){
                    if((int)letters[i]> (int)both){
                        both = letters[i];
                    }
                } else if (((int)letters[i])-32==(int)letters[j]){
                    if((int)letters[j]>(int)both){
                        both = letters[j];
                    }
                } else {
                    continue;
                }
            }
        }
        String result = ((int)both)>=65?String.valueOf(both): "";
        System.out.println(result);
        return result;
    }
    // By using class casting and starting from the highest ascii number, it gives out the result the best way it could
    public static String greatestLetter1(String s) {
        String max="";
        for(int i=90;i>=65;i--)
        {
            if(s.indexOf((char)i)!=-1 && s.indexOf((char)i+32)!=-1)
                return ""+(char)i;
        }
        return "";
    }
}
