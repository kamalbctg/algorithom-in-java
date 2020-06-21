package org.algorithom.BstConstruction;

public class Solution2 {
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
            if (value < this.value) {
                if (left == null) {
                    left = new BST(value);
                } else {
                    left.insert(value);
                }
            } else {
                if (right == null) {
                    right = new BST(value);
                } else {
                    right.insert(value);
                }
            }
            return this;
        }

        //Time  Avg: O(logn) worst: O(n)
        //Space Avg: O(1) Worst: O(1)
        public boolean contains(int value) {
            if (value < this.value) {
                if (left == null) {
                    return false;
                } else {
                    return left.contains(value);
                }
            } else if (value > this.value) {
                if (right == null) {
                    return false;
                } else {
                    return right.contains(value);
                }
            }
            return true;
        }

        public BST remove(int value) {
            remove(value, null);
            return this;
        }

        //Time  Avg: O(logn) worst: O(n)
        //Space Avg: O(1) Worst: O(1)
        private void remove(int value, BST parent) {
            if (value < this.value) {
                if (left != null) {
                    left.remove(value, this);
                }
            } else if (value > this.value) {
                if (right != null) {
                    right.remove(value, this);
                }
            } else {
                if (left != null && right != null) {
                    this.value = right.getMinValue();
                    right.remove(this.value, this);
                } else if (parent == null) {
                    if (left != null) {
                        this.value = left.value;
                        right = left.right;
                        left = left.right;
                    } else if (right != null) {
                        this.value = right.value;
                        right = right.right;
                        left = right.left;
                    }
                } else if (parent.left == this) {
                    if (left != null) {
                        parent.left = left;
                    } else {
                        parent.left = right;
                    }
                } else if (parent.right == this) {
                    if (left != null) {
                        parent.right = left;
                    } else {
                        parent.right = right;
                    }
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
