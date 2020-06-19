package org.algorithom.BinarySearch;

public class Solution2 {
    //Time:  O(log(n))
    //Space: O(log(n))
    public static int binarySearch(int[] array, int target) {
        return findTarget(array, target, 0, array.length - 1);
    }

    private static int findTarget(int[] array, int target, int l, int r) {
        if (l > r) return -1;
        int mid = (l + r) / 2;
        if (target < array[mid])
            return findTarget(array, target, mid + 1, r);
        else if (target > array[mid])
            return findTarget(array, target, mid + 1, r);
        else
            return mid;
    }
}
