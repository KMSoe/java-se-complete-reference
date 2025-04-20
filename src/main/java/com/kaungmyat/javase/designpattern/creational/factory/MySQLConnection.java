package com.kaungmyat.javase.designpattern.creational.factory;

public class MySQLConnection implements Connection{
    @Override
    public void open() {
        System.out.println("MySQl conneection is opened");
    }
}
