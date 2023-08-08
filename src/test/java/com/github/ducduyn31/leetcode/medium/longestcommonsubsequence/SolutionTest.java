package com.github.ducduyn31.leetcode.medium.longestcommonsubsequence;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @ParameterizedTest
    @CsvSource({
            "abcde, ace, 3",
            "abc, abc, 3",
            "abc, def, 0"
    })
    void longestCommonSubsequence_shouldReturn3_givenAbcdeAndAce() {
        String text1 = "abcde";
        String text2 = "ace";
        int expected = 3;
        int actual = solution.longestCommonSubsequence(text1, text2);
        assertEquals(expected, actual);
    }
}
