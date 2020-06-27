package org.algorithom.GroupAnagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution {
    public static List<List<String>> groupAnagrams(List<String> words) {
        if (words.size() == 0) return new ArrayList<>();

        List<String> sortedWords = new ArrayList<>();
        for (String word : words) {
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            sortedWords.add(new String(charArray));
        }

        List<Integer> indices = IntStream.range(0, words.size()).boxed().collect(Collectors.toList());
        indices.sort((a, b) -> sortedWords.get(a).compareTo(sortedWords.get(b)));

        List<List<String>> groupedAnagrams = new ArrayList<>();
        List<String> anagrams = new ArrayList<>();
        String group = sortedWords.get(indices.get(0));
        for (int index : indices) {
            String word = words.get(index);
            String sortedWord = sortedWords.get(index);
            if (group.equals(sortedWord)) {
                anagrams.add(word);
                continue;
            }
            groupedAnagrams.add(anagrams);
            anagrams = new ArrayList<>(Arrays.asList(word));
            group = sortedWord;
        }
        groupedAnagrams.add(anagrams);
        return groupedAnagrams;
    }
}
