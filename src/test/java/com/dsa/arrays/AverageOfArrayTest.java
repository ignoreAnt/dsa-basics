package com.dsa.aoa.arrays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AverageOfArrayTest {
    //void shouldReturnAverageForArrayWithPositiveIntegers()
    //void shouldReturnAverageForArrayWithNegativeIntegers()
    //void shouldReturnResultForArrayWithBothMixedPositiveAndNegativeNbr()
    //void shouldReturnSumAsZeroForArrayWithMixedThatNullifies()
    //void shouldReturnResultForArrayWithOneElement()
    //void shouldReturnResultForArrayWithDuplicatesExist()
    //void shouldReturnResultAsZeroWithEmptyString()


    @Test
    @DisplayName("Average with positive integers")
    void shouldReturnAverageForArrayWithPositiveIntegers()
    {
        //Arrange --Given
        int [] arr = new int[] {2,4,6};
        int expected = 4;

        //Act --When
        int actual = AverageOfArray.calcAverageOfArray(arr);

        //Assert --Then
        assertEquals(expected, actual);
    }


    @Test
    @DisplayName("Average with Negative integers")
    void shouldReturnAverageForArrayWithNegativeIntegers()
    {
        //Arrange --Given
        int [] arr = new int[] {-2,-4,-6};
        int expected = -4;

        //Act --When
        int actual = AverageOfArray.calcAverageOfArray(arr);

        //Assert --Then
        assertEquals(expected, actual);
    }

}