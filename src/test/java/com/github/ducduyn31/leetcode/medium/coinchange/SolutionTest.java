package com.github.ducduyn31.leetcode.medium.coinchange;

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
    void coinChange_shouldReturn3_given11() {
        int[] coins = {1, 2, 5};
        var amount = 11;

        var actual = solution.coinChange(coins, amount);

        assertEquals(3, actual);
    }

    @Test
    void coinChange_shouldReturn2_given3() {
        int[] coins = {2};
        var amount = 3;

        var actual = solution.coinChange(coins, amount);

        assertEquals(-1, actual);
    }

    @Test
    void coinChange_shouldReturn0_given0() {
        int[] coins = {1};
        var amount = 0;

        var actual = solution.coinChange(coins, amount);

        assertEquals(0, actual);
    }
}
