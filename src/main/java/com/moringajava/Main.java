package com.moringajava;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Cipher cipher = new Cipher();
        DeCipher deCipher = new DeCipher();
        System.out.println("Enter your message >> ");
        String message = scan.nextLine();
        System.out.println("Enter key >> ");
        int key = scan.nextInt();
        String cipherMessage = cipher.encode(message, key);
        String plainMessage = deCipher.decode(cipherMessage, key);
        System.out.println("The ciphered message is: " + cipherMessage + ", and the plain message is: " + plainMessage);
    }
}