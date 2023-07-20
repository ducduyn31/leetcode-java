package com.github.ducduyn31.leetcode.medium.triangle;

import java.util.List;

public class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        for (var line = triangle.size() - 2; line >= 0; line--) {
            for (var col = 0; col < triangle.get(line).size(); col++) {
                var oldValue = triangle.get(line).get(col);
                var candidateOne = triangle.get(line + 1).get(col);
                var candidateTwo = triangle.get(line + 1).get(col + 1);

                triangle.get(line).set(col, Math.min(oldValue + candidateOne, oldValue + candidateTwo));
            }
        }

        return triangle.get(0).get(0);
    }
}
