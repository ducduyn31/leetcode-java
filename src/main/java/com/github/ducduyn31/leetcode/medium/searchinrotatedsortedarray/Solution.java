package com.github.ducduyn31.leetcode.medium.searchinrotatedsortedarray;

public class Solution {

    private int binarySearch(int[] nums, int target, int left, int right) {
        while (left <= right) {
            var mid = (left + right) >>> 1;

            if (target == nums[mid]) {
                return mid;
            } else if (target < nums[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    private int narrowUnorderedSearch(int[] nums, int target, int left, int right) {
        if (right < left) return -1;

        if (left == right) {
            return nums[left] == target ? left : -1;
        }

        if (nums[left] < nums[right]) {
            return binarySearch(nums, target, left, right);
        }

        var mid = (left + right) >>> 1;
        if (nums[mid] == target) {
            return mid;
        }

        if (nums[mid] < nums[right] && nums[mid] < target && target <= nums[right]) {
            return narrowUnorderedSearch(nums, target, mid + 1, right);
        }
        if (nums[mid] > nums[right] && (nums[mid] < target || target <= nums[right])) {
            return narrowUnorderedSearch(nums, target, mid + 1, right);
        }
        return narrowUnorderedSearch(nums, target, left, mid - 1);
    }

    public int search(int[] nums, int target) {
        var left = 0;
        var right = nums.length - 1;

        return narrowUnorderedSearch(nums, target, left, right);
    }
}
