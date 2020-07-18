package org.algorithom.MinNumberOfCoinsForChange;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void TestCase1() {
        int[] input = {1, 2, 4};
        Assert.assertTrue(Solution2.minNumberOfCoinsForChange(6, input) == 2);
    }

    @Test
    public void TestCase2() {
        int[] input = {2, 4};
        Assert.assertTrue(Solution2.minNumberOfCoinsForChange(7, input) == -1);
    }

    @Test
    public void TestCase4() {
        int[] input = {2, 4};
        Assert.assertTrue(Solution2.minNumberOfCoinsForChange(6, input) == 2);
    }

    @Test
    public void TestCase3() {
        int[] input = {39, 45, 130, 40, 4, 1, 60, 75};
        Assert.assertTrue(Solution2.minNumberOfCoinsForChange(135, input) == 2);
    }
}