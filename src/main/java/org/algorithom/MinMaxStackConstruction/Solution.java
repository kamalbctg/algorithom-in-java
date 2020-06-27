package org.algorithom.MinMaxStackConstruction;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    static class MinMaxStack {
        List<Map<String, Integer>> minMaxStack = new ArrayList<>();
        List<Integer> stack = new ArrayList<>();

        public int peek() {
            return stack.get(stack.size() - 1);
        }

        public int pop() {
            minMaxStack.remove(minMaxStack.size() - 1);
            return stack.remove(stack.size() - 1);
        }

        public void push(Integer number) {
            Map<String, Integer> tmp = new HashMap<>();
            tmp.put("min", number);
            tmp.put("max", number);
            if (minMaxStack.size() > 0) {
                tmp.replace("min", Math.min(number, getMin()));
                tmp.replace("max", Math.max(number, getMax()));
            }
            minMaxStack.add(tmp);
            stack.add(number);
        }

        public int getMin() {
            return minMaxStack.get(minMaxStack.size() - 1).get("min");
        }

        public int getMax() {
            return minMaxStack.get(minMaxStack.size() - 1).get("max");
        }
    }
}
