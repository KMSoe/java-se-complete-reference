package com.kaungmyat.javase.chapter_08_inheritance;

public class Human {
    String name;
    int age;

    Human(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    final public void eat()
    {
        System.out.println(this.name +" eat ");
    }

    public void work()
    {
        System.out.println(this.name +" work ");
    }
}
