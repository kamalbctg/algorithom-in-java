package org.algorithom.PalindromeCheck;

public class Solution4 {
    //Time: O(n)
    //Space: O(n)
    public static boolean isPalindrome(String str) {
        return isPalindromeHelper(str, 0, str.length() - 1);
    }

    public static boolean isPalindromeHelper(String str, int left, int right) {
        if (left >= right) {
            return true;
        }
        return str.charAt(left) == str.charAt(right) &&
                isPalindromeHelper(str, left + 1, right - 1);
    }
}
