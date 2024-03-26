package com.dsa.arrays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReversePrintArrayElementsTest {

    @Test
    @DisplayName("ReversePrintArrayElements-i/p : [1, 2, 3, 4, 5]")
    void testReversePrint() {
        //Arrange --Given
        int[] inputArr = new int[]{1,2,3,4,5};

        //Act --When
         ReversePrintArrayElements.reversePrintArrayElements(inputArr);

        //Act & Assert
        //assertEquals("5,4,3,2,1",ReversePrintArrayElements.reversePrintArrayElements(inputArr));

    }
}