package com.kaungmyat.javase.chapter_03_data_types_variables_array;

public class ArrayDemo {
    public static void main(String[] args) {
        int total = 0;
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("Arr[0] " + numbers[0]);
        System.out.println("Arr[4] " + numbers[4]);
        System.out.println("Length " + numbers.length);
//        System.out.println("Arr[5] " + numbers[5]); // ArrayIndexOutOfBoundsException

        for (int i = 0; i < numbers.length; i++) {
            total += numbers[i];
        }

        System.out.println("Total: " + total);
    }
}
