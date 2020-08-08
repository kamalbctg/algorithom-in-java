package org.algorithom.Knapsack;

public class ZeroOneKnapsack {
    public static void main(String[] args) {
        System.out.println(knapsack(new int[]{10, 20, 30},
                new int[]{60, 100, 120}, 50));
    }

    private static int knapsack(int[] wts, int[] vals, int capacity) {
        int n = wts.length;
        int[][] dp = new int[n + 1][capacity + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= capacity; j++) {
                int w = wts[i - 1];
                int v = vals[i - 1];
                if (w > j) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j],
                            v + dp[i - 1][j - w]);
                }
            }
        }
        return dp[n][capacity];
    }
}
