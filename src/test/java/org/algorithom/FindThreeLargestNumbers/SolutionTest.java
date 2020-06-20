package org.algorithom.FindThreeLargestNumbers;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void findThreeLargestNumbers() {
        Assert.assertArrayEquals( new int[]{10, 10, 12}, Solution.findThreeLargestNumbers(new int[]{10, 5, 9, 10, 12}));
        Assert.assertArrayEquals( new int[]{18, 141, 541}, Solution.findThreeLargestNumbers(new int[]{141, 1, 17, -7, -17, -27, 18, 541, 8, 7, 7}));
        Assert.assertArrayEquals( new int[]{7, 8, 55}, Solution.findThreeLargestNumbers(new int[]{55, 7, 8}));
        Assert.assertArrayEquals( new int[]{-2, -1, 7}, Solution.findThreeLargestNumbers(new int[]{-1, -2, -3, -7, -17, -27, -18, -541, -8, -7, 7}));
    }
}