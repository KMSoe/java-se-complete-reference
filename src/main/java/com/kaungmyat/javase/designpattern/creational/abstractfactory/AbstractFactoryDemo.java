package com.kaungmyat.javase.designpattern.creational.abstractfactory;

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        UIFactory uiFactory = new AwtFactory();
        Button button = uiFactory.createButton();
        button.paint();

        Label label = uiFactory.createLabel();
        label.paint();
    }
}
