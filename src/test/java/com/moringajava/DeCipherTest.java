package com.moringajava;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeCipherTest {
    @Test
    public void run_decipher_test(){
        DeCipher deCipher = new DeCipher();
        String input = "nby kocwe vliqh zir dogjm ipyl nby futs xia";
        String plainText = deCipher.decode(input, 20);
        String expectedOutput = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG".toLowerCase();
        assertEquals(expectedOutput, plainText);
    }
}