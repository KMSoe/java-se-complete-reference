package com.kaungmyat.javase.oodesign_principle;

class TightEngine {
    public void start() {
        System.out.println("Engine start");
    }
}

class TightCar {
    TightEngine engine = new TightEngine();

    void start() {
        System.out.println("car start");
        this.engine.start();
    }
}

public class TightCoupling {
    public static void main(String[] args) {
        TightCar car = new TightCar();
        car.start();
    }
}
