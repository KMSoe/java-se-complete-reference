package com.kaungmyat.javase.chapter_03_data_types_variables_array;

public class IntegerTypeDemo {
    public static void main(String[] args) {
        // byte (2 ^ 8), short (2 ^ 16), int (2 ^ 32), long (2 ^ 64)

        byte b = 127;

        b++;
        System.out.println("B " + b);

        short d = -32768;
        d--;
        System.out.println("D is " + d);

        int e =-2147483648;
        e--;
        System.out.println("E is " + e);

        long l = 100_000;
        System.out.println("One lakh " + l);
    }
}
