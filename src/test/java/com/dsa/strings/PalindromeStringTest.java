package com.dsa.strings;

import com.dsa.maths.PalindromeNumber;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeStringTest {

    @ParameterizedTest(name = "{0} is Palindrome : {1}")
    @CsvSource({
            "mom, true",
            "malayalam, true",
            "dog, false",
            ", false",
            "'', false",
            "a, true",
            "Mom, false"
    })
    void checkPalindromeV2(String input, boolean output) {
        // Arrange
        // Act
        boolean actual = PalindromeString.checkPalindromeV2(input);

        // Assert
        assertEquals(output, actual);
    }
}