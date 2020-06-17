package org.algorithom.MonotonicArray;

public class Solution {
    //Time: O(n) Space: O(1)
    public static boolean isMonotonic(int[] array) {
        boolean isNonIncreasing = true;
        boolean isNonDecreasing = true;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1])
                isNonDecreasing = false;
            if (array[i] > array[i - 1])
                isNonIncreasing = false;
        }
        return isNonDecreasing || isNonIncreasing;
    }
}
