package com.github.ducduyn31.leetcode.medium.combinationsum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution {

    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        combinationSum(candidates, target, 0, new LinkedList<>());
        return result;
    }

    private void combinationSum(int[] candidates, int target, int start, LinkedList<Integer> currentCombination) {
        if (target == 0) {
            result.add((List<Integer>) currentCombination.clone());
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            if (candidates[i] <= target) {
                currentCombination.add(candidates[i]);
                combinationSum(candidates, target - candidates[i], i, currentCombination);
                currentCombination.removeLast();
            } else break;
        }
    }
}
