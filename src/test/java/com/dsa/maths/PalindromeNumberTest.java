package com.dsa.maths;

import com.dsa.maths.complete.PalindromeNumber;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeNumberTest {

    @ParameterizedTest(name = "{index}) ==> {0} is palindrome : {1}")
    @CsvSource({
            "2002, true",
            "2312, false",
            "7, true",
            "2331332, true",
            "0, true",
            "219823232, false"
    })
    @DisplayName("Palindrome of the number")
    void palindromeNumber(int input, boolean output) {
        // Arrange
        // Act
        boolean expected = PalindromeNumber.palindromeNumber(input);

        // Assert
        assertEquals(expected, output);
    }
}