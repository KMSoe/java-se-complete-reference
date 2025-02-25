package com.kaungmyat.javase.chapter21;

public class StringTokenizerDemo {
    public static void main(String[] args) {
        String str = "I go to school";
        String[] arr = str.split(" ");

        for (String item: arr) {
            System.out.println("Item: " + item);
        }
    }
}
