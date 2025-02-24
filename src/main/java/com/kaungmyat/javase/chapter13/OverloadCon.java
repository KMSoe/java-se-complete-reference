package com.kaungmyat.javase.chapter13;

class Human{
    String name;
    int age;

    Human(String name, int age)
    {
        this.name = name;
        this.age = age;
        System.out.println("Human 2 arg constructor");
    }

    Human(String name) {
        this(name, 0); // constructor call - first line
        System.out.println("Human 1 arg constructor");
    }
}
public class OverloadCon {
    public static void main(String[] args) {
        Human h = new Human("KMS");
    }
}
