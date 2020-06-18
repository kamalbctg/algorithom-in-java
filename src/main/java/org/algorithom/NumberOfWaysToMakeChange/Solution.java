package org.algorithom.NumberOfWaysToMakeChange;

public class Solution {
    //T: O(nd), S: O(n)
    public static int numberOfWaysToMakeChange(int n, int[] denoms) {
        int[] distributions = new int[n + 1];
        distributions[0] = 1;
        for (int denom : denoms) {
            for (int amount = 0; amount < distributions.length; amount++) {
                if (denom <= amount) {
                    distributions[amount] += distributions[amount - denom];
                }
            }
        }
        return distributions[n];
    }
}
