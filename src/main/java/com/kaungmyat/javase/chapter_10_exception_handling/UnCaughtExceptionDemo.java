package com.kaungmyat.javase.chapter_10_exception_handling;

public class UnCaughtExceptionDemo {
    public static void main(String[] args) {
        try
        {
            int []arr = {1,2,3};
            int result = arr[3];
            System.out.println("Result " + result);
        }
        catch(ArrayIndexOutOfBoundsException ae)
        {
            System.out.println("Array Exception ");
            ae.printStackTrace();
        }
    }
}
