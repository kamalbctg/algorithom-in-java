package org.algorithom.SameBSTs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.MIN_VALUE;

public class Solution2 {
    //    @Test
//    public void TestCase4() {
//    1, 2, 3, 4, 5, 6, 7, 8));
//    1, 2, 3, 4, 5, 6, 7));
//        Assert.assertTrue(Solution2.sameBsts(arrayOne, arrayTwo) == true);
//    }
    public static boolean sameBsts(List<Integer> arrayOne, List<Integer> arrayTwo) {
        return sameBsts(arrayOne, arrayTwo, 0, 0, MIN_VALUE, MAX_VALUE);
    }

    private static boolean sameBsts(List<Integer> arrayOne,
                                    List<Integer> arrayTwo,
                                    int rootIdxArrayOne, int rootIdxArrayTwo,
                                    int min, int max) {
        if (rootIdxArrayOne == -1 || rootIdxArrayTwo == -1) return rootIdxArrayOne == rootIdxArrayTwo;
        if (arrayOne.get(rootIdxArrayOne).intValue() != arrayTwo.get(rootIdxArrayTwo).intValue()) return false;

        int current = arrayOne.get(rootIdxArrayOne).intValue();

        int leftRootIdxArrayOne = getLeftRootIdx(arrayOne, rootIdxArrayOne, min);
        int leftRootIdxArrayTwo = getLeftRootIdx(arrayTwo, rootIdxArrayTwo, min);
        int rightRootIdxArrayOne = getRightRootIdx(arrayOne, rootIdxArrayOne, max);
        int rightRootIdxArrayTwo = getRightRootIdx(arrayTwo, rootIdxArrayTwo, max);
        return sameBsts(arrayOne, arrayTwo, leftRootIdxArrayOne, leftRootIdxArrayTwo, min, current) &&
                sameBsts(arrayOne, arrayTwo, rightRootIdxArrayOne, rightRootIdxArrayTwo, current, max);
    }

    private static int getLeftRootIdx(List<Integer> array, int rootIdx, int min) {
        for (int i = rootIdx + 1; i < array.size(); i++) {
            if (array.get(i).intValue() < array.get(rootIdx).intValue() && array.get(i).intValue() >= min) {
                return i;
            }
        }
        return -1;
    }

    private static int getRightRootIdx(List<Integer> array, int rootIdx, int max) {
        for (int i = rootIdx + 1; i < array.size(); i++) {
            if (array.get(i).intValue() >= array.get(rootIdx).intValue() && array.get(i).intValue() < max) {
                return i;
            }
        }
        return -1;
    }

}
