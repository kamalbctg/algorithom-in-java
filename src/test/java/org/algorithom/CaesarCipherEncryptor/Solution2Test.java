package org.algorithom.CaesarCipherEncryptor;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class Solution2Test {
    @Test
    public void testCase1() {
        Assert.assertTrue(Solution2.caesarCypherEncryptor("xyz", 54).equals("zab"));
        Assert.assertTrue(Solution2.caesarCypherEncryptor("xyz", 2).equals("zab"));
        Assert.assertTrue(Solution2.caesarCypherEncryptor("abc", 0).equals("abc"));
        Assert.assertTrue(Solution2.caesarCypherEncryptor("abc", 3).equals("def"));
        Assert.assertTrue(Solution2.caesarCypherEncryptor("xyz", 5).equals("cde"));
        Assert.assertTrue(Solution2.caesarCypherEncryptor("abc", 26).equals("abc"));
        Assert.assertTrue(Solution2.caesarCypherEncryptor("abc", 52).equals("abc"));
        Assert.assertTrue(Solution2.caesarCypherEncryptor("abc", 57).equals("fgh"));
    }

}