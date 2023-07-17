package com.github.ducduyn31.leetcode.medium.generateparenthesis;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<String> generateParenthesis(int n) {
        var result = new ArrayList<String>();

        if (n == 0) {
            return List.of("");
        }

        for (int leftCount = 0; leftCount < n; leftCount++) {
            var leftStrs = generateParenthesis(leftCount);
            var rightStrs = generateParenthesis(n - leftCount - 1);

            for (var leftStr : leftStrs) {
                for (var rightStr : rightStrs) {
                    result.add("(" + leftStr + ")" + rightStr);
                }
            }
        }

        return result;
    }
}
