package org.algorithom.NthFibonacci;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void getNthFib() {
        Assert.assertEquals(0, Solution.getNthFib(1));
        Assert.assertEquals(1, Solution.getNthFib(2));
        Assert.assertEquals(1, Solution.getNthFib(3));
        Assert.assertEquals(2, Solution.getNthFib(4));
        Assert.assertEquals(3, Solution.getNthFib(5));
        Assert.assertEquals(5, Solution.getNthFib(6));
        Assert.assertEquals(987, Solution.getNthFib(17));
        Assert.assertEquals(1597, Solution.getNthFib(18));
    }

    @Test
    public void getNthFib2() {
        Assert.assertEquals(0, Solution2.getNthFib(1));
        Assert.assertEquals(1, Solution2.getNthFib(2));
        Assert.assertEquals(1, Solution2.getNthFib(3));
        Assert.assertEquals(2, Solution2.getNthFib(4));
        Assert.assertEquals(3, Solution2.getNthFib(5));
        Assert.assertEquals(5, Solution2.getNthFib(6));
        Assert.assertEquals(987, Solution2.getNthFib(17));
        Assert.assertEquals(1597, Solution2.getNthFib(18));
    }
}