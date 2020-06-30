package org.algorithom.SubarraySort;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void TestCase1() {
        int[] expected = {3, 9};
        Assert.assertTrue(
                Arrays.equals(
                        Solution.subarraySort(new int[]{1, 2, 4, 7, 10, 11, 7, 12, 6, 7, 16, 18, 19}),
                        expected));
    }

    @Test
    public void TestCase2() {
        int[] expected = {-1, -1};
        Assert.assertTrue(
                Arrays.equals(
                        Solution.subarraySort(new int[]{1, 2}),
                        expected));
    }

    @Test
    public void TestCase2_2() {
        int[] expected = {0, 1};
        Assert.assertTrue(
                Arrays.equals(
                        Solution.subarraySort(new int[]{2, 1}),
                        expected));
    }

    @Test
    public void TestCase3() {
        int[] expected = {-1,-1};
        Assert.assertTrue(
                Arrays.equals(
                        Solution.subarraySort(new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19, 20}),
                        expected));
    }
    @Test
    public void TestCase4() {
        int[] expected = {2,4};
        Assert.assertTrue(
                Arrays.equals(
                        Solution.subarraySort(new int[]{1, 2, 8, 4, 5}),
                        expected));
    }

    @Test
    public void TestCase6() {
        int[] expected = {-1,-1};
        Assert.assertTrue(
                Arrays.equals(
                        Solution.subarraySort(new int[]{0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89}),
                        expected));
    }@Test
    public void TestCase7() {
        int[] expected = {0, 12};
        Assert.assertTrue(
                Arrays.equals(
                        Solution.subarraySort(new int[]{4, 8, 7, 12, 11, 9, -1, 3, 9, 16, -15, 51, 7}),
                        expected));
    }
}