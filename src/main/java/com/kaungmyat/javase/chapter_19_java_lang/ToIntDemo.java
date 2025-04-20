package com.kaungmyat.javase.chapter_19_java_lang;

public class ToIntDemo {
    public static void main(String[] args) {
        String data = " 123 ".trim();
        int intData = Integer.parseInt(data);
        System.out.println("IntData: " + intData);

        float floatData = Float.parseFloat(data);
        System.out.println("Float " + floatData);

        String str ="တောသားကြီး";
        System.out.println("str " + str);
        System.out.println("Length " + str.length());
    }
}
