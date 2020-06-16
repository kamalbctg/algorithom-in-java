package org.algorithom.SmallestDifference;

import java.util.Arrays;

public class Solution {

    //T: O(nlon(n)+mlog(m))  S: O(1)
    public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
        int[] pair = new int[2];
        int smallest = Integer.MAX_VALUE;
        int difference = Integer.MAX_VALUE;

        Arrays.sort(arrayOne);
        Arrays.sort(arrayTwo);

        int firstArrayIdx = 0;
        int secondArrayIdx = 0;

        while (firstArrayIdx < arrayOne.length && secondArrayIdx < arrayTwo.length) {
            var firstNum = arrayOne[firstArrayIdx];
            var secondNum = arrayTwo[secondArrayIdx];

            if (firstNum < secondNum) {
                difference = secondNum - firstNum;
                firstArrayIdx++;
            } else if (firstNum > secondNum) {
                difference = firstNum - secondNum;
                secondArrayIdx++;
            } else {
                return new int[]{firstNum, secondNum};
            }

            if (smallest > difference) {
                smallest = difference;
                pair = new int[]{firstNum, secondNum};
            }

        }
        return pair;
    }
}
