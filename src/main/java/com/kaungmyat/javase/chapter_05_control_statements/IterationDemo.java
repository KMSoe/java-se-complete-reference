package com.kaungmyat.javase.chapter_05_control_statements;

public class IterationDemo {
    public static void main(String[] args) {
        int i = 0;//initialization

        while ( i < 3)//condition
        {
            System.out.println("Hello "+i);
            i++;//step
        }

        System.out.println("End of loop i = "+3);
    }
}
