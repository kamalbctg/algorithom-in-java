package org.algorithom.PalindromeCheck;

public class Solution2 {
    //Time: O(n)
    //Space: O(n)
    public static boolean isPalindrome(String str) {
        StringBuilder reverse = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse.append(str.charAt(i));
        }
        return str.equals(reverse.toString());
    }
}
