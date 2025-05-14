package com.kaungmyat.javase.chapter_07_classes_methods;

public class OverloadDemo {
    static void print(short a)
    {
        System.out.println("Short version "+a);
    }
    static void print(int a)
    {
        System.out.println("Integer version "+a);
    }
    static void print(long a)
    {
        System.out.println("Byte version "+a);
    }
    /*
    static int print(long a)
    {
    }*/
    public static void main(String[] args) {
        byte b = 10;
        print(b);
    }
}
