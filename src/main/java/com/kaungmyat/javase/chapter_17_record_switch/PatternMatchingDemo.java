package com.kaungmyat.javase.chapter_17_record_switch;

public class PatternMatchingDemo {
    public static void main(String[] args) {
        Number num = Float.valueOf(2);

        if(num instanceof Integer) {
            System.out.println("Num is integer");
        }  else if(num instanceof Float f) {
            System.out.println("Num is float");

            System.out.println("F " + f);
        }

        Object[] list = {
                "Alpha",
                "Beta",
                "Theta",
                Integer.valueOf(100),
                "Gamma",
        };
        for (int i = 0;(list[i] instanceof String str) && i < list.length; i++) {
            System.out.println("Str " + str);
        }

    }
}
