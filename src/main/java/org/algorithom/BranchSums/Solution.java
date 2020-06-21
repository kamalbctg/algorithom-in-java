package org.algorithom.BranchSums;

import org.algorithom.common.BST;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Integer> branchSums(BST tree) {
        List<Integer> sums = new ArrayList<>();
        doSum(tree, 0, sums);
        return sums;
    }

    private static void doSum(BST tree, int sum, List<Integer> sums) {
        if (tree == null) return;
        sum += tree.value;
        if (tree.left == null && tree.right == null) {
            sums.add(sum);
        }
        doSum(tree.left, sum, sums);
        doSum(tree.right, sum, sums);

    }
}
