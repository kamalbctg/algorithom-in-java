package org.algorithom.NumberOfWaysToMakeChange;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void TestCase() {
        int[] input = {1, 5,10,25};
        Assert.assertTrue(Solution.numberOfWaysToMakeChange(10, input) == 4);
    }
    @Test
    public void TestCase1() {
        int[] input = {1, 5};
        Assert.assertTrue(Solution.numberOfWaysToMakeChange(6, input) == 2);
    }

    @Test
    public void TestCase2() {
        int[] input = {5};
        Assert.assertTrue(Solution.numberOfWaysToMakeChange(9, input) == 0);
    }

    @Test
    public void TestCase3() {
        int[] input = {2, 3, 4, 7};
        Assert.assertTrue(Solution.numberOfWaysToMakeChange(7, input) == 3);
    }

    @Test
    public void TestCase4() {
        int[] input = {2, 3, 5, 10};
        Assert.assertTrue(Solution.numberOfWaysToMakeChange(15, input) == 9);
    }

}