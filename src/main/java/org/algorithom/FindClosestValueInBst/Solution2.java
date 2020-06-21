package org.algorithom.FindClosestValueInBst;

import org.algorithom.common.BST;

public class Solution2 {
    // Time:  AVG O(log(n)), Worst: O(n)
    // Space: AVG O(n), Worst: O(n)
    public static int findClosestValueInBst(BST tree, int target) {
        return findClosestValueInBst(target, Integer.MIN_VALUE, tree);
    }

    private static int findClosestValueInBst(int target, int closest, BST tree) {
        if (Math.abs(target - closest) > Math.abs(target - tree.value)) {
            closest = tree.value;
        }
        if (target < tree.value && tree.left != null)
            return findClosestValueInBst(target, closest, tree.left);
        else if (target > tree.value && tree.right != null)
            return findClosestValueInBst(target, closest, tree.right);
        else {
            return closest;
        }
    }
}
