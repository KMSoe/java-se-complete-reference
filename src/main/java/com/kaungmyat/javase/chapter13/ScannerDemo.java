package com.kaungmyat.javase.chapter13;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name ");
        String name = scanner.next();

        System.out.println("Enter your age");
        int age = scanner.nextInt();

        System.out.println("Name is "+name+ ". Age is "+age);
    }
}
