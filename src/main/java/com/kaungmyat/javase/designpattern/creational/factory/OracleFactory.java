package com.kaungmyat.javase.designpattern.creational.factory;

public class OracleFactory extends ConnectionFactory{
    @Override
    Connection createConnection() {
        return new OracleConnection();
    }
}
