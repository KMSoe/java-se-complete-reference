package com.kaungmyat.javase.chapter_10_exception_handling;

class CustomException extends RuntimeException {
    public CustomException(String message) {
        super(message);
    }
}

public class UncheckedExceptionDemo {
    static void process(int data)
    {
        if(data % 2 == 0)
        {
            throw new CustomException("Even exception");
        }
        else
        {
            System.out.println("Ok " + data);
        }
    }

    public static void main(String[] args) {
        try
        {
            process(10);
        }
        catch(Exception e)
        {
            StackTraceElement st[] =  e.getStackTrace();
            for (int i = 0; i < st.length; i++) {
                System.out.println("Clas "+st[i].getClassName()
                        +" Method "+st[i].getMethodName() +" Line "+st[i].getLineNumber());
            }
        }
    }
}
