package org.algorithom.KadanesAlgorithm;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void TestCase1() {
        int[] input = {3, 5, -9, 1, 3, -2, 3, 4, 7, 2, -9, 6, 3, 1, -5, 4};
        Assert.assertTrue(Solution.kadanesAlgorithm(input) == 19);
    }

    @Test
    public void TestCase2() {
        int[] input = {-2, -1};
        Assert.assertTrue(Solution.kadanesAlgorithm(input) == -1);
    }

    @Test
    public void TestCase3() {
        int[] input = {-2, 1};
        Assert.assertTrue(Solution.kadanesAlgorithm(input) == 1);
    }

    @Test
    public void TestCase4() {
        int[] input = {-1000, -1000, 2, 4, -5, -6, -7, -8, -2, -100};
        Assert.assertTrue(Solution.kadanesAlgorithm(input) == 6);
    }

}