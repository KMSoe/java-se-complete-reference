package com.kaungmyat.javase.chapter_08_inheritance;

class ParentBase extends Object
{
    int x;

    void method()
    {
        System.out.println("Base Method");
        this.another();
    }
    void another()
    {
        System.out.println("Base another");
    }
}

class Child extends ParentBase {
    int x;
    Child(int x)
    {
        this.x = x;
    }
    void another()
    {
        System.out.println("Child Another");
    }
}

public class Shawdow {
    public static void main(String[] args) {
        ParentBase b = new Child(10);
        System.out.println("B.x "+b.x);

        b.method();
    }
}
