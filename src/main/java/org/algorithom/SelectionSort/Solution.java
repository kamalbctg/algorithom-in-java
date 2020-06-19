package org.algorithom.SelectionSort;

public class Solution {
    //Time:  Best: O(n), Avg: (n^2),  Worst:O(n^2)
    //Space: O(1)
    public static int[] selectionSort(int[] array) {
        int selectedIdx = 0;
        while (selectedIdx < array.length) {
            int smallestIdx = selectedIdx;
            for (int i = selectedIdx; i < array.length; i++) {
                if (array[i] < array[smallestIdx]) {
                    smallestIdx = i;
                }
            }
            int tmp = array[selectedIdx];
            array[selectedIdx] = array[smallestIdx];
            array[smallestIdx] = tmp;
            selectedIdx++;
        }
        return array;
    }
}
