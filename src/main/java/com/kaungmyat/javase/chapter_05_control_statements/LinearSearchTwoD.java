package com.kaungmyat.javase.chapter_05_control_statements;

public class LinearSearchTwoD {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,},
                {4,5,6,7},
                {8,9,10}
        };
        int item = 5;

        outer:for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]== item)
                {
                    System.out.println("Found at i: "+ i + ", j: " + j);
                    break outer;
                }

                System.out.println("Loop j "+j);
            }

            System.out.println("Loop i "+i);
        }

    }
}
