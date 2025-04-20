package com.kaungmyat.javase.designpattern.creational.abstractfactory;

public class AwtFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new AwtButton();
    }

    @Override
    public Label createLabel() {
        return new AwtLabel();
    }
}
