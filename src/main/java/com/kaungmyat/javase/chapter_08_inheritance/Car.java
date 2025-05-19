package com.kaungmyat.javase.chapter_08_inheritance;

public class Car {
    Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void start()
    {
        System.out.println("Car start");
        this.engine.start();
    }
}
