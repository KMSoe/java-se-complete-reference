package com.kaungmyat.javase.chapter_22_io;

import java.io.Serializable;

public class Human implements Serializable {
    String name;
    int age;
    String address;

    Human(String name,int age , String address)
    {
        this.name= name;
        this.age = age;
        this.address = address;
    }
}
