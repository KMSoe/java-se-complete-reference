package com.kaungmyat.javase.chapter_09_packages_interfaces;

interface A
{
    void methodA();
}
interface B
{
    void methodB();
}
interface C extends A,B
{
    void methodC();
}
interface D
{
    void methodC();
    void methodD();
}
class MyClass implements C,D
{

    @Override
    public void methodB() {
        System.out.println("Method B");
    }

    @Override
    public void methodA() {
        System.out.println("Method A");
    }

    @Override
    public void methodC() {
        System.out.println("Method C");
    }
    @Override
    public void methodD() {
        System.out.println("Method D");
    }
}

public class InterfaceInheritance {
}
