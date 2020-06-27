package org.algorithom.LongestPalindromicSubstring;

import java.util.Comparator;
import java.util.stream.Stream;

public class Solution {
    public static String longestPalindromicSubstring(String str) {
        int[] longest = new int[]{0, 1};
        for (int i = 1; i < str.length(); i++) {
            int[] odd = longestPalindromicSubstringHelper(str, i - 1, i + 1);
            int[] even = longestPalindromicSubstringHelper(str, i - 1, i);
            longest = Stream.of(longest, odd, even).max(Comparator.comparing(n -> n[1] - n[0])).get();
        }
        return str.substring(longest[0], longest[1]);
    }

    private static int[] longestPalindromicSubstringHelper(String str, int l, int r) {
        while (l >= 0 && r < str.length()) {
            if (str.charAt(l) != str.charAt(r)) {
                break;
            }
            l--;
            r++;
        }
        return new int[]{l + 1, r};
    }


}
