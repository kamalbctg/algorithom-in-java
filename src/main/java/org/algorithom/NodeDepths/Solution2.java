package org.algorithom.NodeDepths;

import org.algorithom.common.BST;

import java.util.ArrayList;
import java.util.List;

public class Solution2 {
    public static int nodeDepths(BST bst) {
        List<Level> stack = new ArrayList<>();
        stack.add(new Level(0, bst));
        int sum = 0;
        while (!stack.isEmpty()) {
            Level top = stack.remove(stack.size() - 1);
            if (top.node == null) continue;
            sum += top.depth;
            stack.add(new Level(top.depth + 1, top.node.left));
            stack.add(new Level(top.depth + 1, top.node.right));
        }
        return sum;
    }

    static class Level {
        int depth;
        BST node;

        public Level(int depth, BST node) {
            this.depth = depth;
            this.node = node;
        }
    }
}
