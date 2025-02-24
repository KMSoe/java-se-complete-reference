package com.kaungmyat.javase.chapter12.wrapper;

public class NumericWrapper {
    public static void main(String[] args) {
        Integer i = Integer.valueOf(10);
        System.out.println("Byte: " + i.byteValue());
        System.out.println("Int: " + i.intValue());
        System.out.println("Long: " + i.longValue());

        i = 30;//int literal->Wrapper->autoboxing
        //Wrapper->primitive->unboxing
        System.out.println("Int value "+(i+1));
    }
}
