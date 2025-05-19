package com.kaungmyat.javase.chapter_08_inheritance;

class ParentBaseTest
{
    static void method()
    {
        System.out.println("Base");
    }
}
class ChildBaseTest extends ParentBaseTest
{
    static void method()
    {
        System.out.println("Child");
    }
}

public class InvalidPolymorphism {
    public static void main(String[] args) {
        ParentBaseTest b = new ChildBaseTest();
        b.method();
    }
}
