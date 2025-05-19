package com.kaungmyat.javase.chapter_08_inheritance;

abstract public class Engine {
    Engine()
    {
        System.out.println("Engine contructor");
    }

    abstract void start();
}
