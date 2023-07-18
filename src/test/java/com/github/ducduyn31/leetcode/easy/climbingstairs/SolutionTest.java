package com.github.ducduyn31.leetcode.easy.climbingstairs;

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
    @CsvSource(textBlock = """
            1, 1
            3, 3
            2, 2
            """)
    void climbStairs_shouldReturnNumberOfDistinctWaysToClimb(int n, int expected) {
        int actual = solution.climbStairs(n);
        assertEquals(expected, actual);
    }
}
