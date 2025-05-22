package com.kaungmyat.javase.chapter_20_collection_framework_part_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<Integer> first = new ArrayList<>();
        first.add(100);
        first.add(200);

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(10);
        list.add(20);
        list.add(30);

        list.add(1,50);
        list.set(3, 300);
        list.addAll(first);
        list.remove(Integer.valueOf(1)); // two sementics

        for(Integer item : list)
        {
            System.out.println("Item "+item);
        }

        list.add(40);

        System.out.println("Index 1 "+list.get(1));

        Collections.sort(list);

        System.out.println("Sorted");
        for(Integer item : list)
        {
            System.out.println("Item "+item);
        }

        Integer[] arr = new Integer[list.size()];
        arr = list.toArray(arr);
        list = List.of(arr);
    }
}
