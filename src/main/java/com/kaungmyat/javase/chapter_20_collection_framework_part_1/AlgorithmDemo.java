package com.kaungmyat.javase.chapter_20_collection_framework_part_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AlgorithmDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(3);
        list.add(5);
        list.add(10);

        Collections.sort(list);
        System.out.println("Sorted ");
        for(Integer item : list)
        {
            System.out.println("Item "+item);
        }

        int index = Collections.binarySearch(list, 5);
        System.out.println("Index "+index);

        Collections.shuffle(list);
        System.out.println("Shuffle ");
        for(Integer item : list)
        {
            System.out.println("Item "+item);
        }

        Integer min = Collections.min(list);
        Integer max = Collections.max(list);
        System.out.println("Min "+min + " Max "+max);
    }
}
