package com.kaungmyat.javase.chapter_07_classes_methods;

public class Sequence {
    void method1()
    {
        System.out.println("Method 1");
        method2();
        System.out.println("Method1 returned");
    }
    void method2()
    {
        System.out.println("Method 2");
        method3();
        System.out.println("Method2 returned");
    }
    void method3()
    {
        System.out.println("Method 3");
        System.out.println("Method 3 returned");
    }
    public static void main(String[] args) {
        Sequence s= new Sequence();
        s.method1();
    }
}
