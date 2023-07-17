package com.github.ducduyn31.leetcode.medium.generateparenthesis;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void generateParenthesis_shouldReturn1Element_given1() {
        var expected = List.of("()");
        var actual = solution.generateParenthesis(1);
        assertIterableEquals(expected, actual);
    }

    @Test
    void generateParenthesis_shouldReturn5Elements_given3() {
        var expected = List.of("((()))", "(()())", "(())()", "()(())", "()()()");
        var actual = solution.generateParenthesis(3);
        assertIterableEquals(expected, actual);
    }
}
