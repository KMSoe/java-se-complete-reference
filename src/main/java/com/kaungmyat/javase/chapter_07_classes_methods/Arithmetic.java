package com.kaungmyat.javase.chapter_07_classes_methods;

public class Arithmetic {
    int add(int a, int b)
    {
        return a + b;
    }
    float add(float a, float b)
    {
        return a+b;
    }

    public static void main(String[] args) {
        Arithmetic arithmetic = new Arithmetic();
        int result = arithmetic.add(10, 2);
        System.out.println("Result: " + result);

        float result2 = arithmetic.add(1.2F, 2.3F);
        System.out.println("Result2: " + result2);
    }
}
