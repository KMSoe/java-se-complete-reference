package com.kaungmyat.javase.designpattern.creational.factory;

public class FactoryDemo {
    public static void main(String[] args) {
        ConnectionFactory factory = new MySQLFactory();
        Connection conn = factory.createConnection();
        conn.open();
    }
}
