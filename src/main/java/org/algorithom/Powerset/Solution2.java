package org.algorithom.Powerset;

import java.util.ArrayList;
import java.util.List;

public class Solution2 {
    public static List<List<Integer>> powerset(ArrayList<Integer> numbers) {
        return powerset(numbers, numbers.size() - 1);
    }

    private static List<List<Integer>> powerset(ArrayList<Integer> numbers, int idx) {
        if (idx < 0) {
            List<List<Integer>> initSet = new ArrayList<>();
            initSet.add(new ArrayList<>());
            return initSet;
        }
        List<List<Integer>> powerSet = powerset(numbers, idx - 1);
        int num = numbers.get(idx);
        int len = powerSet.size();
        for (int i = 0; i < len; i++) {
            List<Integer> subSets = new ArrayList<>(powerSet.get(i));
            subSets.add(num);
            powerSet.add(subSets);
        }
        return powerSet;
    }
}
