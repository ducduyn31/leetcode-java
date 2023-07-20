package com.github.ducduyn31.leetcode.medium.triangle;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void minimunTotal_shouldReturn11_given4Lines() {
        var triangle = List.of(
                Arrays.asList(2),
                Arrays.asList(3, 4),
                Arrays.asList(6, 5, 7),
                Arrays.asList(4, 1, 8, 3)
        );

        var result = solution.minimumTotal(triangle);

        assertEquals(11, result);
    }

    @Test
    void minimunTotal_shouldReturnMinus10_given1Line() {
        var triangle = List.of(
                List.of(-10)
        );

        var result = solution.minimumTotal(triangle);

        assertEquals(-10, result);
    }
}
