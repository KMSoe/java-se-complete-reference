package com.kaungmyat.javase.chapter_14_generics;

import java.util.ArrayList;

public class CollectionDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);

        for (Integer item: list) {
            System.out.println("item: " + item);
        }

        ArrayList rawList  = new ArrayList();
        rawList.add("String");
        rawList.add(12);
    }
}
