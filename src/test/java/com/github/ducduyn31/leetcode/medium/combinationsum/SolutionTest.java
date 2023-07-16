package com.github.ducduyn31.leetcode.medium.combinationsum;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    <T> void assertNestedListEquals(Iterable<List<T>> expected, Iterable<List<T>> actual) {
        var expectedSet = new HashSet<>();
        var expectedCount = 0;
        var actualSet = new HashSet<>();
        var actualCount = 0;

        // Convert the iterables to sets for order-agnostic comparison
        for (List<T> list : expected) {
            expectedSet.add(list);
            expectedCount++;
        }
        for (List<T> list : actual) {
            actualSet.add(list);
            actualCount++;
        }

        assertEquals(expectedSet, actualSet);
        assertEquals(expectedCount, actualCount);
    }

    @Test
    void combinationSum_shouldReturn2Elements_given7() {
        var expected = List.of(
                List.of(2, 2, 3),
                List.of(7)
        );
        var actual = solution.combinationSum(new int[]{2, 3, 6, 7}, 7);
        assertNestedListEquals(expected, actual);
    }

    @Test
    void combinationSum_shouldReturn3Elements_given8() {
        var expected = List.of(
                List.of(2, 2, 2, 2),
                List.of(2, 3, 3),
                List.of(3, 5)
        );
        var actual = solution.combinationSum(new int[]{2, 3, 5}, 8);
        assertNestedListEquals(expected, actual);
    }

    @Test
    void combinationSum_shouldReturn0Element_given1() {
        var expected = Collections.emptyList();
        var actual = solution.combinationSum(new int[]{2}, 1);
        assertIterableEquals(expected, actual);
    }
}
