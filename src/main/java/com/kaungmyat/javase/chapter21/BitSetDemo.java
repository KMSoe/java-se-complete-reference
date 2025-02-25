package com.kaungmyat.javase.chapter21;

import java.util.BitSet;

public class BitSetDemo {
    public static void main(String[] args) {
        BitSet bitSet = new BitSet(10);
        bitSet.set(0);
        bitSet.set(8);
        System.out.println("Bit Set: " + bitSet);
    }
}
