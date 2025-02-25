package com.kaungmyat.javase.chapter20;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

// No Duplicate
// Set - no order
public class SetDemo {
    public static void main(String[] args) {
        SortedSet<Integer> set = new TreeSet<>();
        set.add(1);
        set.add(3);
        set.add(2);
        set.add(1);

        for(Integer item : set)
        {
            System.out.println("Item "+item);
        }

        System.out.println("Has 1 "+set.contains(1));
    }
}
