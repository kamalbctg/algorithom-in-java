package org.algorithom.Knapsack;

import java.util.Arrays;
import java.util.List;

public class Solution {
    static int[][] cache;

    public static List<List<Integer>> knapsack(int[][] items, int capacity) {
        cache = new int[items.length + 1][capacity + 1];
        for (int i = 0; i < items.length; i++) {
            Arrays.fill(cache[i], -1);
        }
        int profit = knapsackHelper(items, capacity, items.length);
        return null;
    }

    private static int knapsackHelper(int[][] items, int c, int n) {
        if (c == 0 || n == 0) return 0;
        int w = items[n - 1][1];
        int v = items[n - 1][0];
        if (cache[n][c] != -1)
            return cache[n][c];
        if (w > c) {
            return cache[n][c] = knapsackHelper(items, c, n - 1);
        } else {
            return cache[n][c] = Math.max(v + knapsackHelper(items, c - w, n - 1),
                    knapsackHelper(items, c, n - 1));
        }
    }
}
