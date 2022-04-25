package com.moringajava;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CipherTest {
    @Test
    public void run_cipher_test(){
        Cipher cipher = new Cipher();
        DeCipher deCipher = new DeCipher();
        String input = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG".toLowerCase();
        String expectedOutput = cipher.encode(input, 20);
        assertEquals(deCipher.decode(expectedOutput, 20), input);
    }
}