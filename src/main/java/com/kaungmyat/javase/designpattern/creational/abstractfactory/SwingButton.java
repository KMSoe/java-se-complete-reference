package com.kaungmyat.javase.designpattern.creational.abstractfactory;

public class SwingButton implements Button {
    @Override
    public void paint() {
        System.out.println("Swing button paint");
    }
}
