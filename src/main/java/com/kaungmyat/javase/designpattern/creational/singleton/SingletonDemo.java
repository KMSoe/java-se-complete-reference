package com.kaungmyat.javase.designpattern.creational.singleton;

import java.awt.*;

public class SingletonDemo {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getSingleton();
        Singleton another = Singleton.getSingleton();

        //new Singleton();
        System.out.println("Singleton " + (singleton == another));

        Toolkit tk1 = Toolkit.getDefaultToolkit();
        Toolkit tk2 = Toolkit.getDefaultToolkit();

        System.out.println("Toolkit "+(tk1==tk2));

        Runtime rt1 = Runtime.getRuntime();
        Runtime rt2 = Runtime.getRuntime();
        System.out.println("Rt1 == rt2 " + (rt1 == rt2));
    }
}
