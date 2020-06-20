package org.algorithom.InsertionSort;

public class Solution {
    //Time:  Best: O(n), Avg: (n^2),  Worst:O(n^2)
    //Space: O(1)
    public static int[] insertionSort(int[] array) {

        for (int i = 1; i < array.length; i++) {
            int j = i;
            while (j > 0 && array[j] < array[j - 1]) {
                int tmp = array[j];
                array[j] = array[j - 1];
                array[j - 1] = tmp;
                j--;
            }
        }
        return array;
    }
}
