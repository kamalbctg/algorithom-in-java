package org.algorithom.SingleCycleCheck;

public class Solution {

    public static boolean hasSingleCycle(int[] array) {
        int visited = 0;
        int index = 0;
        while (visited < array.length) {
            if (visited > 0 && index == 0) return false; // get index 0 before finishing visiting all elements
            index = nextIndex(array, index);
            visited++;
        }
        return index == 0; //should return to zero after visiting all elements
    }

    private static int nextIndex(int[] array, int index) {
        int nextIndex = (array[index] + index) % array.length;
        return (nextIndex < 0) ? array.length + nextIndex : nextIndex;
    }


}
