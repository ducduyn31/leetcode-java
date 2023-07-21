package com.github.ducduyn31.leetcode.medium.minimumpathsum;

public class Solution {
    public int minPathSum(int[][] grid) {
        var width = grid.length;
        var height = grid[0].length;

        for (var row = 0; row < width; row++) {
            for (var col = 0; col < height; col++) {
                if (row == 0 && col == 0) continue;
                if (row == 0) grid[row][col] += grid[row][col - 1];
                else if (col == 0) grid[row][col] += grid[row - 1][col];
                else grid[row][col] += Math.min(grid[row][col - 1], grid[row - 1][col]);
            }
        }

        return grid[width - 1][height - 1];
    }
}
