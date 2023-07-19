package com.github.ducduyn31.leetcode.medium.longestincreasingsubsequence;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public int lengthOfLIS(int[] nums) {
        var subSeq = new ArrayList<Integer>();
        subSeq.add(nums[0]);

        for (var index = 1; index < nums.length; index++) {
            if (nums[index] > subSeq.get(subSeq.size() - 1)) {
                subSeq.add(nums[index]);
            } else {
                var insertPoint = Collections.binarySearch(subSeq, nums[index]);
                if (insertPoint < 0) insertPoint = -(insertPoint + 1);
                subSeq.set(insertPoint, nums[index]);
            }
        }

        return subSeq.size();
    }
}
