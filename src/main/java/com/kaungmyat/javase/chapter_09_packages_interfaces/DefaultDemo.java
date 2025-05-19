package com.kaungmyat.javase.chapter_09_packages_interfaces;

interface MyInterface
{
    int getNumber();

    default String getString()
    {
        return "Hello World";
    }
    static void hello()
    {
        System.out.println("Hello");
    }
}
class Implementation implements MyInterface
{

    @Override
    public int getNumber() {
        return 100;
    }
}

public class DefaultDemo {
    public static void main(String[] args) {
        MyInterface myInterface = new Implementation();
        System.out.println("Num: " + myInterface.getNumber());
        System.out.println("String: " + myInterface.getString());

        MyInterface.hello();

        System.out.println("Math " + Math.max(10, 2));
    }
}
