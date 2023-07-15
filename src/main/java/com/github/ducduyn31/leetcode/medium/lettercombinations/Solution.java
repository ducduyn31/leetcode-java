package com.github.ducduyn31.leetcode.medium.lettercombinations;

import java.util.LinkedList;
import java.util.List;

public class Solution {

    private final String[] lettersMap = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
    private final List<String> result = new LinkedList<>();

    public List<String> letterCombinations(String digits) {

        if (digits.length() == 0)
            return result;

        letterCombinations(digits, new StringBuilder(), 0);
        return result;
    }

    private void letterCombinations(String digits, StringBuilder sb, int currentDigitIndex) {
        if (digits.length() == currentDigitIndex) {
            this.result.add(sb.toString());
            return;
        }

        for (char c : lettersMap[digits.charAt(currentDigitIndex) - '0'].toCharArray()) {
            sb.append(c);
            letterCombinations(digits, sb, currentDigitIndex + 1);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
