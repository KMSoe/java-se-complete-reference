package com.kaungmyat.javase.designpattern.creational.abstractfactory;

public class AwtButton implements Button {
    @Override
    public void paint() {
        System.out.println("AwtButton  paint");
    }
}
