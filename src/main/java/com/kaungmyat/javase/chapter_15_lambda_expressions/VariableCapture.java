package com.kaungmyat.javase.chapter_15_lambda_expressions;

interface MyFunc {
    int process();
}

public class VariableCapture {
    public static void main(String[] args) {
        int counter = 0;
        MyFunc myFunc = () -> counter + 1;

        System.out.println("Func: " + myFunc.process());
    }
}
