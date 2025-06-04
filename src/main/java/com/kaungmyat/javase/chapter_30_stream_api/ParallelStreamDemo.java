package com.kaungmyat.javase.chapter_30_stream_api;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class ParallelStreamDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(50);

        List<Integer> list1 = list.parallelStream()
                .map(x-> x * 2)
                .collect(Collectors.toList());
        list1.forEach(System.out::println);

        Iterator<Integer> iterator = list.stream().iterator();

        while(iterator.hasNext())
        {
            System.out.println("Next: " + iterator.next());
        }
    }
}
