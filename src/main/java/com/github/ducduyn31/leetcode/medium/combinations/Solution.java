package com.github.ducduyn31.leetcode.medium.combinations;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {

    List<List<Integer>> result = new LinkedList<>();

    public List<List<Integer>> combine(int n, int k) {
        combine(n, 1, 0, new int[k]);
        return result;
    }

    private void combine(int end, int start, int count, int[] currentCombination) {
        if (count == currentCombination.length) {
            result.add(Arrays.stream(currentCombination).boxed().collect(Collectors.toList()));
            return;
        }

        for (int i = start; i <= end - (currentCombination.length - count) + 1; i++) {
            currentCombination[count] = i;
            combine(end, i + 1, count + 1, currentCombination);
        }
    }
}
