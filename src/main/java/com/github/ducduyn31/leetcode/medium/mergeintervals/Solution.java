package com.github.ducduyn31.leetcode.medium.mergeintervals;

import java.util.LinkedList;

public class Solution {

    public int[][] merge(int[][] intervals) {
        var minStart = Integer.MAX_VALUE;
        var maxStart = Integer.MIN_VALUE;

        for (var interval : intervals) {
            minStart = Math.min(interval[0], minStart);
            maxStart = Math.max(interval[0], maxStart);
        }

        var result = new LinkedList<int[]>();
        var intervalEnds = new int[maxStart - minStart + 1];

        for (var interval : intervals) {
            var index = interval[0] - minStart;
            intervalEnds[index] = Math.max(intervalEnds[index], interval[1]);
        }

        var lastStart = 0;
        var lastEnd = intervalEnds[0];
        for (var i = 0; i < intervalEnds.length; i++) {
            if (intervalEnds[i] == 0) continue;
            if (lastEnd >= i + minStart) {
                lastEnd = Math.max(lastEnd, intervalEnds[i]);
            } else {
                result.add(new int[] { lastStart + minStart, lastEnd });
                lastStart = i;
                lastEnd = intervalEnds[i];
            }
        }
        result.add(new int[] { lastStart + minStart, lastEnd });

        return result.toArray(new int[][]{});
    }
}
