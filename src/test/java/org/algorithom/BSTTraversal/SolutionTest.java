package org.algorithom.BSTTraversal;

import org.algorithom.common.BST;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SolutionTest {
    @Test
    public void TestCase1() {
        var root = new BST(10);
        root.left = new BST(5);
        root.left.left = new BST(2);
        root.left.left.left = new BST(1);
        root.left.right = new BST(5);
        root.right = new BST(15);
        root.right.right = new BST(22);

        List<Integer> inOrder = Arrays.asList(new Integer[]{1, 2, 5, 5, 10, 15, 22});
        List<Integer> preOrder = Arrays.asList(new Integer[]{10, 5, 2, 1, 5, 15, 22});
        List<Integer> postOrder = Arrays.asList(new Integer[]{1, 2, 5, 5, 22, 15, 10});

        Assert.assertTrue(Solution.inOrderTraverse(root, new ArrayList<Integer>()).equals(inOrder));
        Assert.assertTrue(Solution.preOrderTraverse(root, new ArrayList<Integer>()).equals(preOrder));
        Assert.assertTrue(Solution.postOrderTraverse(root, new ArrayList<Integer>()).equals(postOrder));
    }

}