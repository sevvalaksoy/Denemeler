package com.workintech.example;

 /* 2-) hasSameLastDigit isminde bir method yazmanız istenmektedir. int tipinde parametreler almalıdır.(2 parametrede alabilir, 3 parametrede, 5 parametrede)
      - Methoda gelen parametlerdeki sayılardan herhangi ikisinin son rakamı aynıysa method true dönmeli. Eğer hiçbir parametrenin son rakamı aynı değilse method false dönmelidir.
      - Örneğin;
             * 12, 23, 35, 16, 17 => false
  	     * 12, 23, 35, 13, 16, 17 => true(13 ve 23 ün son rakamı aynı)
             * 10, 87, 23, 44, 56, 90 => true (10 ve 90) */

public class SameLastDigit {

    public static void main(String[] args) {
        hasSameLastDigit(12, 23, 35, 13, 16, 17);
    }

    public static boolean hasSameLastDigit(int... numbers){
        int[] check = new int[numbers.length];
        boolean result = false;
        for ( int i = 0; i < numbers.length; i++){
            char[] digits = Integer.toString(numbers[i]).toCharArray();
            int lastDigit = Integer.parseInt(String.valueOf(digits[digits.length-1]));
            check[i] = lastDigit;
        }
        for (int i = 0; i < check.length-1; i++){
            for ( int j = 1; j < check.length; j++){
                if (check[i] == check[j]) {
                    result = true;
                    break;
                }
            }
        }
        System.out.println(result);
        return result;
    }

}
