package org.algorithom.CaesarCipherEncryptor;

public class Solution1 {
    public static String caesarCypherEncryptor(String str, int key) {
        char[] encryptedChar = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            int encryptedCharCode = str.charAt(i) + (key % 26);
            if (encryptedCharCode <= 122)
                encryptedChar[i] = (char) encryptedCharCode;
            else {
                encryptedChar[i] = (char) (96 + encryptedCharCode % 122);
            }
        }
        return new String(encryptedChar);
    }
}
