package com.dsa.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//March 18 lesson- Rema revise
public class TwoSum {

    public static void main(String[] args) {
//        int [] intArray = new int[]{2,7,11,15};
//        int target = 9;

//        int [] intArray = new int[]{3,2,4,};
//        int target = 6;

        int[] intArray = new int[]{3, 3,};
        int target = 6;

        int[] indices = findIndicesThatMatchTarget(intArray, target);
        System.out.println(Arrays.toString(indices));


        System.out.println(Arrays.toString(twoSumV2(new int[]{3, 2, 4}, 6)));
        System.out.println(Arrays.toString(twoSumV3(new int[]{2,7,11,15}, 9)));
        System.out.println(Arrays.toString(twoSumV3(new int[]{3,2,4}, 6)));
        System.out.println(Arrays.toString(twoSumV3(new int[]{3,3}, 6)));
    }

    public static int[] findIndicesThatMatchTarget(int[] intArray, int target) {
        if (intArray == null || intArray.length == 0) {
            return new int[]{};
        }

        int indices[] = new int[2];
        for (int i = 0; i < intArray.length - 1; i++) {
            for (int j = i + 1; j <= intArray.length - 1; j++) {
                if (intArray[i] + intArray[j] == target) {
                    indices[0] = i;
                    indices[1] = j;
                    return indices;
                }
            }
        }
        return new int[]{};
    }


    public static int[] twoSum(int[] arr, int target) {
        int[] indices = new int[2];

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                if (arr[i] + arr[j] == target) {
                    indices[0] = i;
                    indices[1] = j;
                    return indices;
                }

                System.out.println(arr[i] + ", " + arr[j]);
            }
        }

        return new int[]{};

        // Time Complexity : O(n2)
        // Auxiliary space : O(1)
    }

    public static int[] twoSumV2(int[] arr, int target) {

        Map<Integer, Integer> unique = new HashMap<>();
        int[] result = new int[2];
        // key --> value
        for (int i = 0; i < arr.length; i++) { // O(n)
            unique.put(arr[i], i);
        }

        for (int i = 0; i < arr.length; i++) {  // O(n)
            int elementToSearch = target - arr[i];
            if (unique.containsKey(elementToSearch)) { //O(1)
                result[0] = i;
                result[1] = unique.get(elementToSearch);
                return result;
            }
        }

        // time complexity :  O(n) + O(n) ==> 2 O(n) ==> O(n)
        // Auxiliary space :  O(n)
        return result;
    }

    public static int[] twoSumV3(int[] arr, int target) {

        Map<Integer, Integer> unique = new HashMap<>();
        int[] result = new int[2];
        // key --> value

        for (int i = 0; i < arr.length; i++) {  // O(n)
            int elementToSearch = target - arr[i];
            if (unique.containsKey(elementToSearch)) { //O(1)
                result[0] = unique.get(elementToSearch);
                result[1] = i;
                return result;
            }
            unique.put(arr[i], i);
        }

        // time complexity :  O(n)
        // Auxiliary space :  O(n)
        return result;
    }
}
