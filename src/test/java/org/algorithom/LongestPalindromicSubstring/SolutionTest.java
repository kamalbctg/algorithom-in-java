package org.algorithom.LongestPalindromicSubstring;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void TestCase1() {
        Assert.assertTrue(Solution.longestPalindromicSubstring("abaxyzzyxf").equals("xyzzyx"));
        Assert.assertTrue(Solution.longestPalindromicSubstring("xyzzyx").equals("xyzzyx"));
        Assert.assertTrue(Solution.longestPalindromicSubstring("abcdefgfedcba").equals("abcdefgfedcba"));
        Assert.assertTrue(Solution.longestPalindromicSubstring("a").equals("a"));
        Assert.assertTrue(Solution.longestPalindromicSubstring("it's highnoon").equals("noon"));
        Assert.assertTrue(Solution.longestPalindromicSubstring("abcdefgfedcbazzzzzzzzzzzzzzzzzzzz").equals("zzzzzzzzzzzzzzzzzzzz"));
        Assert.assertTrue(Solution.longestPalindromicSubstring("abcdefggfedcba").equals("abcdefggfedcba"));
    }
}