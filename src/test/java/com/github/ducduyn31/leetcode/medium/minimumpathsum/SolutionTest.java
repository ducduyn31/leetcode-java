package com.github.ducduyn31.leetcode.medium.minimumpathsum;

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
    void minPathSum_shouldReturn7_givenGrid() {
        int[][] grid = new int[][]{
                new int[]{1, 3, 1},
                new int[]{1, 5, 1},
                new int[]{4, 2, 1}
        };

        int result = solution.minPathSum(grid);

        assertEquals(7, result);
    }

    @Test
    void minPathSum_shouldReturn12_givenGrid() {
        int[][] grid = new int[][]{
                new int[]{1, 2, 3},
                new int[]{4, 5, 6}
        };

        int result = solution.minPathSum(grid);

        assertEquals(12, result);
    }
}
