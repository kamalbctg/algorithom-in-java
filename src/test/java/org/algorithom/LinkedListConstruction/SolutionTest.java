package org.algorithom.LinkedListConstruction;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SolutionTest {

    @Test
    public void TestCase1() {
        Solution.DoublyLinkedList linkedList = new Solution.DoublyLinkedList();
        Solution.Node one = new Solution.Node(1);
        Solution.Node two = new Solution.Node(2);
        Solution.Node three = new Solution.Node(3);
        Solution.Node three2 = new Solution.Node(3);
        Solution.Node three3 = new Solution.Node(3);
        Solution.Node four = new Solution.Node(4);
        Solution.Node five = new Solution.Node(5);
        Solution.Node six = new Solution.Node(6);
        bindNodes(one, two);
        bindNodes(two, three);
        bindNodes(three, four);
        bindNodes(four, five);
        linkedList.head = one;
        linkedList.tail = five;

        linkedList.setHead(four);
        Assert.assertTrue(compare(getNodeValuesHeadToTail(linkedList), new int[]{4, 1, 2, 3, 5}));
        Assert.assertTrue(compare(getNodeValuesTailToHead(linkedList), new int[]{5, 3, 2, 1, 4}));

        linkedList.setTail(six);
        Assert.assertTrue(compare(getNodeValuesHeadToTail(linkedList), new int[]{4, 1, 2, 3, 5, 6}));
        Assert.assertTrue(compare(getNodeValuesTailToHead(linkedList), new int[]{6, 5, 3, 2, 1, 4}));

        linkedList.insertBefore(six, three);
        Assert.assertTrue(compare(getNodeValuesHeadToTail(linkedList), new int[]{4, 1, 2, 5, 3, 6}));
        Assert.assertTrue(compare(getNodeValuesTailToHead(linkedList), new int[]{6, 3, 5, 2, 1, 4}));

        linkedList.insertAfter(six, three2);
        Assert.assertTrue(compare(getNodeValuesHeadToTail(linkedList), new int[]{4, 1, 2, 5, 3, 6, 3}));
        Assert.assertTrue(compare(getNodeValuesTailToHead(linkedList), new int[]{3, 6, 3, 5, 2, 1, 4}));

        linkedList.insertAtPosition(1, three3);
        Assert.assertTrue(compare(getNodeValuesHeadToTail(linkedList), new int[]{3, 4, 1, 2, 5, 3, 6, 3}));
        Assert.assertTrue(compare(getNodeValuesTailToHead(linkedList), new int[]{3, 6, 3, 5, 2, 1, 4, 3}));

        linkedList.removeNodesWithValue(3);
        Assert.assertTrue(compare(getNodeValuesHeadToTail(linkedList), new int[]{4, 1, 2, 5, 6}));
        Assert.assertTrue(compare(getNodeValuesTailToHead(linkedList), new int[]{6, 5, 2, 1, 4}));

        linkedList.remove(two);
        Assert.assertTrue(compare(getNodeValuesHeadToTail(linkedList), new int[]{4, 1, 5, 6}));
        Assert.assertTrue(compare(getNodeValuesTailToHead(linkedList), new int[]{6, 5, 1, 4}));

        Assert.assertTrue(linkedList.containsNodeWithValue(5));
    }

    private List<Integer> getNodeValuesHeadToTail(Solution.DoublyLinkedList linkedList) {
        List<Integer> values = new ArrayList<Integer>();
        Solution.Node node = linkedList.head;
        while (node != null) {
            values.add(node.value);
            node = node.next;
        }
        return values;
    }

    private List<Integer> getNodeValuesTailToHead(Solution.DoublyLinkedList linkedList) {
        List<Integer> values = new ArrayList<>();
        Solution.Node node = linkedList.tail;
        while (node != null) {
            values.add(node.value);
            node = node.prev;
        }
        return values;
    }

    private void bindNodes(Solution.Node nodeOne, Solution.Node nodeTwo) {
        nodeOne.next = nodeTwo;
        nodeTwo.prev = nodeOne;
    }

    private boolean compare(List<Integer> array1, int[] array2) {
        if (array1.size() != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.size(); i++) {
            if (array1.get(i) != array2[i]) {
                return false;
            }
        }
        return true;
    }
}