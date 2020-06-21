package org.algorithom.FindClosestValueInBst;

import org.algorithom.common.BST;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void test1() {
        BST bst10 = new BST(10);
        BST bst1 = new BST(1);
        BST bst2 = new BST(2);
        BST bst5 = new BST(5);
        BST bstR5 = new BST(5);

        BST bst15 = new BST(15);
        BST bst13 = new BST(13);
        BST bst22 = new BST(22);
        BST bst14 = new BST(14);


        bst2.left = bst1;
        bst5.left = bst2;
        bst5.right = bstR5;
        bst13.right= bst14;

        bst15.left=bst13;
        bst15.right = bst22;

        bst10.left = bst5;
        bst10.right = bst15;
        Assert.assertEquals(13, Solution.findClosestValueInBst(bst10, 12));
    }

    @Test
    public void test2() {
        BST bst10 = new BST(10);
        BST bst1 = new BST(1);
        BST bst2 = new BST(2);
        BST bst5 = new BST(5);
        BST bstR5 = new BST(5);

        BST bst15 = new BST(15);
        BST bst13 = new BST(13);
        BST bst22 = new BST(22);
        BST bst14 = new BST(14);


        bst2.left = bst1;
        bst5.left = bst2;
        bst5.right = bstR5;
        bst13.right= bst14;

        bst15.left=bst13;
        bst15.right = bst22;

        bst10.left = bst5;
        bst10.right = bst15;
        Assert.assertEquals(13, Solution2.findClosestValueInBst(bst10, 12));
    }
}