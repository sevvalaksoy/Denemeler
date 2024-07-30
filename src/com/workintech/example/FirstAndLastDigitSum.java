package com.workintech.example;

/*  1-) getFirstAndLastDigitSum isminde bir method yazmanız istenmektedir. Bu metod bir adet int parametre alır.
    - Method aldığı int değerin ilk rakamı ile son rakamını toplayıp, toplam değerini geri döndürmelidir.
       - Örneğin;
            * 1234567 => 7 + 1 = 8
          * 45897 => 4 + 7 = 11
            * 874521 => 8 + 1 = 9 */

public class FirstAndLastDigitSum {
    public static void main(String[] args) {
        getFirstAndLastDigitSum(233245);
    }
    public static int getFirstAndLastDigitSum(int num){
        String st = Integer.toString(num);
        char[] digits = st.toCharArray();
        int firstDigit = Integer.parseInt(String.valueOf(digits[0]));
        int lastDigit = Integer.parseInt(String.valueOf(digits[digits.length-1]));
        System.out.println(firstDigit + lastDigit);
        return firstDigit + lastDigit;
    };
}
