package com.kaungmyat.javase.chapter_07_classes_methods;

class Outer
{
    int outerValue =10;

    void method()
    {
        Inner inner = new Inner();
        inner.innerMethod();

        System.out.println("Outervalue "+this.outerValue);
    }
    class Inner
    {
        int innerValue;
        void innerMethod()
        {
            outerValue++;
            System.out.println("Inner method");
        }
    }
}

public class InnerClassDemo {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.method();
    }
}
