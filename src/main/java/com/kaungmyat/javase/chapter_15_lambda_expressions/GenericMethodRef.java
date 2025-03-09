package com.kaungmyat.javase.chapter_15_lambda_expressions;

interface GenOp<T> {
    T getItem(T[]arr, int index);
}

public class GenericMethodRef {
    static int getInt(Integer[] arr, int index) {
        return arr[index];
    }
    static String getString(String[] arr, int index) {
        return arr[index];
    }

    public static void main(String[] args) {
        GenOp<Integer> intOp = GenericMethodRef::getInt;
        GenOp<String> strOp = GenericMethodRef::getString;

        Integer[] arr = {1,2,3};
        System.out.println("intOp "+ intOp.getItem(arr,1));

        String[] str = {"a", "b", "c"};
        System.out.println("StringOp "+ strOp.getItem(str,1));
    }
}
