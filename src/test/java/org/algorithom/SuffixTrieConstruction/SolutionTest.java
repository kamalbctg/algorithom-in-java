package org.algorithom.SuffixTrieConstruction;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void TestCase1() {
        Solution.SuffixTrie trie = new Solution.SuffixTrie("babc");
        Assert.assertTrue(trie.contains("abc"));
        Assert.assertTrue(trie.contains("c"));
        Assert.assertFalse(trie.contains("bab"));
        Assert.assertFalse(trie.contains("a"));
        Assert.assertFalse(trie.contains("dc"));
    }
}