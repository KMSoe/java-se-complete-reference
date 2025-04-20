package com.kaungmyat.javase.designpattern.creational.prototype;

public class PrototypeDemo {
    public static void main(String[] args) {
        HeavyObject compObj = new HeavyObject();
        HeavyObject another = compObj.reproducce();

        System.out.println(another);
        System.out.println("compObj == another: " + (compObj == another));
    }
}
