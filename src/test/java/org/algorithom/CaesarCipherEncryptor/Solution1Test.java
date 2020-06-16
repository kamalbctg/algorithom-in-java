package org.algorithom.CaesarCipherEncryptor;


import org.junit.Assert;
import org.junit.Test;

public class Solution1Test {
    @Test
    public void testCase1() {
        Assert.assertTrue(Solution1.caesarCypherEncryptor("xyz", 54).equals("zab"));
        Assert.assertTrue(Solution1.caesarCypherEncryptor("xyz", 2).equals("zab"));
        Assert.assertTrue(Solution1.caesarCypherEncryptor("abc", 0).equals("abc"));
        Assert.assertTrue(Solution1.caesarCypherEncryptor("abc", 3).equals("def"));
        Assert.assertTrue(Solution1.caesarCypherEncryptor("xyz", 5).equals("cde"));
        Assert.assertTrue(Solution1.caesarCypherEncryptor("abc", 26).equals("abc"));
        Assert.assertTrue(Solution1.caesarCypherEncryptor("abc", 52).equals("abc"));
        Assert.assertTrue(Solution1.caesarCypherEncryptor("abc", 57).equals("fgh"));
    }

}