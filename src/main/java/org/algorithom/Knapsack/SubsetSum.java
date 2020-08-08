package org.algorithom.Knapsack;

public class SubsetSum {
    public static void main(String[] args) {
        System.out.println(hasSubSet(new int[]{3, 34, 4, 12, 5, 2},9));
        System.out.println(hasSubSet(new int[]{3, 34, 4, 12, 5, 2},30));
    }

    public static boolean hasSubSet(int[] numbers, int sum) {
        int n = numbers.length;
        boolean[][] dp = new boolean[n + 1][sum + 1];
        for (int i = 0; i <= n; i++) {
            dp[i][0] = true;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sum; j++) {
                int num = numbers[i - 1];
                if (num > j) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j] || dp[i-1][j - num];
                }
            }
        }
        return dp[n][sum];
    }
}
