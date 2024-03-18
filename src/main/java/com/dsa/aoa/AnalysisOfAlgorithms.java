package com.dsa.aoa;

public class AnalysisOfAlgorithms {
    public static void main(String[] args) {

        System.out.println(5 / 2);
        System.out.println(5 % 2);
        System.out.println(6 % 2);
        System.out.println(getSum(10));
        System.out.println(getSumV2(10));
        System.out.println(getSumV3(10));

    }

    public static int getSum(int n){ // --> linear n --> number of operations will be directly proportional O(n)
        int sum = 0; // constant
        for (int i = 1; i <= n ; i++) { // i<= n --> n times , i++ --> n times
            sum = sum + i; // n times
//            sum += i;
        }
        // i <= n --> n times
        // i++ --> n times
        // sum = sum + i --> n times
        // n + n + n = 3n + c computations steps

        return sum;
    }

    public static int getSumV2(int n){ // n2 --> Quadratic running time O(n2)
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i ; j++) {
//                sum = sum + 1
                sum++; // 1 + (1 + 1) + (1 + 1 + 1)
            }
        }

        return sum;
    }

    public static int getSumV3(int n){ // constant time O(1)
        return n * (n + 1)/2;
    }
}
