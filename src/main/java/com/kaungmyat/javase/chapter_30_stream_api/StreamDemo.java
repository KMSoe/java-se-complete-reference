package com.kaungmyat.javase.chapter_30_stream_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        Integer arr[] = {1, 2, 3, 4, 5};
        Stream<Integer> stream = Arrays.stream(arr);

        // Declarative
        Predicate<Integer> isEven = (n) -> n % 2 == 0;
        Stream<Integer> result = stream.filter(isEven);

        result.forEach(System.out::println);

        // Imperative
        ArrayList<Integer> result2 = new ArrayList<>();
        for (Integer item: arr) {
            if(isEven.test(item)) {
                result2.add(item);
            }
        }

        for (Integer item: result2) {
            System.out.println(item);
        }
    }
}
