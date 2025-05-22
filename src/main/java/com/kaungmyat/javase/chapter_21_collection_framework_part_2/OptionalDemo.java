package com.kaungmyat.javase.chapter_21_collection_framework_part_2;

import java.util.Optional;

public class OptionalDemo {
    public static String toUpper(String str) {
        return str.toUpperCase();
    }

    public static String appendHi(String str) {
        return str+ " hi";
    }

    public static void main(String[] args) {

//        String data = null;
//        String result = toUpper(data);
//        result = appendHi(result);
//
//        System.out.println("Result "+result);

        String data = null;
        String result = Optional.ofNullable(data)
                .map(OptionalDemo::toUpper)
                .map(OptionalDemo::appendHi)
                .orElse("default string");

        System.out.println("Result "+result);

    }
}
