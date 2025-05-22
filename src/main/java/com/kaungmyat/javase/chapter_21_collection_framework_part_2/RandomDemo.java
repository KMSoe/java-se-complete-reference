package com.kaungmyat.javase.chapter_21_collection_framework_part_2;

import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            System.out.println("Random int: " + (30 + random.nextInt(21)));
        }
    }
}
