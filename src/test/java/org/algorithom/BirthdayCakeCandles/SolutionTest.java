package org.algorithom.BirthdayCakeCandles;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void test1() {
        Assert.assertTrue(Solution.birthdayCakeCandles(new int[]{3 ,2 ,1 ,3})==2);
    }
}