package org.algorithom.SpiralTraverse;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    //Time : O(n) Space:O(n)
    public static List<Integer> spiralTraverse(int[][] array) {
        List<Integer> result = new ArrayList<>();

        int startRow = 0;
        int endRow = array.length - 1;
        int startCol = 0;
        int endCol = array[0].length - 1;
        while (startRow < endRow && startCol < endCol) {
            for (int col = startCol; col <= endCol; col++) {
                result.add(array[startRow][col]);
            }

            for (int row = startRow + 1; row <= endRow; row++) {
                result.add(array[row][endCol]);
            }

            for (int col = endCol - 1; col >= startCol; col--) {
                result.add(array[endRow][col]);
            }

            for (int row = endCol - 1; row > startRow; row--) {
                result.add(array[row][startCol]);
            }

            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }
        return result;
    }
}
