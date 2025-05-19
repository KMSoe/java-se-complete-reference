package com.kaungmyat.javase.chapter_08_inheritance;

public class Teacher extends Human {
    String subject;

    Teacher(String name, int age, String subject)
    {
        super(name,age);
        this.subject = subject;
    }

    @Override
    public void work()
    {
        System.out.println("Tr "+this.name +" teach student ");
    }
}
