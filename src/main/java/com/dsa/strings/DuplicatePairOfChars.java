package com.dsa.strings;

import java.util.ArrayList;
import java.util.List;

public class DuplicatePairOfChars {
    public static void main(String[] args) {
        System.out.println(sameCharPairs("hello"));
        System.out.println(pairs("hello world how are you doing today ?"));
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

    public static List<Pair> pairs(String str){
        List<Pair> pairs = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) != ' '
                        && str.charAt(j) != ' '
                        && str.charAt(i) == str.charAt(j)) {
                    pairs.add(new Pair(str.charAt(i), str.charAt(j)));
                }
            }
        }

        return pairs;
    }

    public static class Pair{
        char a;
        char b;

        public Pair(char a, char b) {
            this.a = a;
            this.b = b;
        }

        @Override
        public String toString() {
            return "{" + a +
                    ", " + b +
                    '}';
        }
    }
}
