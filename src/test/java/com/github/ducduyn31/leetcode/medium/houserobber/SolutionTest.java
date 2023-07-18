package com.github.ducduyn31.leetcode.medium.houserobber;

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
    void rob_shouldReturn4_given1231() {
        int[] nums = {1, 2, 3, 1};
        int expected = 4;
        int actual = solution.rob(nums);
        assertEquals(expected, actual);
    }

    @Test
    void rob_shouldReturn12_given27931() {
        int[] nums = {2, 7, 9, 3, 1};
        int expected = 12;
        int actual = solution.rob(nums);
        assertEquals(expected, actual);
    }
}
