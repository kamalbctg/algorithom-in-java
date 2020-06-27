package org.algorithom.SuffixTrieConstruction;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    static class TrieNode {
        Map<Character, TrieNode> children = new HashMap<>();
    }

    static class SuffixTrie {
        TrieNode root = new TrieNode();
        char endSymbol = '*';

        public SuffixTrie(String str) {
            populateSuffixTrieFrom(str);
        }

        public void populateSuffixTrieFrom(String str) {
            for (int i = 0; i < str.length(); i++) {
                TrieNode node = root;
                for (int j = i; j < str.length(); j++) {
                    char letter = str.charAt(j);
                    if (!node.children.containsKey(letter)) {
                        node.children.put(letter, new TrieNode());
                    }
                    node = node.children.get(letter);
                }
                node.children.put(endSymbol, null);
            }
        }

        public boolean contains(String str) {
            TrieNode node = root;
            for (int i = 0; i < str.length(); i++) {
                char letter = str.charAt(i);
                if (!node.children.containsKey(letter)) return false;
                node = node.children.get(letter);
            }
            return node.children.containsKey(endSymbol);
        }
    }
}
