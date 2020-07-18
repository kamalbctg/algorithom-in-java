package org.algorithom.BudgetShopping;

import java.util.stream.IntStream;

public class Solution {
    public static int budgetShopping(int budget, int[] bundleQuantities, int[] bundleCosts) {
        return IntStream.range(0, bundleCosts.length).boxed()
                .mapToInt(i -> (int) Math.floor(budget / bundleCosts[i]) * bundleQuantities[i])
                .max().getAsInt();

    }
}
