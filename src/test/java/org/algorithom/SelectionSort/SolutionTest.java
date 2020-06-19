package org.algorithom.SelectionSort;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void selectionSort() {
        Assert.assertArrayEquals(new int[]{2, 3, 5, 5, 6, 8, 9}, Solution.selectionSort(new int[]{8, 5, 2, 9, 5, 6, 3}));
        Assert.assertArrayEquals(new int[]{1}, Solution.selectionSort(new int[]{1}));
        Assert.assertArrayEquals(new int[]{1, 2}, Solution.selectionSort(new int[]{1, 2}));
        Assert.assertArrayEquals(new int[]{-10, -7, -7, -6, -6, -5, -5, -4, -4, -4, -2, -1, 1, 3, 5, 5, 6, 8, 8, 10}, Solution.selectionSort(new int[]{-4, 5, 10, 8, -10, -6, -4, -2, -5, 3, 5, -4, -5, -1, 1, 6, -7, -6, -7, 8}));
    }
}