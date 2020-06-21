package org.algorithom.NodeDepths;

import org.algorithom.common.BST;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void test1() {

        BST binaryTree6 = new BST(6);
        BST binaryTree7 = new BST(7);
        BST binaryTree8 = new BST(8);
        BST binaryTree9 = new BST(9);

        BST binaryTree3 = new BST(3);
        binaryTree3.left=binaryTree6;
        binaryTree3.right= binaryTree7;

        BST binaryTree4 = new BST(4);
        binaryTree4.left= binaryTree8;
        binaryTree4.right= binaryTree9;

        BST binaryTree5 = new BST(5);
        BST binaryTree2 = new BST(2);
        binaryTree2.left=binaryTree4;
        binaryTree2.right=binaryTree5;

        BST binaryTree1 = new BST(1);
        binaryTree1.left=binaryTree2;
        binaryTree1.right=binaryTree3;

        Assert.assertEquals(16,Solution.nodeDepths(binaryTree1));
    }

    @Test
    public void test2() {

        BST binaryTree6 = new BST(6);
        BST binaryTree7 = new BST(7);
        BST binaryTree8 = new BST(8);
        BST binaryTree9 = new BST(9);

        BST binaryTree3 = new BST(3);
        binaryTree3.left=binaryTree6;
        binaryTree3.right= binaryTree7;

        BST binaryTree4 = new BST(4);
        binaryTree4.left= binaryTree8;
        binaryTree4.right= binaryTree9;

        BST binaryTree5 = new BST(5);
        BST binaryTree2 = new BST(2);
        binaryTree2.left=binaryTree4;
        binaryTree2.right=binaryTree5;

        BST binaryTree1 = new BST(1);
        binaryTree1.left=binaryTree2;
        binaryTree1.right=binaryTree3;

        Assert.assertEquals(16,Solution2.nodeDepths(binaryTree1));
    }
}