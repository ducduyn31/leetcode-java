package com.github.ducduyn31.leetcode.medium.permutations;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;


class SolutionTest {
    Solution solution;

    @BeforeEach
    public void setUp() {
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
    void permutation_shouldReturn6Elements_given3Elements() {
        var actual = solution.permute(new int[]{1, 2, 3});
        var expected = List.of(
                List.of(1, 2, 3),
                List.of(1, 3, 2),
                List.of(2, 1, 3),
                List.of(2, 3, 1),
                List.of(3, 1, 2),
                List.of(3, 2, 1)
        );
        assertNestedListEquals(expected, actual);
    }

    @Test
    void permutation_shouldReturn2Elements_given2Elements() {
        var actual = solution.permute(new int[]{1, 2});
        var expected = List.of(
                List.of(1, 2),
                List.of(2, 1)
        );
        assertIterableEquals(expected, actual);
    }

    @Test
    void permutation_shouldReturn1Elements_given1Elements() {
        var actual = solution.permute(new int[]{1});
        var expected = List.of(
                List.of(1)
        );
        assertIterableEquals(expected, actual);
    }
}
