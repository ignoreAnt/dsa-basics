package com.dsa.strings;

public class FindDuplicateCharactersPairsInString {

    public static void main(String[] args) {

        String str = "HelloWorld!";
//        String str = "LoveYouZindagi";
//        String str = "Rema";
//        String str = "";
//        String str = null;

        System.out.println("No:Of Duplicates char pairs found : "+ findDuplicates(str));
    }

    //March 19th Assignment
    public static int findDuplicates(String str)
    {
        System.out.println("Printing out");
        if ( str==null|| str.isEmpty())
        {
            return 0;
        }
        int foundDuplicates = 0;
        char [] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length-1; i++) {
            for (int j = i+1; j< charArray.length-1 ; j++) {

                int i1 = 1;
                if (charArray[i]==charArray[j]) {
                    foundDuplicates=foundDuplicates+1;
                }
            }
        }
        return foundDuplicates;
    }
}
