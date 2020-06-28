package org.algorithom.YoungestCommonAncestor;

public class Solution {
    public static AncestralTree getYoungestCommonAncestor(AncestralTree topAncestor,
                                                          AncestralTree descendantOne,
                                                          AncestralTree descendantTwo) {
        int depthOfDescendantOne = caculateDepth(topAncestor, descendantOne);
        int depthOfDescendantTwo = caculateDepth(topAncestor, descendantTwo);
        return (depthOfDescendantOne > depthOfDescendantTwo) ?
                findYoungestCommonAncestor(descendantOne, descendantTwo, depthOfDescendantOne - depthOfDescendantTwo) :
                findYoungestCommonAncestor(descendantTwo, descendantOne, depthOfDescendantTwo - depthOfDescendantOne);
    }

    private static AncestralTree findYoungestCommonAncestor(AncestralTree lowerDescendant, AncestralTree higherDescendant, int level) {
        while (level > 0) {
            lowerDescendant = lowerDescendant.ancestor;
            level--;
        }

        while (lowerDescendant != higherDescendant){
            lowerDescendant = lowerDescendant.ancestor;
            higherDescendant = higherDescendant.ancestor;
        }
        return higherDescendant;
    }

    private static int caculateDepth(AncestralTree ancestor, AncestralTree descendant) {
        int depth = 0;
        while (descendant != ancestor) {
            depth++;
            descendant = descendant.ancestor;
        }
        return depth;
    }

    static class AncestralTree {
        public char name;
        public AncestralTree ancestor;

        AncestralTree(char name) {
            this.name = name;
            this.ancestor = null;
        }

        // This method is for testing only.
        void addAsAncestor(AncestralTree[] descendants) {
            for (AncestralTree descendant : descendants) {
                descendant.ancestor = this;
            }
        }
    }
}
