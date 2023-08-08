package com.github.ducduyn31.leetcode.medium.searchinrotatedsortedarray;

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
    void search_shouldReturn4_givenTarget0() {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        int expected = 4;
        int actual = solution.search(nums, target);
        assertEquals(expected, actual);
    }

    @Test
    void search_shouldReturnNegative1_givenTarget3() {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 3;
        int expected = -1;
        int actual = solution.search(nums, target);
        assertEquals(expected, actual);
    }

    @Test
    void search_shouldReturnNegative1_givenTarget4() {
        int[] nums = {1};
        int target = 0;
        int expected = -1;
        int actual = solution.search(nums, target);
        assertEquals(expected, actual);
    }

    @Test
    void search_shouldReturnNegative1_givenTarget2() {
        int[] nums = {3, 1};
        int target = 2;
        int expected = -1;
        int actual = solution.search(nums, target);
        assertEquals(expected, actual);
    }

    @Test
    void search_shouldReturn0_givenTarget3() {
        int[] nums = {3, 5, 1};
        int target = 3;
        int expected = 0;
        int actual = solution.search(nums, target);
        assertEquals(expected, actual);
    }

    @Test
    void search_shouldReturn0_givenTarget5() {
        int[] nums = {5, 1, 3};
        int target = 5;
        int expected = 0;
        int actual = solution.search(nums, target);
        assertEquals(expected, actual);
    }

    @Test
    void search_shouldReturn4_givenTarget8() {
        int[] nums = {4, 5, 6, 7, 8, 1, 2, 3};
        int target = 8;
        int expected = 4;
        int actual = solution.search(nums, target);
        assertEquals(expected, actual);
    }

    @Test
    void search_shouldReturn1_givenTarget1() {
        int[] nums = {5,1,2,3,4};
        int target = 1;
        int expected = 1;
        int actual = solution.search(nums, target);
        assertEquals(expected, actual);
    }


}
