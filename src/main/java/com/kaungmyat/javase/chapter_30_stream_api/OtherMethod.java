package com.kaungmyat.javase.chapter_30_stream_api;

import java.util.ArrayList;

public class OtherMethod {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(-10);
        list.add(20);
        list.add(30);
        list.add(30);
        list.add(50);

        System.out.println("Distinct: ");
        list.stream().distinct().forEach(System.out::println);

        boolean allEven = list.stream()
                .allMatch((n)->n%2==0);
        System.out.println("All even: " + allEven);

        boolean someEven = list.stream()
                .anyMatch((n)->n%2==0);
        System.out.println("Some even: " + someEven);
    }
}
