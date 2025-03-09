package com.kaungmyat.javase.chapter_04_operators;

public class BooleanLogicalOpDemo {
    public static void main(String[] args) {
        boolean isRaining = true;
        boolean haveToGoOut = true;

        if( isRaining && haveToGoOut)
        {
            System.out.println("Take umbrealla");
        }
        else
        {
            System.out.println("Do not need to take umbrella");
        }

        System.out.println("AND ");
        System.out.println("false && false " + (false && false));
        System.out.println("false && true " + (false && true));
        System.out.println("true && false " + (true && false));
        System.out.println("true && true " + (true && true));

        System.out.println("Or ");
        System.out.println("false || false " + (false || false));
        System.out.println("false || true " + (false || true));
        System.out.println("true || false " + (true || false));
        System.out.println("true || true " + (true || true));

        System.out.println("Not ");
        System.out.println("!true " + (!true));
        System.out.println("!false " + (!false));

        boolean result = false;
        result |= true;

        System.out.println("Result " + result);
    }
}
