package org.algorithom.SelectionSort;

public class Solution {
    //Time:  Best: O(n), Avg: (n^2),  Worst:O(n^2)
    //Space: O(1)
    public static int[] selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int smallest = i;
            for (int j = smallest + 1; j < array.length; j++) {
                if (array[j] < array[smallest]) {
                    smallest = j;
                }
            }
            int tmp = array[i];
            array[i] = array[smallest];
            array[smallest] = tmp;
        }
        return array;
    }
}
