package com.dsa.strings.instrcution;

import java.util.ArrayList;
import java.util.List;

public class SearchCharacter {

    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(str.indexOf('l'));
        System.out.println(search(str, 'l'));
        System.out.println(search("", 'l'));
        System.out.println(searchAllOccurrences(str, 'l'));
        System.out.println(countNumberOfWords(str));
        System.out.println(countNumberOfWords(" Hello    world how are you "));
    }

    public static int search(String str, char ch){
        // Approach 1 : Convert to char array look for char at index by linear search ==> TC : O(n) + O(n) ==> O(n); AS: O(n)
        // Approach 2 : use CharAt method to find the char

        if (str == null){
            return  -1;
        }

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch){
                return i;
            }
        }

        return -1;
        // TC: O(n)
        // AS: O(1)
    }

    public static List<Integer> searchAllOccurrences(String str, char ch){
        List<Integer> indices = new ArrayList<>();

        if (str == null){
            return indices;
        }

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch){
                indices.add(i);
            }
        }
        return indices;

        // TC: O(n)
        // AS: O(n)
    }

    public static int countNumberOfWords(String str){

        int count = 0;
        if (str == null || str.isEmpty()){
            return count;
        }

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' '){ // ASCII Value of space is 32
                count++;
            }
        }
        // Assumption that we don't have a space in the end
        // Last word doesn't have a space in the end
        if (str.charAt(str.length() - 1) != ' '){
            count++;
        }


        return count;
        // TC : O(n)
        // AS : O(1)
    }
}
