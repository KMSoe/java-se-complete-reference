package com.kaungmyat.javase.chapter_15_lambda_expressions;

interface Factory {
    Human build(String name);
}

class Human
{
    String name;
    public Human(String name)
    {
        this.name = name;
        System.out.println("Human Constructor");
    }
}
class Teacher extends Human
{
    public Teacher(String name)
    {
        super(name);
        System.out.println("Teacher Constructor");
    }
}
class Doctor extends Human
{
    public Doctor(String name)
    {
        super(name);
        System.out.println("Doctor Constructor");
    }
}

public class ConstructorRef {
    public static void main(String[] args) {
        Factory factory = Human::new;
        Human h = factory.build("Human");

        factory = Doctor::new;
        h = factory.build("Dr Someone");
    }
}
