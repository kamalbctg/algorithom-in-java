package org.algorithom.SuffixTrieConstruction;

import java.util.HashMap;
import java.util.Map;

public class Solution2 {

    static class TrieNode {
        Map<Character, TrieNode> children = new HashMap<>();
        boolean isWord;
    }

    static class SuffixTrie {
        TrieNode root = new TrieNode();

        public SuffixTrie(String str) {
            populateSuffixTrieFrom(str);
        }

        public void populateSuffixTrieFrom(String str) {
            for(int i =0; i< str.length(); i++){
                prepareFrom(i, str);
            }
        }

        private void prepareFrom(int idx, String str) {
            TrieNode node = root;
            for (int i = idx; i < str.length(); i++){
                Character c = str.charAt(i);
                if (!node.children.containsKey(c)){
                    node.children.put(c, new TrieNode());
                }
                node = node.children.get(c);
            }
            node.isWord = true;
        }

        public boolean contains(String str) {
            TrieNode node = root;
            for (int i = 0; i < str.length(); i++){
                Character c = str.charAt(i);
                if(!node.children.containsKey(c)) return false;
                node=node.children.get(c);
            }
           return node.isWord;
        }
    }
}
