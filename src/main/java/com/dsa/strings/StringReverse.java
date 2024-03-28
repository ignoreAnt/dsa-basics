package com.dsa.strings;

import java.util.Arrays;

public class StringReverse {
    public static void main(String[] args) {
        String str = "hello world!";
        System.out.println(str);
        System.out.println(reverse(str));
    }

    public static String reverse(String s){
        char[] chars = s.toCharArray(); // O(n)

        int i = 0;
        int j = chars.length - 1;

        while (i < j){
            swap(i, j, chars);
            i++;
            j--;
        }

        return new String(chars);
        // Time complexity : O(n)
        // Auxiliary Space : O(n)
    }


    private static void swap(int i, int j, char[] chars){
         char temp = chars[i];
         chars[i] = chars[j];
         chars[j] = temp;
    }


}
