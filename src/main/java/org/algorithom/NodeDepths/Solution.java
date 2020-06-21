package org.algorithom.NodeDepths;

import org.algorithom.common.BST;

public class Solution {
    //Time : O(n)
    //Space: O(h)
    public static int nodeDepths(BST tree) {
        return calculateNodeDepth(tree, 0);
    }

    private static int calculateNodeDepth(BST tree, int depth) {
        if (tree == null) {
            return 0;
        }
        return depth + calculateNodeDepth(tree.left, depth + 1) + calculateNodeDepth(tree.right, depth + 1);
    }
}
