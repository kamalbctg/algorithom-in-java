package org.algorithom.MaxSubsetSumNoAdjacent;

public class Solution {
    //Time: O(n)
    //Space: O(1)
    public static int maxSubsetSumNoAdjacent(int[] array) {
        int inclusive = 0;
        int exclusive = 0;
        for (int i = 0; i < array.length; i++) {
            int tmp = inclusive;
            inclusive = Math.max(inclusive, exclusive + array[i]);
            exclusive = tmp;
        }
        return Math.max(inclusive, exclusive);
    }
}
