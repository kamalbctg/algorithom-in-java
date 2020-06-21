package org.algorithom.BstConstruction;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void TestCase1() {
        Solution.BST root = new Solution.BST(10);
        root.left = new Solution.BST(5);
        root.left.left = new Solution.BST(2);
        root.left.left.left = new Solution.BST(1);
        root.left.right = new Solution.BST(5);
        root.right = new Solution.BST(15);
        root.right.left = new Solution.BST(13);
        root.right.left.right = new Solution.BST(14);
        root.right.right = new Solution.BST(22);

        root.insert(12);
        Assert.assertTrue(root.right.left.left.value == 12);

        root.remove(10);
        Assert.assertTrue(root.contains(10) == false);
        Assert.assertTrue(root.value == 12);

        Assert.assertTrue(root.contains(15));
    }
}