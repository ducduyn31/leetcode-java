package com.github.ducduyn31.leetcode.medium.combinations;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

class SolutionTest {

    Solution solution;

    @BeforeEach
    void setup() {
        solution = new Solution();
    }

    @ParameterizedTest
    @MethodSource("generateArguments")
    void combine_shouldReturnTheTotalCombination(int n, int k, List<List<Integer>> expected) {
        var actual = solution.combine(n, k);
        assertIterableEquals(expected, actual);
    }

    static Stream<Arguments> generateArguments() {
        return Stream.of(
                Arguments.of(1, 1, Collections.singletonList(Collections.singletonList(1))),
                Arguments.of(2, 1, Arrays.asList(Collections.singletonList(1), Collections.singletonList(2))),
                Arguments.of(3, 2, Arrays.asList(Arrays.asList(1, 2), Arrays.asList(1, 3), Arrays.asList(2, 3))),
                Arguments.of(4, 2, Arrays.asList(Arrays.asList(1, 2), Arrays.asList(1, 3), Arrays.asList(1, 4), Arrays.asList(2, 3), Arrays.asList(2, 4), Arrays.asList(3, 4))),
                Arguments.of(4, 3, Arrays.asList(Arrays.asList(1, 2, 3), Arrays.asList(1, 2, 4), Arrays.asList(1, 3, 4), Arrays.asList(2, 3, 4))),
                Arguments.of(5, 3, Arrays.asList(Arrays.asList(1, 2, 3), Arrays.asList(1, 2, 4), Arrays.asList(1, 2, 5), Arrays.asList(1, 3, 4), Arrays.asList(1, 3, 5), Arrays.asList(1, 4, 5), Arrays.asList(2, 3, 4), Arrays.asList(2, 3, 5), Arrays.asList(2, 4, 5), Arrays.asList(3, 4, 5)))
        );
    }

}
