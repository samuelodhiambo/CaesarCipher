package com.moringajava;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CipherTest {
    @Test
    public void run_cipher_test(){
        String input = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
        String cipherText = Cipher.encode(input, 20);
        String expectedOutput = "nby kocwe vliqh zir dogjm ipyl nby futs xia";
        assertEquals(expectedOutput, cipherText);
    }
}