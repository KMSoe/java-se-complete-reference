package com.kaungmyat.javase.chapter_18_string;

public class ImmutableDemo {
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println("Str uppercase " + str.toUpperCase());
        System.out.println("Str " + str);

        str = "";
        double start = System.currentTimeMillis();

        for (int i = 0; i < 100_000; i++) {
            str += i;
        }

        double end = System.currentTimeMillis();
        double time = end - start;
        System.out.println("Time: " + time);
    }
}
