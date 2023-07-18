package com.github.ducduyn31.leetcode.medium.coinchange;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public int coinChange(int[] coins, int amount) {
        if (amount == 0) return 0;
        Arrays.sort(coins);
        var coinChangeOfAmount = new int[amount + 1];

        for (var subAmount = 0; subAmount <= amount; subAmount++) {
            var candidateCoins = new ArrayList<Integer>();

            for (var coinValue : coins) {
                if (subAmount == coinValue) {
                    candidateCoins.add(1);
                    break;
                }

                if (subAmount < coinValue) continue;

                if (coinChangeOfAmount[subAmount - coinValue] != -1)
                    candidateCoins.add(coinChangeOfAmount[subAmount - coinValue] + 1);
            }

            coinChangeOfAmount[subAmount] = !candidateCoins.isEmpty() ? Collections.min(candidateCoins) : -1;
        }

        return coinChangeOfAmount[amount];
    }
}
