package org.algorithom.TwoNumberSum;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Solution: Using two pointer sliding window technique
 */
public class Solution2 {
    //T: O(n)
    //S: O(1)
    public static int[] twoNumberSum(int[] array, int targetSum) {
        HashMap<Integer, Boolean> hash = new HashMap<>();
        Arrays.sort(array);
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            int sum = array[left] + array[right];

            if (sum == targetSum) {
                return new int[]{array[left], array[right]};
            } else if (sum < targetSum) {
                left++;
            } else if (sum > targetSum) {
                right--;
            }

        }
        return new int[]{};
    }
}
