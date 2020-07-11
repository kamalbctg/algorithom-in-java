package org.algorithom.SuffixTrieConstruction;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution2Test {
    @Test
    public void TestCase1() {
        Solution2.SuffixTrie trie = new Solution2.SuffixTrie("babc");
        Assert.assertTrue(trie.contains("abc"));
        Assert.assertTrue(trie.contains("c"));
        Assert.assertFalse(trie.contains("bab"));
        Assert.assertFalse(trie.contains("a"));
        Assert.assertFalse(trie.contains("dc"));
    }
}