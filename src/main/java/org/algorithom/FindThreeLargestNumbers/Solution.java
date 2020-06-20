package org.algorithom.FindThreeLargestNumbers;

import static java.lang.Integer.MIN_VALUE;

public class Solution {
    //Time: O(n)
    //Space: O(1)
    public static int[] findThreeLargestNumbers(int[] array) {
        int[] numbers = new int[]{MIN_VALUE, MIN_VALUE, MIN_VALUE};
        for (int num : array) {
            updateNumbersArray(num, numbers);
        }
        return numbers;
    }

    private static void updateNumbersArray(int num, int[] numbers) {
        if (num > numbers[2])
            shift(2, num, numbers);
        else if (num > numbers[1])
            shift(1, num, numbers);
        else if (num > numbers[0])
            shift(0, num, numbers);
    }

    private static void shift(int index, int num, int[] numbers) {
        for (int i = 0; i < index; i++) {
            numbers[i] = numbers[i + 1];
        }
        numbers[index] = num;
    }
}
