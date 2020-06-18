package org.algorithom.FindThreeLargestNumbers;

public class Solution {
    //Time: O(n)
    //Space: O(1)
    public static int[] findThreeLargestNumbers(int[] array) {
        int[] numbers = new int[]{Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE};
        for (int i = 0; i < array.length; i++) {
            if (array[i] > numbers[2]) {
                shift(2, array[i], numbers);
            } else if (array[i] > numbers[1]) {
                shift(1, array[i], numbers);
            } else if (array[i] > numbers[0]) {
                shift(0, array[i], numbers);
            }
        }
        return numbers;
    }

    private static void shift(int position, int num, int[] numbers) {
        for (int i = 0; i <= position; i++) {
            if (i == position) {
                numbers[i] = num;
            } else {
                numbers[i] = numbers[i + 1];
            }
        }
    }
}
