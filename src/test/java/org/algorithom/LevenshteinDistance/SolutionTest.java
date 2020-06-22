package org.algorithom.LevenshteinDistance;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void TestCase1() {
        Assert.assertTrue(Solution.levenshteinDistance("abc", "yabd") == 2);
        Assert.assertTrue(Solution.levenshteinDistance("", "") == 0);
        Assert.assertTrue(Solution.levenshteinDistance("", "abc") == 3);
        Assert.assertTrue(Solution.levenshteinDistance("abc", "abc") == 0);
        Assert.assertTrue(Solution.levenshteinDistance("abcdefghij", "1234567890") == 10);
        Assert.assertTrue(Solution.levenshteinDistance("biting", "mitten") == 4);
    }

}