package org.algorithom.MinHeightBST;

import org.algorithom.common.BST;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void TestCase1() {
        List<Integer> array = Arrays.asList(1, 2, 5, 7, 10, 13, 14, 15, 22);
        BST tree = Solution.minHeightBst(array);

        Assert.assertTrue(validateBst(tree));
        Assert.assertEquals(4, getTreeHeight(tree));

        var inOrder = inOrderTraverse(tree, new ArrayList<>());
        List<Integer> expected = Arrays.asList(1, 2, 5, 7, 10, 13, 14, 15, 22);
        Assert.assertTrue(expected.equals(inOrder));
    }


    @Test
    public void TestCase2() {
        List<Integer> array = Arrays.asList(1, 2, 5, 7, 10, 13, 14, 15, 22);
        var tree = Solution2.minHeightBst(array);

        Assert.assertTrue(validateBst(tree));
        Assert.assertEquals(4, getTreeHeight(tree));

        var inOrder = inOrderTraverse(tree, new ArrayList<>());
        List<Integer> expected = Arrays.asList(1, 2, 5, 7, 10, 13, 14, 15, 22);
        Assert.assertTrue(expected.equals(inOrder));
    }

//    @Test
//    public void TestCase3() {
//        List<Integer> array = Arrays.asList(1, 2, 5, 7, 10, 13, 14, 15, 22);
//        var tree = Solution3.minHeightBst(array);
//
//        Assert.assertTrue(validateBst(tree));
//        Assert.assertEquals(4, getTreeHeight(tree));
//
//        var inOrder = inOrderTraverse(tree, new ArrayList<>());
//        List<Integer> expected = Arrays.asList(1, 2, 5, 7, 10, 13, 14, 15, 22);
//        Assert.assertTrue(expected.equals(inOrder));
//    }


    static boolean validateBst(BST tree) {
        return validateBst(tree, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    static boolean validateBst(BST tree, int minValue, int maxValue) {
        if (tree.value < minValue || tree.value >= maxValue) {
            return false;
        }
        if (tree.left != null && !validateBst(tree.left, minValue, tree.value)) {
            return false;
        }
        if (tree.right != null && !validateBst(tree.right, tree.value, maxValue)) {
            return false;
        }
        return true;
    }

    static List<Integer> inOrderTraverse(BST tree, List<Integer> array) {
        if (tree.left != null) {
            inOrderTraverse(tree.left, array);
        }
        array.add(tree.value);
        if (tree.right != null) {
            inOrderTraverse(tree.right, array);
        }
        return array;
    }

    static int getTreeHeight(BST tree) {
        return getTreeHeight(tree, 0);
    }

    static int getTreeHeight(BST tree, int height) {
        if (tree == null) return height;
        int leftTreeHeight = getTreeHeight(tree.left, height + 1);
        int rightTreeHeight = getTreeHeight(tree.right, height + 1);
        return Math.max(leftTreeHeight, rightTreeHeight);
    }
}