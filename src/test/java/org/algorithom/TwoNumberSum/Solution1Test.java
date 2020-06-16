package org.algorithom.TwoNumberSum;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class Solution1Test extends TestCase {
    int[][] input = {
            {3, 5, -4, 8, 11, 1, -1, 6},
            {2, 7, 11, 15},
            {6, 4},
            {4, 6, 1},
            {4, 6, 1, -3},
            {1, 2, 3, 4, 5, 6, 7, 8, 9},
            {1, 2, 3, 4, 5, 6, 7, 8, 9, 15},
            {-7, -5, -3, -1, 0, 1, 3, 5, 7},
            {-21, 301, 12, 4, 65, 56, 210, 356, 9, -47},
            {-21, 301, 12, 4, 65, 56, 210, 356, 9, -47},
            {3, 5, -4, 8, 11, 1, -1, 6}};

    int[] sum = {10, 9, 10, 5, 3, 17, 18, -5, 163, 164, 15};


    int[][] expected = {
            {-1, 11},
            {2, 7},
            {4, 6},
            {1, 4},
            {-3, 6},
            {9, 8},
            {15, 3},
            {0, -5},
            {-47, 210},
            {},
            {}
    };

    @Test
    public void test1() {
        for (int i = 0; i < input.length; i++) {
            int[] actual = Solution1.twoNumberSum(input[i], sum[i]);
            Arrays.sort(actual);
            Arrays.sort(expected[i]);
            Assert.assertArrayEquals(expected[i], actual);
        }
    }
}