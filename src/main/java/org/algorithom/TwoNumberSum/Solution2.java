package org.algorithom.TwoNumberSum;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Solution: Using two pointer sliding window technique
 */
public class Solution2 {
    //T: O(nlog(n))
    //S: O(1)
    public static int[] twoNumberSum(int[] array, int targetSum) {
        HashMap<Integer, Boolean> hash = new HashMap<>();
        Arrays.sort(array);         // log(n)
        int left = 0;
        int right = array.length - 1;
        while (left < right) {      // n
            int x = array[left];
            int y = array[right];
            int s = x + y;
            if (s == targetSum) {
                return new int[]{x, y};
            } else if (s < targetSum) {
                left++;
            } else if (s > targetSum) {
                right--;
            }
        }
        return new int[]{};
    }
}
