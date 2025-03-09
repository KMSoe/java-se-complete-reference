package com.kaungmyat.javase.chapter_04_operators;

public class ShitOperator {
    public static void main(String[] args) {
        int a = 12;

        System.out.println("a 12 " + Integer.toBinaryString(a));
        System.out.println("a 12>>1 " + Integer.toBinaryString(a>>1));
        System.out.println("a 12>1 " + (a >> 1));

        System.out.println("a 12<<1 " + Integer.toBinaryString(a << 1));
        System.out.println("a 12<<1 " + (a << 1));
    }
}
