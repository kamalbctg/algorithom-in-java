package org.algorithom.BalancedBrackets;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void TestCase1() {
        String input = "([])(){}(())()()";
        Assert.assertTrue(Solution.balancedBrackets(input));
    }

    @Test
    public void TestCase2() {
        String input = ")[]}";
        Assert.assertFalse(Solution.balancedBrackets(input));
    }
    @Test
    public void TestCase3() {
        String input = "(((((({{{{{[[[[[([)])]]]]]}}}}}))))))";
        Assert.assertFalse(Solution.balancedBrackets(input));
    }
    @Test
    public void TestCase4() {
        String input = "()()[{()})]";
        Assert.assertFalse(Solution.balancedBrackets(input));
    }
}