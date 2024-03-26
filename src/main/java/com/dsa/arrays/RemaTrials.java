package com.dsa.arrays;

public class RemaTrials {

    public static void main(String[] args) {

        int intArray[] = new int[]{1,2,3,4,5,6,7};

        System.out.println(sumArrayR(intArray));
        System.out.println(averageOfArray(intArray));




    }

    public static int sumArrayR(int[] intArray)
    {

        if(intArray == null || intArray.length==0)
        {
            return 0;
        }
        int sum =0;
        for(int i=0; i<intArray.length ; i++)
        {
            sum = sum + intArray[i];
        }
        return sum;
    }


    public static boolean averageOfArray(int[] intArray)
    {



        return false;
    }
}
