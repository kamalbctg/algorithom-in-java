package org.algorithom.BSTTraversal;

import org.algorithom.common.BST;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Integer> inOrderTraverse(BST bst, ArrayList<Integer> numbers) {
        if (bst.left != null) {
            inOrderTraverse(bst.left, numbers);
        }
        numbers.add(bst.value);
        if (bst.right != null) {
            inOrderTraverse(bst.right, numbers);
        }
        return numbers;
    }

    public static List<Integer> preOrderTraverse(BST bst, ArrayList<Integer> numbers) {
        numbers.add(bst.value);
        if (bst.left != null) {
            preOrderTraverse(bst.left, numbers);
        }
        if (bst.right != null) {
            preOrderTraverse(bst.right, numbers);
        }
        return numbers;
    }

    public static List<Integer> postOrderTraverse(BST bst, ArrayList<Integer> numbers) {
        if (bst.left != null) {
            postOrderTraverse(bst.left, numbers);
        }
        if (bst.right != null) {
            postOrderTraverse(bst.right, numbers);
        }
        numbers.add(bst.value);
        return numbers;
    }
}
