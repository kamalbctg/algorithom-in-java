package org.algorithom.Knapsack;

import java.util.stream.IntStream;

public class MinimumSubsetSum {
    public static void main(String[] args) {
        System.out.println(minSubSetSum(new int[]{1, 6, 11, 5}));
        //System.out.println(hasSubSet(new int[]{1, 1, 1, 1}));
    }

    public static int minSubSetSum(int[] numbers) {
        int sum = IntStream.of(numbers).sum();
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

        // min(s2-s1)
        // s2= sum - s1
        // min(sum - s1 - s1)
        int min = Integer.MAX_VALUE;
        for (int i = 0; i <= sum/2; i++){
            if(dp[n][i]){
                min = Math.min(min,sum - 2*i);
            }
        }

        return min;
    }
}
