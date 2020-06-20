package org.algorithom.BinarySearch;

public class Solution2 {
    //Time:  O(log(n))
    //Space: O(log(n))
    public static int binarySearch(int[] array, int target) {
        return findTarget(array, target, 0, array.length);
    }

    private static int findTarget(int[] array, int target, int left, int right) {
        if (left > right) return -1;

        int mid = (left + right) / 2;

        if (target < array[mid])
            return findTarget(array, target, left, mid - 1);
        else if (target > array[mid])
            return findTarget(array, target, mid + 1, right);
        else {
            return mid;
        }
    }

}
