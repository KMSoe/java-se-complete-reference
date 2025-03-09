package com.kaungmyat.javase.chapter_04_operators;

public class AssignmentOp {
    public static void main(String[] args) {
        int a;
        a = 10;

        System.out.println("A " + a);
        int b = 20;

        a = b; //copy
        b = 40;
        System.out.println("A " + a + " B " + b);
    }
}
