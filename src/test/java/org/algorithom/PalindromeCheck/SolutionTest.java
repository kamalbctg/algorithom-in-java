package org.algorithom.PalindromeCheck;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest extends TestCase {
    @Test
    public void test1(){
        Assert.assertTrue(Solution1.isPalindrome("abcdcba"));
        Assert.assertTrue(Solution1.isPalindrome("a"));
        Assert.assertFalse(Solution1.isPalindrome("ab"));
        Assert.assertTrue(Solution1.isPalindrome("aba"));
        Assert.assertTrue(Solution1.isPalindrome("abba"));
        Assert.assertTrue(Solution1.isPalindrome("abcdefghhgfedcba"));
        Assert.assertTrue(Solution1.isPalindrome("abcdefghihgfedcba"));
        Assert.assertFalse(Solution1.isPalindrome("abcdefghihgfeddcba"));
    }

    @Test
    public void test2(){
        Assert.assertTrue(Solution2.isPalindrome("abcdcba"));
        Assert.assertTrue(Solution2.isPalindrome("a"));
        Assert.assertFalse(Solution2.isPalindrome("ab"));
        Assert.assertTrue(Solution2.isPalindrome("aba"));
        Assert.assertTrue(Solution2.isPalindrome("abba"));
        Assert.assertTrue(Solution2.isPalindrome("abcdefghhgfedcba"));
        Assert.assertTrue(Solution2.isPalindrome("abcdefghihgfedcba"));
        Assert.assertFalse(Solution2.isPalindrome("abcdefghihgfeddcba"));
    }

    @Test
    public void test3(){
        Assert.assertTrue(Solution3.isPalindrome("abcdcba"));
        Assert.assertTrue(Solution3.isPalindrome("a"));
        Assert.assertFalse(Solution3.isPalindrome("ab"));
        Assert.assertTrue(Solution3.isPalindrome("aba"));
        Assert.assertTrue(Solution3.isPalindrome("abba"));
        Assert.assertTrue(Solution3.isPalindrome("abcdefghhgfedcba"));
        Assert.assertTrue(Solution3.isPalindrome("abcdefghihgfedcba"));
        Assert.assertFalse(Solution3.isPalindrome("abcdefghihgfeddcba"));
    }

    @Test
    public void test4(){
        Assert.assertTrue(Solution4.isPalindrome("abcdcba"));
        Assert.assertTrue(Solution4.isPalindrome("a"));
        Assert.assertFalse(Solution4.isPalindrome("ab"));
        Assert.assertTrue(Solution4.isPalindrome("aba"));
        Assert.assertTrue(Solution4.isPalindrome("abba"));
        Assert.assertTrue(Solution4.isPalindrome("abcdefghhgfedcba"));
        Assert.assertTrue(Solution4.isPalindrome("abcdefghihgfedcba"));
        Assert.assertFalse(Solution4.isPalindrome("abcdefghihgfeddcba"));
    }

}