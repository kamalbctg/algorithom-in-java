package org.algorithom.BstConstruction;

public class Solution {
    public static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }

        //Time  Avg: O(logn) worst: O(n)
        //Space Avg: O(1) Worst: O(1)
        public BST insert(int value) {
            BST node = this;
            while (true) {
                if (value < node.value) {
                    if (node.left == null) {
                        node.left = new BST(value);
                        break;
                    } else {
                        node = node.left;
                    }
                } else {
                    if (node.right == null) {
                        node.right = new BST(value);
                        break;
                    } else {
                        node = node.right;
                    }
                }
            }
            return this;
        }

        //Time  Avg: O(logn) worst: O(n)
        //Space Avg: O(1) Worst: O(1)
        public boolean contains(int value) {
            BST node = this;
            while (node != null) {
                if (value < node.value) {
                    node = node.left;
                } else if (value > node.value) {
                    node = node.right;
                } else {
                    return true;
                }
            }
            return false;
        }

        public BST remove(int value) {
            remove(value, null);
            return this;
        }

        //Time  Avg: O(logn) worst: O(n)
        //Space Avg: O(1) Worst: O(1)
        private void remove(int value, BST parent) {
            BST node = this;
            while (node != null) {
                if (value < node.value) {
                    parent = node;
                    node = node.left;
                } else if (value > node.value) {
                    parent = node;
                    node = node.right;
                } else {
                    if (node.left != null && node.right != null) {
                        node.value = node.right.getMinValue();
                        node.right.remove(node.value, node);
                    } else if (parent == null) {
                        if (node.left != null) {
                            node.value = node.left.value;
                            node.right = node.left.right;
                            node.left = node.left.left;
                        } else if (node.right != null) {
                            node.value = node.right.value;
                            node.left = node.right.left;
                            node.right = node.right.right;
                        }
                    } else if (node == parent.left) {
                        parent.left = (node.left != null) ? node.left : node.right;
                    } else if (node == parent.right) {
                        parent.right = (node.left != null) ? node.left : node.right;
                    }
                    break;
                }
            }
        }

        private int getMinValue() {
            if (left == null) {
                return this.value;
            } else {
                return left.getMinValue();
            }
        }
    }
}