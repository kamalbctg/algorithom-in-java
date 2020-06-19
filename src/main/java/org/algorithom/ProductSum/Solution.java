package org.algorithom.ProductSum;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static int productSum(List<Object> array) {
        return productSum(array, 1);
    }

    private static int productSum(List<Object> array, int depth) {
        int sun = 0;
        for (var ele : array) {
            if (ele instanceof ArrayList) {
                sun += productSum((ArrayList) ele, depth + 1);
            } else {
                sun += (int) ele;
            }
        }
        return depth * sun;
    }
}
