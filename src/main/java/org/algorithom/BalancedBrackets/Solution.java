package org.algorithom.BalancedBrackets;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public static boolean balancedBrackets(String str) {
        String openingBrackets = "({[";
        String closingBrackets = "]})";
        Map<Character, Character> closingMatches = new HashMap<>();
        closingMatches.put(')', '(');
        closingMatches.put('}', '{');
        closingMatches.put(']', '[');
        List<Character> stack = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            char letter = str.charAt(i);
            if (openingBrackets.indexOf(letter) != -1) {
                stack.add(letter);
            } else {
                if (stack.size() == 0) return false;  // no opening bracket
                if (stack.get(stack.size() - 1) == closingMatches.get(letter)) {  // last element closing Matches
                    stack.remove(stack.size() - 1);
                } else {
                    return false;
                }
            }
        }
        return stack.size() == 0;
    }
}
