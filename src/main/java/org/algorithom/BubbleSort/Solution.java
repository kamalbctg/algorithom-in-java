package org.algorithom.BubbleSort;

public class Solution {
    //Time:  Best: O(n), Avg: (n^2),  Worst:O(n^2)
    //Space: O(1)
    public static int[] bubbleSort(int[] array) {
        boolean isSorted = false;
        int counter = 0;

        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - counter - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                    isSorted = false;
                }
            }
            counter++;
        }
        return array;
    }
}
