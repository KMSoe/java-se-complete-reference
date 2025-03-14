package com.kaungmyat.javase.chapter_17_record_switch;

public record HumanRecord(String name, int age) {
    //canonoical constructor
    /*
    public HumanRecord(String name, int age)
    {
        this.name = name.trim();
        this.age = age;
    }
    */
    //compact constructor
    public HumanRecord
    {
        name = name.trim();
    }

    public HumanRecord(String name)
    {
        this(name,0);
    }

    String nameInUpperCase()
    {
        return this.name.toUpperCase();
    }
}
