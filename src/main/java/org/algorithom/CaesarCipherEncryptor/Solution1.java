package org.algorithom.CaesarCipherEncryptor;

public class Solution1 {
    public static String caesarCypherEncryptor(String str, int key) {
        char[] encryptChars = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            int encryptCharCode = str.charAt(i) + (key % 26); //wrap key between 26
            if (encryptCharCode <= 122) {
                encryptChars[i] = (char) encryptCharCode;
            } else {
                encryptChars[i] = (char) (96 + encryptCharCode % 122); // wrap between a-z or 97 - 122
            }

        }
        return new String(encryptChars);
    }
}
