package org.algorithom.YoungestCommonAncestor;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class SolutionTest {
    public HashMap<Character, Solution.AncestralTree> getTrees() {
        var trees = new HashMap<Character, Solution.AncestralTree>();
        var alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (char a : alphabet.toCharArray()) {
            trees.put(a, new Solution.AncestralTree(a));
        }

        trees
                .get('A')
                .addAsAncestor(
                        new Solution.AncestralTree[]{
                                trees.get('B'),
                                trees.get('C'),
                                trees.get('D'),
                                trees.get('E'),
                                trees.get('F')
                        });
        return trees;
    }

    @Test
    public void TestCase1() {
        var trees = getTrees();
        trees.get('A').addAsAncestor(new Solution.AncestralTree[]{trees.get('B'), trees.get('C')});
        trees.get('B').addAsAncestor(new Solution.AncestralTree[]{trees.get('D'), trees.get('E')});
        trees.get('D').addAsAncestor(new Solution.AncestralTree[]{trees.get('H'), trees.get('I')});
        trees.get('C').addAsAncestor(new Solution.AncestralTree[]{trees.get('F'), trees.get('G')});

        var yca = Solution.getYoungestCommonAncestor(trees.get('A'), trees.get('E'), trees.get('I'));
        Assert.assertTrue(yca == trees.get('B'));
    }

    @Test
    public void TestCase2() {
        var trees = getTrees();
        trees.get('A').addAsAncestor(new Solution.AncestralTree[]{trees.get('B'), trees.get('C')});
        trees.get('B').addAsAncestor(new Solution.AncestralTree[]{trees.get('D'), trees.get('E')});
        trees.get('D').addAsAncestor(new Solution.AncestralTree[]{trees.get('H'), trees.get('I')});
        trees.get('C').addAsAncestor(new Solution.AncestralTree[]{trees.get('F'), trees.get('G')});

        var yca = Solution.getYoungestCommonAncestor(trees.get('A'), trees.get('I'), trees.get('G'));
        Assert.assertTrue(yca == trees.get('A'));
    }
}