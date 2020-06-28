package org.algorithom.MinHeapConstruction;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SolutionTest {
    @Test
    public void TestCase1() {
        Solution.MinHeap minHeap = new Solution.MinHeap(new ArrayList<>(Arrays.asList(48, 12, 24, 7, 8, -5, 24, 391, 24, 56, 2, 6, 8, 41)));
        minHeap.insert(76);
        Assert.assertTrue(isMinHeapPropertySatisfied(minHeap.heap));
        Assert.assertTrue(minHeap.peek() == -5);
        Assert.assertTrue(minHeap.remove() == -5);
        Assert.assertTrue(isMinHeapPropertySatisfied(minHeap.heap));
        Assert.assertTrue(minHeap.peek() == 2);
        Assert.assertTrue(minHeap.remove() == 2);
        Assert.assertTrue(isMinHeapPropertySatisfied(minHeap.heap));
        Assert.assertTrue(minHeap.peek() == 6);
        minHeap.insert(87);
        Assert.assertTrue(isMinHeapPropertySatisfied(minHeap.heap));
    }

    boolean isMinHeapPropertySatisfied(List<Integer> array) {
        for (int currentIdx = 1; currentIdx < array.size(); currentIdx++) {
            int parentIdx = (currentIdx - 1) / 2;
            if (parentIdx < 0) {
                return true;
            }
            if (array.get(parentIdx) > array.get(currentIdx)) {
                return false;
            }
        }

        return true;
    }
}