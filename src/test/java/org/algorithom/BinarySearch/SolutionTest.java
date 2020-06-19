package org.algorithom.BinarySearch;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void TestCase1() {
        Assert.assertTrue(Solution.binarySearch(new int[] {0, 1, 21, 33, 45, 45, 61, 71, 72, 73}, 33) == 3);
        Assert.assertTrue(Solution.binarySearch(new int[] {1, 5, 23, 111}, 111) == 3);
        Assert.assertTrue(Solution.binarySearch(new int[] {1, 5, 23, 111}, 1) == 0);
    }
}