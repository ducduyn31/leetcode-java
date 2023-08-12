package com.github.ducduyn31.leetcode.medium.uniquepaths2;

public class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        var m = obstacleGrid.length;
        var n = obstacleGrid[0].length;
        var result = new int[m][n];

        for (var i = 0; i < m; i++) {
            for (var j = 0; j < n; j++) {
                if (obstacleGrid[i][j] == 1) {
                    result[i][j] = 0;
                } else if (i == 0 && j == 0) {
                    result[i][j] = 1;
                } else if (i == 0) {
                    result[i][j] = result[i][j - 1];
                } else if (j == 0) {
                    result[i][j] = result[i - 1][j];
                } else {
                    result[i][j] = result[i - 1][j] + result[i][j - 1];
                }
            }
        }

        return result[m - 1][n - 1];
    }
}
