package com.kaungmyat.javase.chapter_18_string;

public class StringDemo {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = """
                      Hello
        """;
        String str3 = "Hello";
        String str4 = new String("Hello");

        System.out.println("str1 == str2 " + (str1 == str2));
        System.out.println("str1 == str3 " + ( str1 == str3));
        System.out.println("str3 == str4 " + (str3 == str4));
    }
}
