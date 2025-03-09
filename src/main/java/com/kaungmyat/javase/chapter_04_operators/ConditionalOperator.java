package com.kaungmyat.javase.chapter_04_operators;

import java.util.Scanner;

public class ConditionalOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter digit: ");
        int digit = scanner.nextInt();

        String result = (digit % 2) == 0 ? "Even": "Odd";
        System.out.println("Result: " + result);
    }
}
