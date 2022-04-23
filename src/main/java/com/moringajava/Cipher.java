package com.moringajava;

public class Cipher {
    static String alphabet = "abcdefghijklmnopqrstuvwxyz";

    public static String encode(String message, int offset) {
        String cipherText = "";
        message = message.toLowerCase();
        for (int i=0; i<message.length(); i++) {
            if (message.charAt(i) != ' ') {
                int currentChar = alphabet.indexOf(message.charAt(i));
                int newIndex = currentChar + offset;
                if (newIndex > 25) {
                    newIndex = newIndex - 26;
                }
                char cipherChar = alphabet.charAt(newIndex);
                cipherText = cipherText + cipherChar;
            } else {
                cipherText = cipherText + " ";
            }
        }
        return cipherText;
    }
}
