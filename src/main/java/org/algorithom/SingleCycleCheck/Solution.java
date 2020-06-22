package org.algorithom.SingleCycleCheck;

public class Solution {

    public static boolean hasSingleCycle(int[] array) {
        int visited = 0;
        int currentIdx = 0;
        while (visited < array.length) {
            if (visited > 0 && currentIdx == 0) return false; // visited > 0 but back to start point means multiple cycle
            visited++;
            currentIdx = getNext(array, currentIdx);
        }
        return currentIdx == 0;  // visited n but not back to start point means multiple cycle
    }

    private static int getNext(int[] array, int currentIdx) {
        int jump = array[currentIdx];
        int nextIndex = (currentIdx + jump) % array.length;
        return nextIndex >= 0 ? nextIndex : nextIndex + array.length;
    }
}
