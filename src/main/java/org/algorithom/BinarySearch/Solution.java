package org.algorithom.BinarySearch;

public class Solution {
    //Time:  O(log(n))
    //Space: O(1)
    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length;
        while (left < right) {
            int mid = (left + right) / 2;
            if (target < array[mid]) {
                right = mid - 1;
            } else if (target > array[mid]) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
