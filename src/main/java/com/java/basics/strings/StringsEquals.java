package com.java.basics.strings;

public class StringsEquals {

    public static void main(String[] args) {

        String str1 = new String("OpenAI");
        String str2 = new String("OpenAI");

        String str3 = "AI";
        String str4 = "AI";

        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
        System.out.println(str3 == str4);
    }
}
