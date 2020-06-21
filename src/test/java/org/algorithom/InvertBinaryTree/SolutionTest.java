package org.algorithom.InvertBinaryTree;

import org.algorithom.common.BST;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayDeque;

public class SolutionTest {
    @Test
    public void TestCase1() {
        TestBinaryTree tree = new TestBinaryTree(1);
        tree.insert(new int[]{2, 3, 4, 5, 6, 7, 8, 9}, 0);
        Solution.invertBinaryTree(tree);
        InvertedBinaryTree invertedTree = new InvertedBinaryTree(1);
        invertedTree.insert(new int[]{2, 3, 4, 5, 6, 7, 8, 9}, 0);
        Assert.assertTrue(compareTree(tree, invertedTree));
    }

    @Test
    public void TestCase2() {
        TestBinaryTree tree = new TestBinaryTree(1);
        tree.insert(new int[]{2, 3, 4, 5, 6, 7, 8, 9}, 0);
        Solution2.invertBinaryTree(tree);
        InvertedBinaryTree invertedTree = new InvertedBinaryTree(1);
        invertedTree.insert(new int[]{2, 3, 4, 5, 6, 7, 8, 9}, 0);
        Assert.assertTrue(compareTree(tree, invertedTree));
    }

    private boolean compareTree(BST tree1, InvertedBinaryTree tree2) {
        if (tree1 == null && tree2 == null) {
            return true;
        }
        if (tree1 != null && tree2 != null) {
            return tree1.value == tree2.value
                    && compareTree(tree1.left, tree2.left)
                    && compareTree(tree1.right, tree2.right);
        }
        return false;
    }

    class InvertedBinaryTree {
        public int value;
        public InvertedBinaryTree left;
        public InvertedBinaryTree right;

        public InvertedBinaryTree(int value) {
            this.value = value;
        }

        public void insert(int[] values, int i) {
            if (i >= values.length) {
                return;
            }
            ArrayDeque<InvertedBinaryTree> queue = new ArrayDeque<InvertedBinaryTree>();
            queue.addLast(this);
            while (queue.size() > 0) {
                InvertedBinaryTree current = queue.pollFirst();
                if (current.right == null) {
                    current.right = new InvertedBinaryTree(values[i]);
                    break;
                }
                queue.addLast(current.right);
                if (current.left == null) {
                    current.left = new InvertedBinaryTree(values[i]);
                    break;
                }
                queue.addLast(current.left);
            }
            insert(values, i + 1);
        }
    }

    class TestBinaryTree extends BST {
        public TestBinaryTree(int value) {
            super(value);
        }

        public void insert(int[] values, int i) {
            if (i >= values.length) {
                return;
            }
            ArrayDeque<BST> queue = new ArrayDeque<BST>();
            queue.addLast(this);
            while (queue.size() > 0) {
                BST current = queue.pollFirst();
                if (current.left == null) {
                    current.left = new BST(values[i]);
                    break;
                }
                queue.addLast(current.left);
                if (current.right == null) {
                    current.right = new BST(values[i]);
                    break;
                }
                queue.addLast(current.right);
            }
            insert(values, i + 1);
        }
    }
}