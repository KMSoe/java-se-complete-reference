package com.kaungmyat.javase.chapter_03_data_types_variables_array;

public class CharacterDemo {
    public static void main(String[] args) {
        char ch = 'A';
        ch++;
        ch /= 2;
        System.out.println("Ch "+ch);

        boolean isRaining = false;

        if(isRaining) {
            System.out.println("Take umbrealla");
        } else {
            System.out.println("Do not take umbrella");
        }
    }
}
