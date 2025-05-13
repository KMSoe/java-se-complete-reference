package com.kaungmyat.javase.chapter_05_control_statements;

public class ForEachDemo {
    public static void main(String[] args) {

        int[]arr = {10,20,30,40,50};


        for (int i = 0; i < arr.length; i++) {

            System.out.println("Arr ["+i+"] " + arr[i]);
            arr[i] = arr[i]*2;
        }

        for(final int a : arr)//a = arr[i]
        {
            System.out.println("A " + a);
            //a = a * 2;
        }
        for(int a : arr)
        {
            System.out.println("A " + a);

        }
        final int MAX = 10;
        //MAX = 199;
    }
}
