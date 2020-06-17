package org.algorithom.LongestPeak;

public class Solution {
    public static int longestPeak(int[] array) {
        int longestPeak = 0;
        int i = 1;
        while (i < array.length -1) {

            boolean hasPeak = (array[i - 1] < array[i]) && (array[i] > array[i + 1]);
            if (!hasPeak) {
                i++;
                continue;
            }
            int l = i - 2;
            int r = i + 2;
            while (l >= 0 && array[l] < array[l+1])
                l--;
            while (r < array.length && array[r] < array[r-1])
                r++;
            int currentPeak = r - l - 1;
            if (longestPeak < currentPeak) {
                longestPeak = currentPeak;
            }
            i = r;
        }
        return longestPeak;
    }
}
