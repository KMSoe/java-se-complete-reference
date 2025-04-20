package com.kaungmyat.javase.chapter_19_java_lang;

public class MathDemo {
    static double degreeToRadian(int degree)
    {
        return degree* Math.PI/180;
    }

    public static void main(String[] args) {
        System.out.println("Sin 90: " + Math.sin(degreeToRadian(90)));
    }
}
