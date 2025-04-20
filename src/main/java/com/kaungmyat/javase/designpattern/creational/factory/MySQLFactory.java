package com.kaungmyat.javase.designpattern.creational.factory;

public class MySQLFactory extends ConnectionFactory{
    @Override
    Connection createConnection() {
        return new MySQLConnection();
    }
}
