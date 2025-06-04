package com.kaungmyat.javase.chapter_30_stream_api;

import java.util.Optional;

public class OptionalDemo {
    static Integer findBySomethingV1(int id) {
        if(id == 0) {
            return null;
        }

        return id;
    }

    static Optional<Integer> findBySomething(int id) {
        if(id == 0) {
            return Optional.empty();
        }

        return Optional.of(id);
    }

    public static void main(String[] args) {
 /*
        Integer result= findBySomethingV1(0);
        if(result != null)
        {
            Integer result2 = findBySomethingV1(result+1);
            System.out.println("Result2 "+result2);


        }
        */
        findBySomething(0)
                .map(x->x+1)
                .map(x->x*2)
                .stream()
                .forEach(System.out::println);
    }
}
