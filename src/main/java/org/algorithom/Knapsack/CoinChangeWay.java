package org.algorithom.Knapsack;

public class CoinChangeWay {
    public static void main(String[] args) {
        System.out.println(maximumNumberOfWays(new int[]{1, 2, 3}, 4));
    }

    public static int maximumNumberOfWays(int[] denoms, int coins) {
        int n = denoms.length;
        int[][] dp = new int[n + 1][coins + 1];
        for (int i = 1; i <= n; i++) {
            dp[i][0] = 1;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= coins; j++) {
                int w = denoms[i - 1];
                if (w > j) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - w];
                }
            }
        }
        return dp[n][coins];
    }
}
