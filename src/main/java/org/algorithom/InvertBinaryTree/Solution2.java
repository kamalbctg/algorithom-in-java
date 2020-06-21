package org.algorithom.InvertBinaryTree;

import org.algorithom.common.BST;

import java.util.ArrayDeque;

public class Solution2 {
    //Time: O(n)
    //Space: O(n)
    public static void invertBinaryTree(BST tree) {
        invertBinaryTreeHelper(tree);
    }

    private static void invertBinaryTreeHelper(BST tree) {
        if(tree == null) return;
        swapChilds(tree);
        invertBinaryTree(tree.left);
        invertBinaryTree(tree.right);
    }

    private static void swapChilds(BST root) {
        BST tmp = root.left;
        root.left = root.right;
        root.right = tmp;
    }
}
