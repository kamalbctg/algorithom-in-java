package org.algorithom.MinNumberOfCoinsForChange;

import java.util.Arrays;

import static java.lang.Integer.MAX_VALUE;

public class Solution {
    public static int findMin(int sum, int[] coins) {
        int n = coins.length;
        int[][] dp = new int[n + 1][sum + 1];
        Arrays.fill(dp[0], Integer.MAX_VALUE);
        for (int i = 0; i <= n; i++) {
            dp[i][0] = 0;
        }

        for (int i = 1; i <= n; i++) {
            int c = coins[i - 1];
            for (int j = 0; j <= sum; j++) {
                if (c > j) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    dp[i][j] = Math.min(
                            dp[i - 1][j],
                            dp[i][j - c] == MAX_VALUE ? dp[i][j - c] : 1 + dp[i][j - c]);
                }
            }
        }
        return (dp[n][sum] == MAX_VALUE) ? -1 : dp[n][sum];
    }
}
