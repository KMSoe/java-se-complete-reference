package com.kaungmyat.javase.chapter_15_lambda_expressions;

interface Predicate {
    boolean check(int n);
}

public class MethodRefDemo {
    public boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static void main(String[] args) {
        MethodRefDemo obj = new MethodRefDemo();
        Predicate pred = obj::isEven;
        System.out.println("Pred " + pred.check(4));
    }
}
