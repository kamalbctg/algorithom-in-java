package org.algorithom.Knapsack;

public class KnapsackDP {
    public static void main(String[] args) {
        int val[] = new int[]{60, 100, 120};
        int wt[] = new int[]{10, 20, 30};
        int W = 50;
        int n = val.length;
        System.out.println(knapSack(W, wt, val, n));
    }

    private static int knapSack(int w, int[] wt, int[] val, int n) {
        int[][] dp = new int[n + 1][w + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= w; j++) {
                int weight = wt[i-1];
                int v = val[i-1];
                if(weight > j){
                    dp[i][j] = dp[i-1][j];
                }else {
                    dp[i][j] = Math.max(dp[i-1][j],
                            v + dp[i][j-weight]);
                }
            }
        }

        return dp[n][w];
    }
}
