package com.kaungmyat.javase.chapter_19_java_lang;

import java.lang.reflect.Field;

class Human
{
    String name;
    int age;

    public Human(String name,int age)
    {
        this.name = name;
        this.age = age;
    }
}
class Another
{
    String data;
}

public class ReflectionDemo {
    public static void printFields(Object obj)
    {
        Class clazz = obj.getClass();
        System.out.println("Class "+clazz.getName());

        Field[] fields = clazz.getDeclaredFields();
        for(Field field : fields)
        {
            System.out.println("Name "+field.getName() + " Type "+field.getType());
        }

    }

    public static void main(String[] args) {
        Human h = new Human("Kaung Myat",25);
        Another another = new Another();

        printFields(h);
        printFields(another);
    }
}
