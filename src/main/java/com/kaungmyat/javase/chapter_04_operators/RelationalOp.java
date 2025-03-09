package com.kaungmyat.javase.chapter_04_operators;

import java.util.Scanner;

public class RelationalOp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter mark: ");

        int mark = scanner.nextInt();
        boolean pass = mark >= 40;

        System.out.println("Pass "+pass);

        double a = 10;
        int b = 20;
        System.out.println("A " + a + " B " + b);
        System.out.println(" a > b " + (a > b));
        System.out.println(" a < b " + (a < b));
        System.out.println(" a >= b " + (a >= b));
        System.out.println(" a <= b " + (a <= b));

        a = Double.NaN;
        System.out.println("A " + a + " B " + b);
        System.out.println(" a > b " + (a > b));
        System.out.println(" a < b " + ( a < b));
        System.out.println(" a >= b " + (a >= b));
        System.out.println(" a <= b "+ (a <= b));
    }
}
