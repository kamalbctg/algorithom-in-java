package org.algorithom.Powerset;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<List<Integer>> powerset(ArrayList<Integer> numbers) {
        List<List<Integer>> powerSet = new ArrayList<>();
        powerSet.add(new ArrayList<>());
        for (int num : numbers) {
            int len = powerSet.size();
            for (int i = 0; i < len; i++) {
                List<Integer> subSets = new ArrayList<>(powerSet.get(i));
                subSets.add(num);
                powerSet.add(subSets);
            }
        }
        return powerSet;
    }
}
