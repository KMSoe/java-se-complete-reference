package com.kaungmyat.javase.chapter_05_control_statements;

public class ForLoopDemo {
    public static void main(String[] args) {
        int total = 0;

        for (int i = 1; //initialization
             i <= 10; //condition
             i++) {//step
            System.out.println("Loop " + i);
            total += i;

        }

        System.out.println("Total " + total);

        for (int i = 9; i >= 0; i--) {
            System.out.println("Loop Reverse " + i);
        }
    }
}
