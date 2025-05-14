package com.kaungmyat.javase.chapter_07_classes_methods;

class StaticTestData
{
    int value;
    static int counter;

    static
    {
        System.out.println("Static Initializer 1");
    }
    static{
        System.out.println("Static Initializer 2");
    }
    public StaticTestData(int value)
    {
        System.out.println("Data Constructor");
        this.value = value;

        //this.counter++;
        StaticTestData.counter++;
    }
    static void hello()
    {
        System.out.println("Hello static");
    }
    static void anotherStatic()
    {
        System.out.println("Another static");
        //normal();
        //value++;
    }

    void normal()
    {
        System.out.println("Non static");
        hello();
    }
}

public class StaticDemo {
    public static void main(String[] args) {
        StaticTestData obj = new StaticTestData(100);
        StaticTestData obj2 = new StaticTestData(200);

        obj.value++;
        System.out.println("Obj "+obj.value);
        System.out.println("Ojb2 "+obj2.value);

        System.out.println("Obj1.counter "+obj.counter);
        System.out.println("Obj2.counter "+obj2.counter);

        System.out.println("Data.counter "+StaticTestData.counter);

        obj.normal();

        StaticTestData.anotherStatic();
    }
}
