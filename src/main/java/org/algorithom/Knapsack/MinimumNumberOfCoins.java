package org.algorithom.Knapsack;

public class MinimumNumberOfCoins {
    public static void main(String[] args) {
        System.out.println(minCoin(new int[]{25, 10, 5},30));
        System.out.println(minCoin(new int[]{9, 6, 5, 1},11));

    }

    private static int minCoin(int[] denoms, int v) {
        int n = denoms.length;
        int[][] dp = new int[n + 1][v + 1];
        for (int i = 1; i <= v; i++) {
            dp[0][i] = Integer.MAX_VALUE-1;
        }

        for (int i = 1; i <=v ; i++) {
            if(denoms[0] % i == 0){
                dp[1][i] = i/denoms[0];
            } else{
                dp[1][i]=Integer.MAX_VALUE-1;
            }
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= v; j++) {
                int w = denoms[i - 1];
                if (w > j) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    dp[i][j] = Math.min(dp[i - 1][j],1+ dp[i][j - w]);
                }
            }
        }
        return dp[n][v];
    }
}
