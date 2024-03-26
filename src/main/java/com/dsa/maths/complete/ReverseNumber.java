package com.dsa.maths.complete;

/**
 * Problem 2 : Reverse Number
 *
 * Problem Statement :  Given a number, return the reverse of the number
 *
 * Example :
 * i/p : 356 ⇒ o/p: 653
 * i/p: 2986 ⇒ o/p: 6892
 *
 * Solution :
 * Extract Individual Digits
 * Construct the new Number from extracted Digits
 */
public class ReverseNumber {
    public static void main(String[] args) {

        System.out.println(1567 / 10);  // ==> reduce a number by 1 digit , divide it by 10
        System.out.println(1567 % 10);  // ==> extract the left most digit of the number, % by 10
        // x < y ==> x % y ==> x
        System.out.println(reverseNumber(356));
        System.out.println(reverseNumber(2986));
        System.out.println(reverseNumber(0));
    }

    public static int reverseNumber(int n){
        int reverse = 0;
        while (n != 0){
            reverse = (reverse * 10) + (n % 10);
            n = n / 10;
        }

        return reverse;

        // n = 875
        // ==> 8 * 100 + 7 * 10 + 5
        // ==> 8 * 10^2 + 7 * 10^1 + 5 * 10^0
        //
        // reverse
        // Do following till the number reaches zero
        // 1. Shifting the number to left by multiplying with 10
        // 2. Extract the last number and add to the above result
        // 3. remove the last digit
        // 5 * 100 + 7 * 10 + 8
    }
}
