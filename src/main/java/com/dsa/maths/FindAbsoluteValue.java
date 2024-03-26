package com.dsa.maths;

public class FindAbsoluteValue {

    public static void main(String[] args) {
//         int input = -32;
//         int input = 45;
//         int input = 0;
//         int input = 100;
//         int input = 5;
//         int input = -1;
         int input = 1;

        int output = findAbsolute(input);
        System.out.println("Absolute value of " + input + " is "+ output);
    }

    public static int findAbsolute(int input)
    {
        if(input < 0 ){
            return input*-1;
        }
        return input;
    }


}
