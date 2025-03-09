package com.kaungmyat.javase.chapter_04_operators;

public class BitwiseDemo {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;

        System.out.println("A " + Integer.toBinaryString(a));
        System.out.println("B " + Integer.toBinaryString(b));
        System.out.println("A & B " + Integer.toBinaryString(a & b));
        System.out.println("A | B " + Integer.toBinaryString(a | b));
        System.out.println("A ^ B " + Integer.toBinaryString(a ^ b));
        System.out.println("~A " + Integer.toBinaryString(~a));
    }
}
