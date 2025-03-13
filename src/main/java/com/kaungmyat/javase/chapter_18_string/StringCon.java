package com.kaungmyat.javase.chapter_18_string;

public class StringCon {
    public static void main(String[] args) {
        byte []bytes = {65,66,67,68};
        String str = new String(bytes);

        System.out.println("Str: " + str);
    }
}
