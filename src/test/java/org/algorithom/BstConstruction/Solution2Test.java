package org.algorithom.BstConstruction;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution2Test {
    @Test
    public void TestCase1() {
        Solution2.BST root = new Solution2.BST(10);
        root.left = new Solution2.BST(5);
        root.left.left = new Solution2.BST(2);
        root.left.left.left = new Solution2.BST(1);
        root.left.right = new Solution2.BST(5);
        root.right = new Solution2.BST(15);
        root.right.left = new Solution2.BST(13);
        root.right.left.right = new Solution2.BST(14);
        root.right.right = new Solution2.BST(22);

        root.insert(12);
        Assert.assertTrue(root.right.left.left.value == 12);

        root.remove(10);
        Assert.assertTrue(root.contains(10) == false);
        Assert.assertTrue(root.value == 12);

        Assert.assertTrue(root.contains(15));
    }
}