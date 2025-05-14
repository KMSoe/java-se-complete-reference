package com.kaungmyat.javase.chapter_07_classes_methods;

public class Wrapper {
    public static void main(String[] args) {
        Integer int1 = 100;
        Integer int2 = 100;

        // cache until 128
        System.out.println("int1 == int2 "+(int1==int2));

        Integer c = 400;
        Integer d= 400;
        System.out.println("C== d "+(c==d));
    }
}
