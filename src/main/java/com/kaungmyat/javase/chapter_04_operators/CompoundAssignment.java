package com.kaungmyat.javase.chapter_04_operators;

public class CompoundAssignment {
    public static void main(String[] args) {
        int a = 5;
        int b= 10;

        a += b + 2; // a = (a+b+2)
        System.out.println("A: " + a);

        float f = a;
        //a = f;
        a += f;
        System.out.println("A: " + a);
    }
}
