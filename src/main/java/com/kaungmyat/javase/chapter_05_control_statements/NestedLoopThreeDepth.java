package com.kaungmyat.javase.chapter_05_control_statements;

public class NestedLoopThreeDepth {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.println("I ===> " + i);

            for (int j = 0; j < 4; j++) {

                System.out.println("Hello World");
                System.out.println("J ====> " + j);

                for (int k = 0; k < 5; k++) {
                    System.out.println("K =====> " + j);
                }
            }
        }
    }
}
