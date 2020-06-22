package org.algorithom.SingleCycleCheck;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void TestCase1() {
        Assert.assertTrue(Solution.hasSingleCycle(new int[] {2, 3, 1, -4, -4, 2}));
        Assert.assertTrue(Solution.hasSingleCycle(new int[] {1, 2, 3, 4, -2, 3, 7, 8, -26}));
        Assert.assertTrue(Solution.hasSingleCycle(new int[] {-1, 2, 2}));
        Assert.assertFalse(Solution.hasSingleCycle(new int[] {1, -1, 1, -1}));
        Assert.assertFalse(Solution.hasSingleCycle(new int[] {1, 1, 0, 1, 1}));
        Assert.assertFalse(Solution.hasSingleCycle(new int[] {10, 11, -6, -23, -2, 3, 88, 909, -26}));
    }
}