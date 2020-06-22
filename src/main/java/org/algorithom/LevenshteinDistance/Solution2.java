package org.algorithom.LevenshteinDistance;

public class Solution2 {
    public static int levenshteinDistance(String str1, String str2) {
        String small = (str1.length() < str2.length()) ? str1 : str2;
        String big = (str1.length() >= str2.length()) ? str1 : str2;

        int[] evenEditDistances = new int[big.length() + 1];
        int[] oddEditDistances = new int[big.length() + 1];

        for (int i = 0; i < big.length() + 1; i++) {
            evenEditDistances[i] = i;
        }

        int[] currentEdits;
        int[] previousEdits;
        for (int i = 1; i < small.length() + 1; i++) {
            if (i % 2 == 0) {
                currentEdits = evenEditDistances;
                previousEdits = oddEditDistances;
            } else {
                currentEdits = oddEditDistances;
                previousEdits = evenEditDistances;
            }
            currentEdits[0] = i;
            for (int j = 1; j < big.length() + 1; j++) {
                if (small.charAt(i - 1) == big.charAt(j - 1)) {
                    currentEdits[j] = previousEdits[j - 1];
                } else {
                    currentEdits[j] = 1 + min(previousEdits[j - 1], previousEdits[j], currentEdits[j - 1]);
                }
            }
        }
        return small.length() % 2 == 0 ? evenEditDistances[big.length()] : oddEditDistances[big.length()];
    }

    private static int min(int i, int j, int k) {
        return Math.min(i, Math.min(j, k));
    }
}
