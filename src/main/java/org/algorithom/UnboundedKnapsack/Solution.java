package org.algorithom.UnboundedKnapsack;

public class Solution {
    public static int unboundedKnapsack(int[] value, int[] weights, int weight) {
        int n = value.length;
        int[][] dp = new int[n + 1][weight + 1];
        for (int i = 1; i <= n; i++) {
            int w = weights[i - 1];
            int v = value[i - 1];
            for (int j = 0; j <= weight; j++) {
                if (w > j) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], v + dp[i][j - w]);
                }
            }
        }
        return dp[n][weight];
    }
}
