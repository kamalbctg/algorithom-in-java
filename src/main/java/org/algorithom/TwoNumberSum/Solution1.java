package org.algorithom.TwoNumberSum;

import java.util.HashMap;

/**
 * Solution: Using hash function
 */
public class Solution1 {
    //T: O(n)
    //S: O(n)
    public static int[] twoNumberSum(int[] array, int targetSum) {
        HashMap<Integer, Boolean> hash = new HashMap<>();
        for (var num : array) {
            var x = targetSum - num;
            if (hash.containsKey(x)) return new int[]{x, num};
            hash.put(num, true);
        }
        return new int[]{};
    }
}
