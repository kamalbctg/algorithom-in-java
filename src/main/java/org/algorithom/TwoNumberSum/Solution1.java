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
        for (var y : array) {
            var x = targetSum - y;
            if (hash.containsKey(x)) return new int[]{x, y};
            hash.put(y, true);
        }
        return new int[]{};
    }
}
