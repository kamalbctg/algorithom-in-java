package org.algorithom.SmallestDifference;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class SolutionTest {
    @Test
    public void testCase1() {
        int[] expected = {28, 26};
        Assert.assertTrue(
                Arrays.equals(
                        Solution.smallestDifference(
                                new int[]{-1, 5, 10, 20, 28, 3}, new int[]{26, 134, 135, 15, 17}),
                        expected));
    }

    @Test
    public void testCase2() {
        int[] expected = {530, 530};
        Assert.assertTrue(
                Arrays.equals(
                        Solution.smallestDifference(
                                new int[]{10, 1000, 9124, 2142, 59, 24, 596, 591, 124, -123, 530}, new int[]{-1441, -124, -25, 1014, 1500, 660, 410, 245, 530}),
                        expected));
    }

    @Test
    public void TestCase3() {
        int[] expected = {1000, 1014};
        Assert.assertTrue(
                Arrays.equals(
                        Solution.smallestDifference(
                                new int[]{10, 1000},
                                new int[]{-1441, -124, -25, 1014, 1500, 660, 410, 245, 530}),
                        expected));
    }

    @Test
    public void TestCase4() {
        int[] expected = {20, 21};
        Assert.assertTrue(
                Arrays.equals(
                        Solution.smallestDifference(
                                new int[]{0, 20},
                                new int[]{21, -2}),
                        expected));
    }
}