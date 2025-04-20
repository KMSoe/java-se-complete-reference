package com.kaungmyat.javase.chapter_30_stream_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class MapDemo {
    public static void main(String[] args) {
        Integer arr[] = {1,2,3,4,5};
        Stream<Integer> stream = Arrays.stream(arr);

        Function<Integer, Integer> toDouble = n -> n*2;
        Stream<Integer> result = stream.map(toDouble);

//        result.forEach(System.out::println);

        List<Integer> list = result.toList();
        list.forEach(System.out::println);
    }
}
