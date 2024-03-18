package com.dsa.aoa.arrays;

public class AverageOfArray {

    public static void main (String [] args)
    {
        int [] arr = new int[] {0,2};
        int [] arrempty = new int[] {};
        int [] arrnull = null;

        //int averageOfArray =calcAverageOfArray(arr);
//        int averageOfArray =calcAverageOfArray(arrempty);
        int averageOfArray =calcAverageOfArray(arrnull);
        System.out.println("Average is -- "+averageOfArray);
    }

    public static int calcAverageOfArray(int [] arr)
    {
        if (arr==null || arr.length ==0 )
        {
            return 0;
        }
    int arrLength= arr.length;
    int arrSum=0;

        for (int i = 0; i < arrLength; i++) {

            arrSum= arrSum+arr[i];
        }

        return arrSum/arrLength;
    }

}
