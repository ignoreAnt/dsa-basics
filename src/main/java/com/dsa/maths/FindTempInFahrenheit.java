package com.dsa.maths;

public class FindTempInFahrenheit {

    public static void main(String[] args) {
//        double validC = 32;
        double validC = 100.0;
//        double validC = -40;
//        double validC = 0;
//        double validC = 1000;
          double invalidC = -280.0;

        convertCelsiusToFahrenheit(invalidC);
    }
    public static double convertCelsiusToFahrenheit(double inputC)
    {

        System.out.println("Input in Degree Celsius "+inputC);

        //Temperature cannot be below absolute zero (-273.15°C).
        if(inputC < -273.15)
        {
            System.out.println("Temperature cannot be below absolute zero");
        return 0;
        }

        double fahrenheit = inputC * 1.8 + 32;
        System.out.println(fahrenheit);

        return fahrenheit;
    }
//    Formula to calc Fahrenheit
//    fahrenheit=(celsius*1.8)+32

}
