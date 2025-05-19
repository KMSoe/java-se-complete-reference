package com.kaungmyat.javase.chapter_08_inheritance;

class GasEngine extends Engine
{
    GasEngine()
    {
        System.out.println("GasEngine contructor");
    }

    @Override
    void start()
    {
        System.out.println("GasEngine Engine start");
    }
}
class HighTechGasEngine extends GasEngine
{
    HighTechGasEngine()
    {
        System.out.println("HighTechGasEngine contructor");
    }
    @Override
    void start()
    {
        super.start();
        System.out.println("HighTechGasEngine Engine start");
    }
}

public class CarDemo {
    public static void main(String[] args) {
        Engine engine = new GasEngine();
        Car car = new Car(engine);

        car.start();
    }
}
