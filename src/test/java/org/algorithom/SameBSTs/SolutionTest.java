package org.algorithom.SameBSTs;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void TestCase1() {
        List<Integer> arrayOne = new ArrayList<Integer>(Arrays.asList(10, 15, 8, 12, 94, 81, 5, 2, 11));
        List<Integer> arrayTwo = new ArrayList<Integer>(Arrays.asList(10, 8, 5, 15, 2, 12, 11, 94, 81));
        Assert.assertTrue(Solution.sameBsts(arrayOne, arrayTwo) == true);
    }

    @Test
    public void TestCase2() {
        List<Integer> arrayOne = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));
        List<Integer> arrayTwo = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        Assert.assertTrue(Solution.sameBsts(arrayOne, arrayTwo) == false);
    }

    @Test
    public void TestCase3() {
        List<Integer> arrayOne = new ArrayList<Integer>(Arrays.asList(10, 15, 8, 12, 94, 81, 5, 2, -1, 101, 45, 12, 8, -1, 8, 2, -34));
        List<Integer> arrayTwo = new ArrayList<Integer>(Arrays.asList(10, 8, 5, 15, 2, 12, 94, 81, -1, -1, -34, 8, 2, 8, 12, 45, 100));
        Assert.assertTrue(Solution.sameBsts(arrayOne, arrayTwo) == false);
    }

    @Test
    public void TestCase4() {
        List<Integer> arrayOne = new ArrayList<Integer>(Arrays.asList(10, 15, 8, 12, 94, 81, 5, 2, 10));
        List<Integer> arrayTwo = new ArrayList<Integer>(Arrays.asList(10, 8, 5, 15, 2, 12, 10, 94, 81));
        Assert.assertTrue(Solution.sameBsts(arrayOne, arrayTwo) == true);
    }
}