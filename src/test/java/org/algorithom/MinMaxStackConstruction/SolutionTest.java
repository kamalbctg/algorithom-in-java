package org.algorithom.MinMaxStackConstruction;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    public void testMinMaxPeek(int min, int max, int peek, Solution.MinMaxStack stack) {
        Assert.assertTrue(stack.getMin() == min);
        Assert.assertTrue(stack.getMax() == max);
        Assert.assertTrue(stack.peek() == peek);
    }

    @Test
    public void TestCase1() {
        Solution.MinMaxStack stack = new Solution.MinMaxStack();
        stack.push(5);
        testMinMaxPeek(5, 5, 5, stack);
        stack.push(7);
        testMinMaxPeek(5, 7, 7, stack);
        stack.push(2);
        testMinMaxPeek(2, 7, 2, stack);
        Assert.assertTrue(stack.pop() == 2);
        Assert.assertTrue(stack.pop() == 7);
        testMinMaxPeek(5, 5, 5, stack);
    }
}