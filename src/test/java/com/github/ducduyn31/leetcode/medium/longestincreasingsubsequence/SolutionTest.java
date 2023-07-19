package com.github.ducduyn31.leetcode.medium.longestincreasingsubsequence;

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
    void lengthOfLIS_shouldReturn4_given8Elements() {
        int[] nums = new int[]{10, 9, 2, 5, 3, 7, 101, 18};

        int result = solution.lengthOfLIS(nums);

        assertEquals(4, result);
    }

    @Test
    void lengthOfLIS_shouldReturn4_given6Elements() {
        int[] nums = new int[]{0, 1, 0, 3, 2, 3};

        int result = solution.lengthOfLIS(nums);

        assertEquals(4, result);
    }

    @Test
    void lengthOfLIS_shouldReturn1_given7Elements() {
        int[] nums = new int[]{7, 7, 7, 7, 7, 7, 7};

        int result = solution.lengthOfLIS(nums);

        assertEquals(1, result);
    }

    @Test
    void lengthOfLIS_shouldReturn6_given9Elements() {
        int[] nums = new int[]{1, 3, 6, 7, 9, 4, 10, 5, 6};

        int result = solution.lengthOfLIS(nums);

        assertEquals(6, result);
    }
}
