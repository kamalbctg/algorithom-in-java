package org.algorithom.ValidateBST;

import org.algorithom.common.BST;

public class Solution {
    public static boolean validateBst(BST tree) {
        return validateBstHelper(tree, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    //O(n) time, O(d) space
    private static boolean validateBstHelper(BST tree, int minValue, int maxValue) {
        if (tree.value < minValue || tree.value >= maxValue) return false;
        if (tree.left != null && !validateBstHelper(tree.left, minValue, maxValue)) return false;
        if (tree.right != null && !validateBstHelper(tree.right, tree.value, maxValue)) return false;
        return true;
    }
}
