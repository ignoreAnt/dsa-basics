package com.dsa.arrays;

public class PrintOutPairs {
    public static void main(String[] args)
    {
        int arr[]= new int[]{1,2,3,4,5};
        int arr2[]= new int[]{1,2};
        int arr3[]= new int[]{1};
        int arr4[]= new int[]{};
        printPairs(arr);
    }

    public static void printPairs(int[] arr)
    {
        if (arr.length ==1 ) {
            System.out.println("No pair to print");
        }

        if (arr.length == 0 ) {
            System.out.println("Empty Array");
        }

        for (int i =0; i < arr.length; i ++) {

            for (int j = i+1; j < arr.length; j++)
            {
                System.out.println("("+ arr[i] +"," + arr[j] + ")");
            }
        }
    }

}
