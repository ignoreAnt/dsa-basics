package com.dsa.maths;

public class Learning {
    public static void main(String[] args) {
        for (int i = 0; i < 32; i++) {
            System.out.println("fact : " + i + " ==> " + factorial(i));

        }
        System.out.println( factorialV2(32));
    }

    public static int factorial(int num){
        if (num <= 1){
            return 1;
        }
        return num * factorial(num - 1);

        // Any recursive function internally JVM is using stack (memory) to manage the function calls
        // Auxiliary space : O(n)
        // Time Complexity : O(n)
    }

    public static int factorialV2(int num){
        int fact = 1;
        for (int i = 1; i <= num; i++) {
//            fact = fact * i;
            fact *= i;
        }

        return fact;

        // Auxiliary Space : O(1)
        // Time complexity : O(n)
    }

}
