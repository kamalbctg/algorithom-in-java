package org.algorithom.MinHeightBST;

import org.algorithom.common.BST;

import java.util.List;

public class Solution2 {
    public static BST minHeightBst(List<Integer> array) {
        return minHeightBstHelper(array, 0, array.size() - 1);
    }

    // O(n)time | O(n) space - where n is the length of the array
    private static BST minHeightBstHelper(List<Integer> array, int left, int right) {
        if (left > right) return null;
        int mid = (left + right) / 2;

        Integer value = array.get(mid);
        BST tree = new BST(value);
        tree.left = minHeightBstHelper(array, left, mid - 1);
        tree.right = minHeightBstHelper(array, mid + 1, right);
        return tree;
    }
}
