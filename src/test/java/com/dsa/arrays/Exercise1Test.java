package com.dsa.arrays;

import com.dsa.arrays.instructions.Exercise1;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Exercise1Test {

    @ParameterizedTest
    @CsvSource({
            "1; 1",
            "1, 1; 1",
            "1, 2, 3; 2",
            "; 0"
    })
    @DisplayName("Average of elements in array")
    void shouldReturnValidAverage(int[] input, int expected){
        // Arrange

        // Act
        int actual = Exercise1.average(input);

        // Assert
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(value = {"1,2,3;true", "4,5,6;false"}) // CSV format with expected output
    public void checkSum_ShouldReturnEvenSumResult(int[] numbers, boolean isEvenSum) {
        int sum = Arrays.stream(numbers).sum();
        assertEquals(isEvenSum, sum % 2 == 0);
    }


}