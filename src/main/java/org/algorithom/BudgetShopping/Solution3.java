package org.algorithom.BudgetShopping;

public class Solution3 {
    public static int budgetShopping(int budget, int[] quantity, int[] price) {
        int n = price.length;
        int[][] dp = new int[n + 1][budget + 1];
        for (int i = 1; i <= n; i++) {
            int e = price[i - 1];
            int q = quantity[i - 1];
            for (int j = 0; j <= budget; j++) {
                if (e > j) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j],
                            q + dp[i][j - e]);
                }
            }
        }
        return dp[n][budget];
    }
}
