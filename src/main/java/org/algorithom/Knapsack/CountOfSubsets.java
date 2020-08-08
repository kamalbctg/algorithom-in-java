package org.algorithom.Knapsack;

public class CountOfSubsets {
    public static void main(String[] args) {
        System.out.println(countSubSet(new int[]{1, 2, 3, 3},6));
        System.out.println(countSubSet(new int[]{1, 1, 1, 1},1));
    }

    public static int countSubSet(int[] numbers, int sum) {
        int n = numbers.length;
        int[][] dp = new int[n + 1][sum + 1];
        for (int i = 0; i <= n; i++) {
            dp[i][0] = 1;
        }
//        for (int i = 1; i <= sum; i++) {
//            dp[0][i] = 1;
//        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sum; j++) {
                int num = numbers[i - 1];
                if (num > j) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j] + dp[i-1][j - num];
                }
            }
        }
        return dp[n][sum];
    }
}
