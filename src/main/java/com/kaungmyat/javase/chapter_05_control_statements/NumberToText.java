package com.kaungmyat.javase.chapter_05_control_statements;

import java.util.Scanner;

public class NumberToText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter num ");
        int num = scanner.nextInt();

        /*
        if(num ==0)
        {
            System.out.println("Zero");
        }
        else if(num == 1)
        {
            System.out.println("One");
        }
        else if(num == 2)
        {
            System.out.println("Two");
        }
        */
        switch( num )
        {
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
            case 4:
                System.out.println("Three or 4");
                break;
            default:
                System.out.println("Others");
        }

        System.out.println("Done");

    }
}