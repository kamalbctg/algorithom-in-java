package org.algorithom.LongestPalindromicSubstring;

import java.util.Comparator;
import java.util.stream.Stream;

public class Solution {
    public static String longestPalindromicSubstring(String str) {
        int[] longest = new int[]{0, 1};

        for (int i = 1; i < str.length(); i++) {
            int[] odd = palindromicFrom(str, i - 1, i + 1);
            int[] even = palindromicFrom(str, i - 1, i);
            int[] tmpLongest = Stream.of(odd, even).max(Comparator.comparing(arr -> arr[1] - arr[0])).get();
            longest = Stream.of(longest, tmpLongest).max(Comparator.comparing(arr -> arr[1] - arr[0])).get();
        }
        return str.substring(longest[0], longest[1]);
    }

    private static int[] palindromicFrom(String str, int left, int right) {
        while (left >= 0 && right < str.length()) {
            if (str.charAt(left) != str.charAt(right)) {
                break;
            }
            left--;
            right++;
        }
        return new int[]{left + 1, right};
    }
}
