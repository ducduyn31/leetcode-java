package com.github.ducduyn31.leetcode.medium.wordsearch;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @ParameterizedTest
    @CsvSource(textBlock = """
            ABCCED, true
            SEE, true
            ABCB, false
            """)
    void existShouldReturnWhetherWordCanBeFound_givenExample1(String word, boolean expected) {
        var board = new char[][]{
                new char[]{'A', 'B', 'C', 'E'},
                new char[]{'S', 'F', 'C', 'S'},
                new char[]{'A', 'D', 'E', 'E'}
        };
        var actual = solution.exist(board, word);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(textBlock = """
            ABCESEEEFS, true
            """)
    void existShouldReturnWhetherWordCanBeFound_givenExample2(String word, boolean expected) {
        var board = new char[][]{
                new char[]{'A', 'B', 'C', 'E'},
                new char[]{'S', 'F', 'E', 'S'},
                new char[]{'A', 'D', 'E', 'E'}
        };
        var actual = solution.exist(board, word);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(textBlock = """
            a, true
            ab, false
            """)
    void existShouldReturnTrue_givenA(String word, boolean expected) {
        var board = new char[][]{
                new char[]{'a'}
        };
        var actual = solution.exist(board, word);
        assertEquals(expected, actual);
    }
}
