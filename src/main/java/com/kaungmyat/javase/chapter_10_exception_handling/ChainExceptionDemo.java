package com.kaungmyat.javase.chapter_10_exception_handling;

public class ChainExceptionDemo {
    static void process()
    {
        NullPointerException ne = new NullPointerException("Custom NE");
        ne.initCause(new Exception("Another root cause"));

        throw ne;

    }
    public static void main(String[] args) {

        try
        {
            process();
        }
        catch(Exception e)
        {
            System.out.println("E.message: " + e.getMessage());
            System.out.println("E.getCause: " + e.getCause());
        }
    }
}
