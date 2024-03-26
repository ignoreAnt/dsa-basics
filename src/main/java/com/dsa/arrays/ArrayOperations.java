package com.dsa.arrays;

import java.util.Arrays;

public class ArrayOperations {
    public static void main(String[] args) {
        // Different ways of declaration
        int[] ints = new int[100];
        int len = 30;
        int[] ints1 = new int[len];
        int[] ints2 = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] ints3 = new int[]{3, 5, 7, 9, 11, 17, 21};

        int[] ints4 = Arrays.copyOf(ints2, ints.length);
        System.out.println(Arrays.toString(ints4));



        System.out.println(search(new int[]{1, 2, 3, 4, 5}, 3));
        System.out.println(search(new int[]{1, 2, 3, 4, 5}, 7));

        System.out.println(Arrays.toString(insert(ints3, 42, 3)));
        System.out.println(Arrays.toString(insertV2(ints3, 42, 3)));
    }

    public static int search(int[] nums, int target){
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target){
                return i;
            }
        }

        return -1;
    }

    public static int[] insert(int[] arr, int element, int index){
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }


        for (int i = newArr.length - 2; i >= index ; i--) {
            newArr[i + 1] = newArr[i];
        }
        newArr[index] = element;

        return newArr;
    }

    public static int[] insertV2(int[] arr, int element, int index){
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < index; i++) {
            newArr[i] = arr[i];
        }
        newArr[index] = element;

        for (int i = index + 1; i < newArr.length; i++) {
            newArr[i] = arr[i - 1];
        }

        return newArr;
    }


}
