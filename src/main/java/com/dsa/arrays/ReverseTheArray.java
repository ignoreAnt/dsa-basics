package com.dsa.arrays;

import java.util.Arrays;

public class ReverseTheArray {
    public static void main(String[] args) {

        int arr[] = new int[]{1, 2, 3, 4, 5, 6};

/*        int newArray[]=reverseArray(arr);
//        int newArray[]= reverseArray_UsingNewArray_IdealWay(arr);
        int reversedInPlaceArray []= reverseArrayInPlace(arr);

        for (int i = 0; i < arr.length-1; i++) {
//          System.out.println(newArray[i]);
            System.out.println(reversedInPlaceArray[i]);
        }
        System.out.println(Arrays.toString(reverseIntegerArrayInPlace(arr)));
 */
        System.out.println(Arrays.toString(reverserStringArrayInPlace("Hello Universe!!!")));
    }

    //March18,2024- Initial approach
    public static int[] reverseArray_UsingNewArray(int[] orgArr) {
        int newArray[] = new int[orgArr.length];
        int j = 0;
        for (int i = orgArr.length-1; i>=0; i--) {
            newArray[j] = orgArr[i]  ;
            j ++;
        }
        return newArray;
    }

    //March19,2024 - Improved way
    public static int[] reverseArray_UsingNewArray_IdealWay(int[] orgArr)
    {
        //Remember to include null check first before array length. Reason being , on null array the length chck will give exception)
        if(orgArr == null || orgArr.length==0)
        {
          return new int[]{0};
        }
        //newArray[orgArr.length-1-i] = orgArr[i]; is a very important step to remember .
        //In the above program, we used a new variable j , to set the indices for new array.
        //Nn the below approach ,  we can use the existing variable i and using it logicllay to match our need .

        int newArray[] = new int[orgArr.length];
        for (int i = orgArr.length-1; i >= 0 ; i--) {
            newArray[orgArr.length-1-i] = orgArr[i];
        }
        return newArray;
    }


    public static int[] reverseIntegerArrayInPlace(int[] arr)
    {
        if(arr == null || arr.length==0)
        {
          return new int[]{};
        }
        int i= 0;
        int j = arr.length-1;
        while(i<j)
        {
           swap(i,j,arr) ;
           i ++;
           j --;
        }
        return arr;
    }

    public static void swap(int i, int j, int arr[]) {
        int temp;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void swap(int i, int j, char arr[]) {
        char temp;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    public static char[] reverserStringArrayInPlace(String str)
    {
        char [] charArray= str.toCharArray();
        System.out.println(Arrays.toString(charArray));

        int arrLength = str.length();
        System.out.println(arrLength);

        int i = 0;
        int j = charArray.length-1;

        while(i <j ){
            swap(i, j, charArray);
            i ++;
            j --;
        }
         return charArray;
    }

}

