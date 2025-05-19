package com.kaungmyat.javase.chapter_09_packages_interfaces;

import com.kaungmyat.javase.chapter_08_inheritance.Car;
import com.kaungmyat.javase.chapter_08_inheritance.DieselEngine;
import com.kaungmyat.javase.chapter_08_inheritance.Engine;

import java.util.Date;

public class PackageDemo {
    public static void main(String[] args) {
        Engine engine = new DieselEngine();
        Car car = new Car(engine);

        car.start();

        Date d = new Date();
        System.out.println("Date: " + d);
    }
}
