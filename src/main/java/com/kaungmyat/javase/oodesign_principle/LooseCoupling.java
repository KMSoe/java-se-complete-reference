package com.kaungmyat.javase.oodesign_principle;

class Engine {
    public void start() {
        System.out.println("Engine start");
    }
}

class DieselEngine extends Engine {
    public void start() {
        System.out.println("DieselEngine start");
    }
}

class Car {
    Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        System.out.println("Car start");
        this.engine.start();
    }
}

public class LooseCoupling {
    public static void main(String[] args) {
        Engine engine = new DieselEngine();
        Car car = new Car(engine);
        car.start();
    }
}
