package com.dsa.arrays;

public class ReversePrintArrayElements {

    public static void main(String[] args)
    {
        int arr[]= new int[]{1,2,3,4,5,6};
        reversePrintArrayElements(arr);
    }

    public static char reversePrintArrayElements(int[] arr)
    {
        for (int i = arr.length-1; i>=0; i--) {

            System.out.println(arr[i]);
        }
        return 0;
    }
}
