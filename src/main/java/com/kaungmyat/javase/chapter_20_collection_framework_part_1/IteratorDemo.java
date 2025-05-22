package com.kaungmyat.javase.chapter_20_collection_framework_part_1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(10);
        list.add(20);
        list.add(30);

        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()) {
            System.out.println("Next: " + iterator.next());
        }
    }
}
