package org.algorithom.Knapsack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution2 {

    public static List<List<Integer>> knapsack(int[][] items, int capacity) {
        int[][] knapsack = new int[items.length + 1][capacity + 1];
        for (int n = 1; n < knapsack.length; n++) {
            int w = items[n - 1][1];
            int v = items[n - 1][0];
            for (int c = 0; c < knapsack[0].length; c++) {
                if (w > c) {
                    knapsack[n][c] = knapsack[n - 1][c];
                } else {
                    knapsack[n][c] = Math.max(v + knapsack[n - 1][c - w],
                            knapsack[n - 1][c]);
                }
            }
        }

        int r = knapsack.length - 1;
        int c = knapsack[0].length - 1;
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>(Arrays.asList(knapsack[r][c])));
        result.add(new ArrayList<>());
        while (r > 0) {
            if (c == 0) break;
            if (knapsack[r][c] == knapsack[r - 1][c]) {
                r--;
            } else {
                int itemIdx = r - 1;
                result.get(1).add(0, itemIdx);
                c -= items[itemIdx][1];
            }
        }
        return result;
    }
}
