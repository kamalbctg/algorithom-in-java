package org.algorithom.LevenshteinDistance;

import org.junit.Assert;
import org.junit.Test;

public class Solution2Test {
    @Test
    public void TestCase1() {
        Assert.assertTrue(Solution2.levenshteinDistance("abc", "yabd") == 2);
        Assert.assertTrue(Solution2.levenshteinDistance("", "") == 0);
        Assert.assertTrue(Solution2.levenshteinDistance("", "abc") == 3);
        Assert.assertTrue(Solution2.levenshteinDistance("abc", "abc") == 0);
        Assert.assertTrue(Solution2.levenshteinDistance("abcdefghij", "1234567890") == 10);
        Assert.assertTrue(Solution2.levenshteinDistance("biting", "mitten") == 4);
    }
}