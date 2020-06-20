package org.algorithom.MaxSubsetSumNoAdjacent;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void TestCase1() {
        int[] input = {75, 105, 120, 75, 90, 135};
        Assert.assertTrue(Solution.maxSubsetSumNoAdjacent(input) == 330);
    }

    @Test
    public void TestCase2() {
        int[] input = {};
        Assert.assertTrue(Solution.maxSubsetSumNoAdjacent(input) == 0);
    }

    @Test
    public void TestCase3() {
        int[] input = {7, 10, 12, 7, 9, 14};
        Assert.assertTrue(Solution.maxSubsetSumNoAdjacent(input) == 33);
    }

    @Test
    public void TestCase4() {
        int[] input = {5, 1, 1, 5};
        Assert.assertTrue(Solution.maxSubsetSumNoAdjacent(input) == 10);
    }

    @Test
    public void TestCase5() {
        int[] input = {5, 1};
        Assert.assertTrue(Solution.maxSubsetSumNoAdjacent(input) == 5);
    }
    @Test
    public void TestCase6() {
        int[] input = {1};
        Assert.assertTrue(Solution.maxSubsetSumNoAdjacent(input) == 1);
    }

}