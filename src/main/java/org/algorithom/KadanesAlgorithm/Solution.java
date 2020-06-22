package org.algorithom.KadanesAlgorithm;

public class Solution {
    public static int kadanesAlgorithm(int[] array) {
        int maxSoFar = array[0];
        int maxEndHere = array[0];
        for (int i = 1; i < array.length; i++) {
            maxEndHere = Math.max(maxEndHere + array[i], array[i]);
            maxSoFar = Math.max(maxEndHere, maxSoFar);
        }
        return maxSoFar;
    }
}
