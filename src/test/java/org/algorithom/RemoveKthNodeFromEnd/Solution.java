package org.algorithom.RemoveKthNodeFromEnd;

public class Solution {

    public static void removeKthNodeFromEnd(SolutionTest.TestLinkedList head, int k) {
        int counter = 0;
        LinkedList first = head;
        LinkedList second = head;
        while (counter < k) {
            second = second.next;
            ++counter;
        }

        if (second == null) {  // target node is head node
            head.value = head.next.value;
            head.next = head.next.next;
            return;
        }

        while (second.next != null) {
            second = second.next;
            first = first.next;
        }

        first.next = first.next.next;
    }

    static class LinkedList {
        int value;
        LinkedList next = null;

        public LinkedList(int value) {
            this.value = value;
        }
    }
}
