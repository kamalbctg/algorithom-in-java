package org.algorithom.MoveElementToEnd;

import java.util.List;

public class Solution {
    //T: O(n), S: O(1)
    public static List<Integer> moveElementToEnd(List<Integer> array, int target) {
        int left = 0;
        int right = array.size() - 1;
        while (left < right) {
            if (array.get(left) == target) {
                while (left < right && array.get(right) == target) right--;
                int tmp = array.get(left);
                array.set(left, array.get(right));
                array.set(right, tmp);
            }
            left++;
        }
        return array;
    }
}
