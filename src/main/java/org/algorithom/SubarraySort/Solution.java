package org.algorithom.SubarraySort;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.MIN_VALUE;

public class Solution {
    public static int[] subarraySort(int[] array) {
        int minOutOfOrder = MAX_VALUE;
        int maxOutOfOrder = MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            int num = array[i];
            if (isOutOfOrder(num, i, array)) {
                minOutOfOrder = Math.min(num, minOutOfOrder);
                maxOutOfOrder = Math.max(num, maxOutOfOrder);
            }
        }
        if (minOutOfOrder == MAX_VALUE || minOutOfOrder == MIN_VALUE) return new int[]{-1, -1};

        int left = 0;
        int right = array.length - 1;
        while (array[left] < minOutOfOrder) left++;
        while (array[right] > maxOutOfOrder) right--;
        return new int[]{left, right};
    }

    private static boolean isOutOfOrder(int num, int i, int[] array) {
        if (i == 0) return num > array[i + 1];
        if (i == array.length - 1) return num < array[i - 1];
        return num > array[i + 1] || num < array[i - 1];
    }
}
