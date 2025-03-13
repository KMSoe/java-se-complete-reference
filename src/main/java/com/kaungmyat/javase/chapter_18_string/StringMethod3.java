package com.kaungmyat.javase.chapter_18_string;

public class StringMethod3 {
    public static void main(String[] args) {
        String str = "hello world";

        System.out.println("str toUpper " + str.toUpperCase());
        System.out.println("str toLower " + str.toLowerCase());
        System.out.println("str " + str);

        String str2 = String.join(";", "Hello","World");
        System.out.println("str2 " + str2);

        String[] arr = str2.split(";");
        for(String item : arr)
        {
            System.out.println("Item " + item);
        }
    }
}
