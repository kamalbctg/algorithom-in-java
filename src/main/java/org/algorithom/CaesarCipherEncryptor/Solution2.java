package org.algorithom.CaesarCipherEncryptor;

public class Solution2 {
    // T: O(n) S: O(n)
    public static String caesarCypherEncryptor(String str, int key) {
        String alphabets = "abcdefghijklmnopqrstuvwxyz";
        char[] encryptedChar = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            int encryptedCharCode = alphabets.indexOf(str.charAt(i)) + (key % 26);
            if (encryptedCharCode <= 25)
                encryptedChar[i] = alphabets.charAt(encryptedCharCode);
            else {
                encryptedChar[i] =alphabets.charAt(-1 + encryptedCharCode % 25);
            }
        }
        return new String(encryptedChar);
    }
}
