package com.github.ducduyn31.leetcode.medium.nqueens2;

import java.util.*;

public class Solution {
    int result = 0;

    public int totalNQueens(int n) {
        nQueensHelper(n, 0, new HashSet<>());
        return result;
    }

    private void nQueensHelper(int n, int col, Set<int[]> queens) {
        if (col == n) {
            this.result++;
            return;
        }

        var takenRows = new HashSet<Integer>();

        for (var queen : queens) {
            var queenCol = queen[0];
            var queenRow = queen[1];

            takenRows.add(queenRow);

            if (queenRow + (col - queenCol) < n)
                takenRows.add(queenRow + (col - queenCol));

            if (queenRow - (col - queenCol) >= 0)
                takenRows.add(queenRow - (col - queenCol));
        }

        for (int row = 0; row < n; row++) {
            if (takenRows.contains(row)) {
                continue;
            }
            var newQueen = new int[]{col, row};
            queens.add(newQueen);
            this.nQueensHelper(n, col + 1, queens);
            queens.remove(newQueen);
        }
    }
}
