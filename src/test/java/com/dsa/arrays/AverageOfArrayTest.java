package com.dsa.arrays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AverageOfArrayTest {

    @Test
    @DisplayName("Average with positive integers")
    void testWithPositiveIntegers() {
        //Arrange --Given
        int[] arr = new int[]{2, 4, 6};
        int expected = 4;

        //Act --When
        int actual = AverageOfArray.calcAverageOfArray(arr);

        //Assert --Then
        assertEquals(expected, actual);
    }


    @Test
    @DisplayName("Average with Negative integers")
    void testWithNegativeIntegers() {
        //Arrange --Given
        int[] arr = new int[]{-2, -4, -6};
        int expected = -4;

        //Act --When
        int actual = AverageOfArray.calcAverageOfArray(arr);

        //Assert --Then
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Average with both Positive & Negative integers")
    void testWithBothMixedPositiveAndNegativeNbr() {
        //Arrange --Given
        int[] arr = new int[]{-2, -4, -6, 20, 25, 1};
        int expected = 5;

        //Act --When
        int actual = AverageOfArray.calcAverageOfArray(arr);

        //Assert --Then
        assertEquals(expected, actual);
    }


    @Test
    @DisplayName("Average with both Positive & Negative integers that nullifies")
    void testWithBothMixedPositiveAndNegativeNbrsThatNullifies() {
        //Arrange --Given
        int[] arr = new int[]{-2, -4, -6, 2, 4, 6};
        int expected = 0;

        //Act --When
        int actual = AverageOfArray.calcAverageOfArray(arr);

        //Assert --Then
        assertEquals(expected, actual);
    }


    @Test
    @DisplayName("Average with both Positive & Negative integers that nullifies that bring average less than zero")
    void testWithBothMixedPositiveAndNegativeNbrsThatNullifiesAverageLessthanZero() {
        //Arrange --Given
        int[] arr = new int[]{-2, -4, -6, 5, 4, 6};
        int expected = 0;

        //Act --When
        int actual = AverageOfArray.calcAverageOfArray(arr);

        //Assert --Then
        assertEquals(expected, actual);
    }


    //void shouldReturnResultForArrayWithOneElement()
    @Test
    @DisplayName("Average array with just one element")
    void testWithOneElementInArray() {
        //Arrange --Given
        int[] arr = new int[]{6};
        int expected = 6;

        //Act --When
        int actual = AverageOfArray.calcAverageOfArray(arr);

        //Assert --Then
        assertEquals(expected, actual);
    }
    //void shouldReturnResultForArrayWithDuplicatesExist()


    @Test
    @DisplayName("Average of array with Duplicates")
    void testWithDuplicates() {
        //Arrange --Given
        int[] arr = new int[]{6, 6, 7, 7, 9, 10};
        int expected = 7;

        //Act --When
        int actual = AverageOfArray.calcAverageOfArray(arr);

        //Assert --Then
        assertEquals(expected, actual);
    }
    //void shouldReturnResultAsZeroWithEmptyString()

    @Test
    @DisplayName("Average of empty array")
    void testWithEmptyArray() {
        //Arrange --Given
        int[] arr = new int[]{};
        int expected = 0;

        //Act --When
        int actual = AverageOfArray.calcAverageOfArray(arr);

        //Assert --Then
        assertEquals(expected, actual);
    }


    @Test
    @DisplayName("Average of null array")
    void testWithNull() {
        //Arrange --Given
        int[] arr = null;
        int expected = 0;

        //Act --When
        int actual = AverageOfArray.calcAverageOfArray(arr);

        //Assert --Then
        assertEquals(expected, actual);
    }
}