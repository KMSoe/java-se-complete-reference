package com.kaungmyat.javase.chapter_03_data_types_variables_array;

public class ScopeDemo {
    public static void main(String[] args) {
        int c = 5;

        {
            int a = 10;
            System.out.println("A is " + a);
        }

        String a = "Hello";
        System.out.println("C is " + c);
        System.out.println("A " + a);
    }
}
