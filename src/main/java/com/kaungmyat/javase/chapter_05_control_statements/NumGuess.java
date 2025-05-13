package com.kaungmyat.javase.chapter_05_control_statements;

import java.util.Random;
import java.util.Scanner;

public class NumGuess {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int num = random.nextInt(10);
        //System.out.println("Num "+num);
        int guess ;


        do{
            System.out.println("Enter num");
            guess = scanner.nextInt();

            if (guess < num)
            {
                System.out.println("Too small");
            }
            if(guess > num)
            {
                System.out.println("Too large");
            }
        }while (num != guess);
        System.out.println("Correct");
    }
}
