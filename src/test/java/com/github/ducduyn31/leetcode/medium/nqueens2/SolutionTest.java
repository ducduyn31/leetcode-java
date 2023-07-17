package com.github.ducduyn31.leetcode.medium.nqueens2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void totalNQueens_shouldReturn1_given1Queen() {
        assertEquals(1, solution.totalNQueens(1));
    }

    @Test
    void totalNQueens_shouldReturn0_given2Queens() {
        assertEquals(0, solution.totalNQueens(2));
    }

    @Test
    void totalNQueens_shouldReturn2_given4Queens() {
        assertEquals(2, solution.totalNQueens(4));
    }
}
