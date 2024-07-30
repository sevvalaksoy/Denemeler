package com.workintech.example;

/*    3-) getLargestPrime isminde bir method yazmanız istenmektedir. int tipinde tek bir parametre almalıdır.
     - Method gelen parametrenin içerisindeki en büyük asal böleni bulmalı ve bu değeri döndürmelidir.
     - Örneğin;
             * getLargestPrime(21) => 7(3*7)
          * getLargestPrime(217) => 31 (7*31)
             * getLargestPrime(45) => 5(3*3*5)
          * getLargestPrime(0) => -1(Invalid)
         * getLargestPrime(-1) => -1(Invalid) */

public class LargestPrime {

    public static void main(String[] args) {
        getLargestPrime(217);
    }

    public static int getLargestPrime(int number) {
        if (number <= 1) {
            System.out.println(-1 + "(Invalid)");
            return -1;
        } else if (number == 2) {
            System.out.println(2);
            return 2;
        }
        int[] check = new int[number];
        int[] results = new int[number];
        for (int i = 3; i <= (number); i++) {
            if (i % 2 == 0) {
                continue;
            }
            if (number % i == 0) {
                check[i - 1] = i;
            }
        }
        for (int k = 0; k < check.length; k++) {
            int count = 0;
            for (int j = 3; j < check.length; j++) {
                if (check[k] % j == 0) {
                    count++;
                    continue;
                }
            }
            if (count == 1) {
                results[k] = check[k];
            }
        }
        int result = 0;
        for (int num : results) {
            if (num > result) {
                result = num;
            }
        }
        System.out.println(result);
        return result;
    }
}
