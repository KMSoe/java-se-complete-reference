package com.kaungmyat.javase.designpattern.creational.factory;

public class OracleConnection implements Connection{
    @Override
    public void open() {
        System.out.println("Oracle Connection is opened");
    }
}
