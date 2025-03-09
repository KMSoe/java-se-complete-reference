package com.kaungmyat.javase.chapter_04_operators;

public class ArithmeticDemo {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;
//        int c = ++a;

//        System.out.println("C " + c);
        System.out.println("A "+ a);
        System.out.println("A " + a + " B " + b);
        System.out.println(" + " + (a + b));
        System.out.println(" - " + (a - b));
        System.out.println(" * " + (a * b));
        System.out.println(" / " + (a / b));
        System.out.println(" / " + (a / 2.0F));
        System.out.println(" % " + (a % b));

        System.out.println("+a "+ (+a) );
    }
}
