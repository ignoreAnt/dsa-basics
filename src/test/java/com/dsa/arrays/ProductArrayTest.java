package com.dsa.arrays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductArrayTest {

    @Test
    @DisplayName("For an array correct product is calculated")
    void product() {
        // Arrange
        int[] nums = new int[]{1, 2};
        int expected = 2;

        // Act
        int actual = ProductArray.product(nums);

        // Assert
        assertEquals(expected, actual);
    }
}