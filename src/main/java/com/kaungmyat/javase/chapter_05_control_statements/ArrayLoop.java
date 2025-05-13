package com.kaungmyat.javase.chapter_05_control_statements;

public class ArrayLoop {
    public static void main(String[] args) {
        int []arr = {10,20,30,40,50};

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Arr ["+i+"] " + arr[i]);
        }

        int[][] matrix = {
                {1,2,3},
                {4,5,6,7},
                {8,9,10,4,5,5}
        };

        for (int i = 0; i < matrix.length; i++) {
            System.out.println("Matrix [ "+i+"] " + matrix[i].length);
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println("Matrix ["+i+"]["+j+"] " + matrix[i][j]);
            }
        }
    }
}
