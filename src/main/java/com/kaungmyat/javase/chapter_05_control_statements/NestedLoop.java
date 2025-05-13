package com.kaungmyat.javase.chapter_05_control_statements;

public class NestedLoop {
    public static void main(String[] args) {
        System.out.println("Start");

        for (int i = 0; i < 3; i++) {
            System.out.println("Outer i ==> " + i);
            for (int j = 0; j < 5; j++) {
                System.out.println("Inner j " + j);
            }
        }

        System.out.println("Done");
    }
}
