package com.kaungmyat.javase.chapter_09_packages_interfaces;

interface PrivateMethod {

    static void showLength(String str) {
        System.out.println("Length " + getLength(str));
    }

    static private int getLength(String str) {
        return str.length();
    }
}

public class PrivateMethodDemo {
    public static void main(String[] args) {
        PrivateMethod.showLength("Hello");
    }
}
