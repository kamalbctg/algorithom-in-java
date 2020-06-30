package FourNumberSum;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {
    public static List<Integer[]> fourNumberSum(int[] numbers, int sum) {
        List<Integer[]> quadruplets = new ArrayList<>();
        HashMap<Integer, List<Integer[]>> pairs = new HashMap<>();
        for (int i = 1; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int diff = sum - (numbers[i] + numbers[j]);
                if (pairs.containsKey(diff)) {
                    for (Integer[] pair : pairs.get(diff)) {
                        quadruplets.add(new Integer[]{pair[0], pair[1],
                                numbers[i], numbers[j]});
                    }
                }
            }

            for (int k = 0; k < i; k++) {
                int tmp = numbers[i] + numbers[k];
                if (pairs.containsKey(tmp)) {
                    pairs.get(tmp).add(new Integer[]{numbers[i] + numbers[k]});
                } else {
                    List<Integer[]> pair = new ArrayList<>();
                    pair.add(new Integer[]{numbers[k], numbers[i]});
                    pairs.put(tmp, pair);
                }
            }
        }

        return quadruplets;
    }
}
