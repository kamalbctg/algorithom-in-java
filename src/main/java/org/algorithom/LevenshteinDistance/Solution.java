package org.algorithom.LevenshteinDistance;

public class Solution {
    public static int levenshteinDistance(String str1, String str2) {
        int[][] editDistance = new int[str1.length() + 1][str2.length() + 1];
        for (int i = 0; i < str1.length() + 1; i++) {
            for (int j = 0; i == 0 && j < str2.length() + 1; j++) {
                editDistance[i][j] = j;
            }
            editDistance[i][0] = i;
        }
        for (int i = 1; i < str1.length() + 1; i++) {
            for (int j = 1; j < str2.length() + 1; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    editDistance[i][j] = editDistance[i - 1][j - 1];
                } else {
                    editDistance[i][j] = 1 + min(editDistance[i - 1][j], editDistance[i - 1][j - 1], editDistance[i][j - 1]);
                }
            }
        }
        return editDistance[str1.length()][str2.length()];
    }

    private static int min(int i, int j, int k) {
        return Math.min(i, Math.min(j, k));
    }
}
