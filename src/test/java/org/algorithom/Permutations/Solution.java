package org.algorithom.Permutations;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<List<Integer>> getPermutations(List<Integer> array) {
        List<List<Integer>> permutations = new ArrayList<>();
        permutationHelper(0, array, permutations);
        return permutations;
    }

    private static void permutationHelper(int i, List<Integer> array, List<List<Integer>> permutations) {
        if (i == array.size() - 1) {
            permutations.add(new ArrayList<>(array));
        } else {
            for (int j = i; j < array.size(); j++) {
                swap(i, j, array);
                permutationHelper(i + 1, array, permutations);
                swap(i, j, array);
            }
        }
    }

    private static void swap(int i, int j, List<Integer> array) {
        Integer tmp = array.get(i);
        array.set(i, array.get(j));
        array.set(j, tmp);
    }
}
