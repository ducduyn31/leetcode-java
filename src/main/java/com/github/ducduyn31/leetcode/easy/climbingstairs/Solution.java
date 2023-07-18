package com.github.ducduyn31.leetcode.easy.climbingstairs;

public class Solution {
    public int climbStairs(int n) {
        var sqrtFive = Math.sqrt(5);
        var componentA = Math.pow((1 + sqrtFive)/ 2, n + 1.0);
        var componentB = Math.pow((1 - sqrtFive)/ 2, n + 1.0);
        var oneOver = 1 / sqrtFive;
        return (int) Math.round(oneOver * componentA - oneOver * componentB);
    }
}
