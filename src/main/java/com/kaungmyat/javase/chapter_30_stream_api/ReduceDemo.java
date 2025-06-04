package com.kaungmyat.javase.chapter_30_stream_api;

import java.util.Arrays;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class ReduceDemo {
    public static void main(String[] args) {
        Integer arr[] = {1,2,-3,4,5};
        Stream<Integer> stream = Arrays.stream(arr);

        BinaryOperator<Integer> sum=(a,b)->{
            System.out.println("A "+a + " B "+b);
            return a+b;
        };
        Optional<Integer> result = stream.reduce(sum);

        if(result.isPresent())
        {
            System.out.println("Result "+result.get());
        }

        BinaryOperator<Integer> min=(a, b)->{
            System.out.println("A "+a + " B "+b);
            return a < b ? a : b;
        };

        stream = Arrays.stream(arr);
        Optional<Integer> result2 = stream.reduce((a, b)->a<b?a:b);
        if(result2.isPresent())
        {
            System.out.println("Result "+result2.get());
        }
    }
}
