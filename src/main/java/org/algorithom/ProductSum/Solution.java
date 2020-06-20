package org.algorithom.ProductSum;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static int productSum(List<Object> array) {
        return productSum(array, 1);
    }

    private static int productSum(List<Object> array, int depth) {
        int sum = 0;
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) instanceof ArrayList) {
                sum += productSum((List<Object>) array.get(i), depth + 1);
            } else {
                sum += (int) array.get(i);
            }
        }
        return depth * sum;
    }


}
