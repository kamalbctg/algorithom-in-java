package org.algorithom.NthFibonacci;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static int getNthFib(int n) {
        Map<Integer, Integer> cache = new HashMap<>();
        cache.put(1, 0);
        cache.put(2, 1);
        return findFib(n, cache);

    }

    private static int findFib(int n, Map<Integer, Integer> cache) {
        if (!cache.containsKey(n)) {
            cache.put(n, findFib(n - 1, cache) + findFib(n - 2, cache));
        }
        return cache.get(n);
    }


}
