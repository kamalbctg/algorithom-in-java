package org.algorithom.InvertBinaryTree;

import org.algorithom.common.BST;

import java.util.ArrayDeque;

public class Solution {
    //Time: O(n)
    //Space: O(n)
    public static void invertBinaryTree(BST tree) {
        ArrayDeque<BST> queue = new ArrayDeque<>();
        queue.addFirst(tree);
        while (queue.size() != 0) {
            BST node = queue.pollFirst();
            if (node == null) {
                continue;
            }
            swapChilds(node);
            if (node.left != null) {
                queue.addLast(node.left);
            }
            if (node.right != null) {
                queue.addLast(node.right);
            }
        }
    }

    private static void swapChilds(BST root) {
        BST tmp = root.left;
        root.left = root.right;
        root.right = tmp;
    }
}
