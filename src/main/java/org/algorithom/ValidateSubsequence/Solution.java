package org.algorithom.ValidateSubsequence;

import java.util.List;

public class Solution {
    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        int matchCounter = 0;
        for (var ele : array) {
            if (sequence.size() == matchCounter) break;
            if (sequence.get(matchCounter) == ele) matchCounter++;
        }
        return sequence.size() == matchCounter;
    }
}
