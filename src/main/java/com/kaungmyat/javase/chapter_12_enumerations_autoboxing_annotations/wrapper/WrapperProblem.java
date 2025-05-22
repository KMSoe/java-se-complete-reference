package com.kaungmyat.javase.chapter_12_enumerations_autoboxing_annotations.wrapper;

public class WrapperProblem {
    public static void main(String[] args) {
        Integer i = Integer.valueOf(127);
        Integer j = Integer.valueOf(127);

        System.out.println("i == j "+ (i == j));
        System.out.println("i == j "+(i.intValue() == j.intValue()));

        i = 128;
        j = 128;

        System.out.println("i == j "+(i==j));
        System.out.println("i == j "+(i.intValue() ==j.intValue()));

        i = null;
        System.out.println("i == 128 "+ (i == j));
    }
}
