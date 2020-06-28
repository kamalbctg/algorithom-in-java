package org.algorithom.BreadthFirstSearch;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    static class Node {
        String name;
        List<Node> children = new ArrayList<>();

        public Node(String name) {
            this.name = name;
        }

        //T: O(v+e)
        //S: O(v)
        public List<String> breadthFirstSearch(List<String> array) {
            LinkedList<Node> queue = new LinkedList<>();
            queue.add(this);
            while (!queue.isEmpty()) {
                Node node = queue.poll();
                array.add(node.name);
                queue.addAll(node.children);
            }
            return array;
        }

        public Node addChild(String name) {
            Node child = new Node(name);
            children.add(child);
            return this;
        }
    }
}
