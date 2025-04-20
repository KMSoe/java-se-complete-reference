package com.kaungmyat.javase.designpattern.creational.abstractfactory;

public class SwingLabel implements Label{
    @Override
    public void paint() {
        System.out.println("SwingLabel Paint");
    }
}
