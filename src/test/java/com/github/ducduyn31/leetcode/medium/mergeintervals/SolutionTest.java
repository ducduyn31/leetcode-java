package com.github.ducduyn31.leetcode.medium.mergeintervals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {

    Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void merge_shouldReturn3Intervals_given4Intervals() {
        int[][] intervals = new int[][]{
                {1, 3},
                {2, 6},
                {8, 10},
                {15, 18}
        };

        int[][] expected = new int[][]{
                {1, 6},
                {8, 10},
                {15, 18}
        };

        int[][] actual = solution.merge(intervals);

        assertArrayEquals(expected, actual);
    }

    @Test
    void merge_shouldReturn1Interval_given2Intervals() {
        int[][] intervals = new int[][]{
                {1, 4},
                {4, 5}
        };

        int[][] expected = new int[][]{
                {1, 5}
        };

        int[][] actual = solution.merge(intervals);

        assertArrayEquals(expected, actual);
    }

    @Test
    void merge_shouldReturn2Intervals_given7Intervals() {
        int[][] intervals = new int[][]{
                {2, 3},
                {2, 2},
                {3, 3},
                {1, 3},
                {5, 7},
                {2, 2},
                {4, 6},
        };

        int[][] expected = new int[][]{
                {1, 3},
                {4, 7},
        };

        int[][] actual = solution.merge(intervals);

        assertArrayEquals(expected, actual);
    }
}
