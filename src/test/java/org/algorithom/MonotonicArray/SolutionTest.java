package org.algorithom.MonotonicArray;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void TestCase1() {
        var array = new int[]{-1, -5, -10, -1100, -1100, -1101, -1102, -9001};
        var expected = true;
        var actual = Solution.isMonotonic(array);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void TestCase2() {
        var array = new int[]{};
        var expected = true;
        var actual = Solution.isMonotonic(array);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void TestCase3() {
        var array = new int[]{-1, -1, -2, -3, -4, -5, -5, -5, -6, -7, -8, -7, -9, -10, -11};
        var expected = false;
        var actual = Solution.isMonotonic(array);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void TestCase4() {
        var array = new int[]{2, 1};
        var expected = true;
        var actual = Solution.isMonotonic(array);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void TestCase5() {
        var array = new int[]{2, 1, 2};
        var expected = false;
        var actual = Solution.isMonotonic(array);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void TestCase6() {
        var array = new int[]{1, 1, 1, 2, 3, 4, 1, 4, 5};
        var expected = false;
        var actual = Solution.isMonotonic(array);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void TestCase7() {
        var array = new int[]{-1, -1, -1, -1, -1, -1, -1, -1};
        var expected = true;
        var actual = Solution.isMonotonic(array);
        Assert.assertEquals(expected, actual);
    }

}