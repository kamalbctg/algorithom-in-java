package org.algorithom.MinNumberOfCoinsForChange;

import java.util.Arrays;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Math.min;

public class Solution2 {
    //T: O(nd), S: O(n)
    public static int minNumberOfCoinsForChange(int n, int[] denoms) {
        int[] distributions = new int[n + 1];
        Arrays.fill(distributions, MAX_VALUE);
        distributions[0] = 0;
        for (int denom : denoms) {
            for (int amount = 0; amount < distributions.length; amount++) {
                if (denom <= amount) {
                    distributions[amount] =
                            min(distributions[amount],
                                    (distributions[amount - denom] == MAX_VALUE) ? distributions[amount - denom] : 1 + distributions[amount - denom]);
                }
            }
        }
        return (distributions[n] == MAX_VALUE) ? -1 : distributions[n];
    }
}
