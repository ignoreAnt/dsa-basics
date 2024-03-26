package com.dsa.maths.practice;

public class RemaMathsTrials {

    public static void main(String[] args) {
//        int nbr = 123;
//        System.out.println("Count is "+ countNbrWithDivisionOperator(nbr));
//        ReverseNbrWithDivideAndModuloOperator();

//        int n =64348732;
//        countNbrOfDigitsRecursiveWay(n);

//        palindrome();

        int nbr =5;
        factorialOfNbr(nbr);

    }

    public static int countNbrWithDivisionOperator(int nbr)
    {
        System.out.println("Result from Divider Operator"+ ":"+ nbr/10);
        System.out.println("Result from Modulo Operator "+ ":"+ nbr%10);
        int count = 0;

        while(nbr !=0)
        {
            nbr= nbr/10;
            count = count +1;
        }

    return count;
    }

    public static void ReverseNbrWithDivideAndModuloOperator()
    {
     int nbr = 512;
     int reverseNbr =0;

     while(nbr != 0){
         reverseNbr = reverseNbr * 10 + nbr%10;
         nbr = nbr/10;
     }

     //Algorithm
        //Shift the nbr to left by multiplying by 10
        //Extract the last nbr by modular by 10 and add to above result
        //Remove the last digit by dividing by 10
        //This will continue until all the digits have been removed and added
    }


    public static int countNbrOfDigitsRecursiveWay(int n)
    {
        if(n/10==0)
        {
            return 1;
        }
        return 1+ countNbrOfDigitsRecursiveWay(n/10);

    }

    public static void palindrome()
    {
        int orgNbr = 101000101;
        int temp= orgNbr;
        int reversedNbr = 0;

        while (temp!=0)
        {
            reversedNbr= reversedNbr*10 + temp%10;
            temp=temp/10;
        }

        if(orgNbr==reversedNbr){
            System.out.println("Its a palindrome");
        }
    }

    public static void factorialOfNbr(int nbr) {
        int fact = 1;
        for (int i = 1; i <= nbr; i++) {
            fact= nbr*i;
        }
        System.out.println("factorial of "+ fact);
    }
}
