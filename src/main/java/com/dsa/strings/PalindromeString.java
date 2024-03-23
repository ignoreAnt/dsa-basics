package com.dsa.strings;

public class PalindromeString {
    public static void main(String[] args) {
        String hello = "Hello World!";
        System.out.println(hello.charAt(0));
        System.out.println(checkPalindrome("malayalam"));
        System.out.println(checkPalindromeV2("Mom"));
    }

    public static boolean checkPalindrome(String str){
        // 1. Reverse String
        // 2. Check if the reversed string is same as str

        String reverse = StringReverse.reverse(str);

        return reverse.equals(str);

        // Time complexity : O(n)
        // Auxiliary Space : O(n)
    }

    public static boolean checkPalindromeV2(String str){

        if (str == null || str.isEmpty()){
            return false;
        }

        int i = 0;
        int j = str.length() - 1;

        while (i < j){
            if (str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }

        return true;

        // Time complexity : O(n) ==> n is length of string
        // Auxiliary space : O(1)

    }
}
