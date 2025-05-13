package com.kaungmyat.javase.chapter_05_control_statements;

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

        if( myan >= 40 && eng >= 40 && math >= 40)
        {
            System.out.println("Pass");
            if( myan >= 80)
            {
                System.out.println("Got distinction in Myan");
            }
            if(eng >= 80)
            {
                System.out.println("Got distinction in Eng");
            }
            if(math >= 80)
            {
                System.out.println("Got distinction in Math");
            }
        }
        else
        {
            System.out.println("Fail");
        }

        System.out.println("Done");
    }
}
