package org.algorithom.SmallestDifference;

import java.util.Arrays;

public class Solution {

    //T: O(nlog(n) + mlog(m)), S: O(1)
    public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
        int[] pair = new int[2];
        Arrays.sort(arrayOne);
        Arrays.sort(arrayTwo);
        int i = 0;
        int j = 0;
        int smallest = Integer.MAX_VALUE;
        int difference = Integer.MAX_VALUE;
        while (i < arrayOne.length && j < arrayTwo.length) {
            int x = arrayOne[i];
            int y = arrayTwo[j];
            if (x < y) {
                difference = y - x;
                i++;
            } else if (x > y) {
                difference = x - y;
                j++;
            } else {
                return new int[]{x, y};
            }
            if (difference < smallest) {
                smallest = difference;
                pair = new int[]{x, y};
            }
        }
        return pair;
    }
}
