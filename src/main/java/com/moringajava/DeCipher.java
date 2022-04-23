package com.moringajava;

public class DeCipher {
    static String alphabet = "abcdefghijklmnopqrstuvwxyz";

    public static String decode(String message, int offset) {
        String plainText = "";
        message = message.toLowerCase();
        for (int i=0; i<message.length(); i++) {
            if (message.charAt(i) != ' ') {
                int currentChar = alphabet.indexOf(message.charAt(i));
                int newIndex = currentChar + offset;
                if (newIndex < 0) {
                    newIndex = 26 + newIndex;
                }
                char cipherChar = alphabet.charAt(newIndex);
                plainText = plainText + cipherChar;
            } else {
                plainText = plainText + " ";
            }
        }
        return plainText;
    }
}
