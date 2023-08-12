package com.github.ducduyn31.leetcode.medium.uniquepaths2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void uniquePaths_shouldReturn2_given3x3() {
        var grid = new int[][]{{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};
        assertEquals(2, solution.uniquePathsWithObstacles(grid));
    }

    @Test
    void uniquePaths_shouldReturn1_given2x2() {
        var grid = new int[][]{{0, 1}, {0, 0}};
        assertEquals(1, solution.uniquePathsWithObstacles(grid));
    }
}
