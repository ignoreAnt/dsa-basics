package com.dsa.strings;

public class DuplicatePairOfChars {
    public static void main(String[] args) {
        System.out.println(sameCharPairs("hello"));
    }
    
    public static int sameCharPairs(String str){

        int counts = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j =  i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)){
                    counts++;
                }
            }
        }

        return counts;

        // Time Complexity : O(n)
        // Auxiliary Space : O(1)
    }
}
