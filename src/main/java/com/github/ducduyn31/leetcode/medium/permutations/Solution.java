package com.github.ducduyn31.leetcode.medium.permutations;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        permute(nums, 0);
        return result;
    }

    private void permute(int[] nums, int count) {
        if (count == nums.length) {
            var temp = new ArrayList<Integer>();
            for(int i : nums) {
                temp.add(i);
            }
            result.add(temp);
            return;
        }

        for (int i = count; i < nums.length; i++) {
            int temp = nums[i];
            nums[i] = nums[count];
            nums[count] = temp;

            permute(nums, count + 1);

            temp = nums[i];
            nums[i] = nums[count];
            nums[count] = temp;
        }
    }

}
