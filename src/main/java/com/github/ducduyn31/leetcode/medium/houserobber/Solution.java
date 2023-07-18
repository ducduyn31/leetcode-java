package com.github.ducduyn31.leetcode.medium.houserobber;

public class Solution {

    public int rob(int[] nums) {
        var result = nums[0];
        var lastResult = 0;

        for (int i = 1; i < nums.length; i++) {
            var temp = lastResult;
            lastResult = result;
            result = Math.max(temp + nums[i], result);
        }

        return result;
    }
}
