package org.algorithom.KadanesAlgorithm;

public class Solution {
    public static int kadanesAlgorithm(int[] array) {
        int max = array[0];
        int maxSoFar = array[0];
        for (int i = 1; i < array.length; i++) {
            maxSoFar = Math.max(maxSoFar + array[i], array[i]);
            max = Math.max(maxSoFar, max);
        }
        return max;
    }
}
