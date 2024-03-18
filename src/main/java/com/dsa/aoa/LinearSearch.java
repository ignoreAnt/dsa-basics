package com.dsa.aoa;

public class LinearSearch {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 4, 12, 90, 32, 1, 100, -78};
        int[] ints = new int[]{1, 3, 5, 6, 7, 90, 109};
        int[] targets = new int[]{-78, 1, 12, 45};
        for (int i = 0; i < targets.length; i++) {
            System.out.println(search(nums, targets[i]));
        }
        System.out.println(search(nums, 90));
    }

    public static int search(int[] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
