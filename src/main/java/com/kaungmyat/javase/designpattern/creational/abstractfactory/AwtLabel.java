package com.kaungmyat.javase.designpattern.creational.abstractfactory;

public class AwtLabel implements Label {
    @Override
    public void paint() {
        System.out.println("AWTLabel Paint");
    }
}
