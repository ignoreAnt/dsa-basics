package com.java.basics.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lists {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        List<String> stringList = new LinkedList<>();
        List<String> stringList1 = List.of("hello", "Hi", "Heya");
        System.out.println(concatenate(stringList1, "#"));
    }

    public static String concatenate(List<String> strings, String operator){
        StringBuilder result = new StringBuilder();
        for (String s: strings) {
            result.append(operator).append(s);
        }

        return result.toString();
    }

}
