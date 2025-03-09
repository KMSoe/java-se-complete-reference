package com.kaungmyat.javase.chapter_03_data_types_variables_array;

public class MultiDimensionArray {
    public static void main(String[] args) {
        int[][]matrix = {
                {1,2,3},
                {10,4,5,6,14},
                {7,8,9},
                {10,11,12},
        };
        System.out.println("Length " + matrix.length);
        System.out.println("Arr[1].length " + matrix[1].length);

        System.out.println("matrix " + matrix[3][1]);
        System.out.println("matrix " + matrix[1][2]);
        ///System.out.println("matrix "+matrix[0][3]);

        matrix[0][2] = 100;
        System.out.println("Matrix " + matrix[0][2]);
    }
}
