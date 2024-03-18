package com.dsa.arrays;

import java.util.Arrays;

public class ProductArray {

    public static void main(String[] args) {
        int[] ints = null;
        int[] nums = new int[]{1, 2, 3};
        System.out.println(Arrays.toString(nums));
        System.out.println(product(nums));
    }

    public static int product(int[] arr){
        int product = 1;
        for (int i = 0; i < arr.length; i++) {
            product = product * arr[i];
        }

        return product;
    }

}
