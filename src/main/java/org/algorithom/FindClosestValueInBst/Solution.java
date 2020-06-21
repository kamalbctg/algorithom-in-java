package org.algorithom.FindClosestValueInBst;

import org.algorithom.common.BST;

public class Solution {
    // Time:  AVG O(log(n)), Worst: O(n)
    // Space: AVG O(1),      Worst: O(n)
    public static int findClosestValueInBst(BST tree, int target) {
        BST currentNode = tree;
        int closest = Integer.MIN_VALUE;
        while (currentNode != null) {
            if (Math.abs(target - closest) > Math.abs(target - currentNode.value)) {
                closest = currentNode.value;
            }
            if (target < currentNode.value) {
                currentNode = currentNode.left;
            } else if (target > currentNode.value) {
                currentNode = currentNode.right;
            } else {
                break;
            }
        }
        return closest;
    }
}
