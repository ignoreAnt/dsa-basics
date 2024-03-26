package com.dsa.maths.complete;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(palindromeNumber(2002));
        System.out.println();
    }

    public static boolean palindromeNumber(int n){
        // 1. reverse the number
        // 2. check if it's the same as n

        int reverse = 0;
        int temp = n;
        while (temp != 0){
            reverse = (reverse * 10) + (temp % 10);
            temp = temp / 10;
        }

        return (reverse == n);

        // Time complexity : O(number of digits)
        // Auxiliary space : O(1)
    }

}
