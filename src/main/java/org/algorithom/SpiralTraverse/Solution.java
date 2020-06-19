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

        while (startRow <= endRow && startCol <= endCol) {
            for (int i = startCol; i <= endCol; i++) {
                result.add(array[startRow][i]);
            }

            for (int i = startRow + 1; i <= endRow; i++) {
                result.add(array[i][endCol]);
            }

            for (int i = endCol - 1; i >= startCol; i--) {
                result.add(array[endRow][i]);
            }

            for (int i = endRow - 1; i > startRow; i--) {
                result.add(array[i][startCol]);
            }
            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }
        return result;
    }
}
