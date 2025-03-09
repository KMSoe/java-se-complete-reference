package com.kaungmyat.javase.chapter_04_operators;

public class ShortCircuit {
    static boolean getTrue()
    {
        System.out.println("Get True");
        return true;
    }

    static boolean getFalse()
    {
        System.out.println("Get False");
        return false;
    }

    public static void main(String[] args) {
        System.out.println("Short circuit ");

        System.out.println("True && True " + (getTrue() && getTrue()));
        System.out.println("False && True " + (getFalse() && getTrue()));

        System.out.println("OR");
        System.out.println("False || True " + (getFalse() || getTrue()));
        System.out.println("True || False " + (getTrue() || getFalse()));

        System.out.println("Logical ");
        System.out.println("False & True " + (getFalse() & getTrue()));
    }
}
