package com.kaungmyat.javase.chapter_04_operators;

import java.util.Scanner;

public class Exam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter myan ");
        int myan = scanner.nextInt();

        System.out.println("Enter english ");
        int eng = scanner.nextInt();

        System.out.println("Enter math ");
        int math = scanner.nextInt();

        boolean isPass = (myan>=40 && eng>=40 && math>=40);

        System.out.println("Is exam pass "+isPass);

        boolean gotDistinction = isPass && (myan>=80 || eng>=80 || math>=80);
        System.out.println("GotDistinction "+ gotDistinction);
    }
}
