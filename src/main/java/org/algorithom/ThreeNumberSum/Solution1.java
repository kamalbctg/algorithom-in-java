package org.algorithom.ThreeNumberSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution1 {
    // T: O(n^2) S: O(n)
    public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
        List<Integer[]> triplets = new ArrayList<>();
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            int left = i + 1;
            int right = array.length - 1;
            while (left < right) {
                int x = array[i];
                int y = array[left];
                int z = array[right];
                int sum = x + y + z;
                if (sum == targetSum) {
                    triplets.add(new Integer[]{x, y, z});
                    left++;
                    right--;
                } else if (sum < targetSum) {
                    left++;
                } else if (sum > targetSum) {
                    right--;
                }
            }
        }
        return triplets;
    }
}
