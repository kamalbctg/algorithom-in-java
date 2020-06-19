package org.algorithom.SpiralTraverse;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void TestCase1() {
        var input =
                new int[][] {
                        {1, 2, 3, 4},
                        {12, 13, 14, 5},
                        {11, 16, 15, 6},
                        {10, 9, 8, 7},
                };
        var expected = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16);
        var actual = Solution.spiralTraverse(input);
        Assert.assertTrue(expected.equals(actual));
    }
}