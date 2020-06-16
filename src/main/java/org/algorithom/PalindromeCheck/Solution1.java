package org.algorithom.PalindromeCheck;

public class Solution1 {
    //Time: O(n^2) due to string concat
    //Space: O(n)
    public static boolean isPalindrome(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        return str.equals(reverse);
    }
}
