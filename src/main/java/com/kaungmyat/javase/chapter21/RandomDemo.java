package com.kaungmyat.javase.chapter21;

import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            System.out.println("Random int: " + (30 + random.nextInt(21)));
        }
    }
}
