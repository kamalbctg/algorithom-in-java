package org.algorithom.CaesarCipherEncryptor;

public class Solution2 {
    // T: O(n) S: O(n)
    public static String caesarCypherEncryptor(String str, int key) {
        String alphabets = "abcdefghijklmnopqrstuvwxyz";
        char[] encryptChars = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            int encryptCharCode = alphabets.indexOf(str.charAt(i)) + (key % 26); //wrap key between 0-25
            if (encryptCharCode <= 25) {
                encryptChars[i] =  alphabets.charAt(encryptCharCode);
            } else {
                encryptChars[i] = alphabets.charAt(-1 + encryptCharCode % 25); // wrap between a-z or 0 - 25
            }
        }
        return new String(encryptChars);
    }
}
