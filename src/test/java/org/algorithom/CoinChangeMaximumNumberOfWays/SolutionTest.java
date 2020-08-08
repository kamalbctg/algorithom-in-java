package org.algorithom.CoinChangeMaximumNumberOfWays;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test() {
        Assert.assertTrue(Solution.findWays(new int[]{1,2,3},5)==5);
    }
}