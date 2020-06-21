package org.algorithom.MinHeightBST;

import org.algorithom.common.BST;

import java.util.List;

public class Solution {
    public static BST minHeightBst(List<Integer> array) {
        return minHeightBstHelper(null, array, 0, array.size() - 1);
    }

    private static BST minHeightBstHelper(BST tree, List<Integer> array, int left, int right) {
        if (left > right) return null;

        int mid = (left + right) / 2;
        Integer value = array.get(mid);
        BST newBst = new BST(value);
        if (tree == null) {
            tree = newBst;
        } else {
            if (value < tree.value) {
                tree.left = newBst;
                tree = tree.left;
            } else {
                tree.right = newBst;
                tree = tree.right;
            }
        }
        minHeightBstHelper(tree, array, left, mid - 1);
        minHeightBstHelper(tree, array, mid + 1, right);
        return tree;
    }
}
