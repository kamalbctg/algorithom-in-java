package org.algorithom.PalindromeCheck;

public class Solution4 {
    //Time: O(n)
    //Space: O(n)
    public static boolean isPalindrome(String str) {
        return isPalindromeHelper(str, 0, str.length() - 1);
    }

    private static boolean isPalindromeHelper(String str, int l, int r) {
        if (l >= r) return true;
        return str.charAt(l) == str.charAt(r) && isPalindromeHelper(str, ++l, --r);
    }

}
