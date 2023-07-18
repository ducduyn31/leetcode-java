package com.github.ducduyn31.leetcode.medium.wordbreak;

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
    void wordBreak_shouldReturnTrue_givenLeetCode() {
        var s = "leetcode";
        var wordDict = List.of("leet", "code");
        assertTrue(solution.wordBreak(s, wordDict));
    }

    @Test
    void wordBreak_shouldReturnTrue_givenApplePenApple() {
        var s = "applepenapple";
        var wordDict = List.of("apple", "pen");
        assertTrue(solution.wordBreak(s, wordDict));
    }

    @Test
    void wordBreak_shouldReturnFalse_givenCatSandog() {
        var s = "catsandog";
        var wordDict = List.of("cats", "dog", "sand", "and", "cat");
        assertFalse(solution.wordBreak(s, wordDict));
    }

    @Test
    void wordBreak_shouldReturnTrue_givenEmptyString() {
        var s = "";
        var wordDict = List.of("cats", "dog", "sand", "and", "cat");
        assertTrue(solution.wordBreak(s, wordDict));
    }
}
