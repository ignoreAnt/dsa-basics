package com.dsa.arrays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseTheArrayTest {

    @Test
    @DisplayName("ReverseTheArrayUsingNewArray")

    void testReverseTheArray() {
        //Arrange --Given
        int[] inputArr = new int[]{1,2,3};
        int[] expectedResult = {3,2,1};

        //Act --When
        int[] actualResult =  ReverseTheArray.reverseArray_UsingNewArray(inputArr);

        // Assert
        assertArrayEquals(expectedResult,actualResult);
    }


    @Test
    @DisplayName("ReverseTheArrayUsingNewArray_IdealApproach")
    void testReverseTheArrayIdealWay()
    {
        //Arrange
        int orgArray[]= new int[] {10, 11, 12,13,14,15};
        int expectedResult [] = {15,14,13,12,11,10};

        //Act
        int actualResult [] = ReverseTheArray.reverseArray_UsingNewArray_IdealWay(orgArray);

        //Assert
        assertArrayEquals(expectedResult,actualResult);
    }

}