package org.algorithom.SameBSTs;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static boolean sameBsts(List<Integer> arrayOne, List<Integer> arrayTwo) {
        if (arrayOne.size() != arrayTwo.size()) return false;
        if (arrayOne.size() == 0 && arrayTwo.size() == 0) return true;
        if (arrayOne.get(0) != arrayTwo.get(0)) return false;

        List<Integer> arrayOneLeftBsts = findLeftBsts(arrayOne);
        List<Integer> arrayTwoLeftBsts = findLeftBsts(arrayTwo);
        List<Integer> arrayOneRightBsts = findRightBsts(arrayOne);
        List<Integer> arrayTwoRightBsts = findRightBsts(arrayTwo);
        return sameBsts(arrayOneLeftBsts, arrayTwoLeftBsts) &&
                sameBsts(arrayOneRightBsts, arrayTwoRightBsts);
    }

    private static List<Integer> findLeftBsts(List<Integer> array) {
        List<Integer> bsts = new ArrayList<>();
        for (int i = 1; i < array.size(); i++) {
            if (array.get(i) < array.get(0)) {
                bsts.add(array.get(i));
            }
        }
        return bsts;
    }

    private static List<Integer> findRightBsts(List<Integer> array) {
        List<Integer> bsts = new ArrayList<>();
        for (int i = 1; i < array.size(); i++) {
            if (array.get(i) >= array.get(0)) {
                bsts.add(array.get(i));
            }
        }
        return bsts;
    }


}
