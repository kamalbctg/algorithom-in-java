package org.algorithom.SmallestDifference;

import java.util.Arrays;

public class Solution {

    //T: O(nlog(n) + mlog(m)), S: O(1)
    public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
        int[] pair = new int[2];
        int left = 0;
        int right = 0;
        int diff = Integer.MAX_VALUE;
        int smallest = Integer.MAX_VALUE;
        Arrays.sort(arrayOne);
        Arrays.sort(arrayTwo);
        while (left < arrayOne.length && right < arrayTwo.length) {
            int x = arrayOne[left];
            int y = arrayTwo[right];
            if (x < y) {
                diff = y - x;
                left++;
            } else if (x > y) {
                diff = x - y;
                right++;
            } else {
                return new int[]{x, y};
            }

            if (smallest > diff) {
                smallest = diff;
                pair = new int[]{x, y};
            }
        }
        return pair;
    }
}
