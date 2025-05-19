package com.kaungmyat.javase.chapter_10_exception_handling;

public class TryCatchDemo {
    static int div(int a,int b) throws Exception
    {
        if(b==0)
        {
            throw new Exception("Invalid divisor");
        }
        return a/b;
    }
    static int another()throws Exception
    {
        try
        {
            int result = div(10,0);
            return result;
        }
        catch(Exception e)
        {
            return 10;
            //throw new Exception("Rethrow");
        }
        finally
        {
            //return 100;
            throw new Exception("Rethrow");
        }

    }
    public static void main(String[] args) {

        try {
            int result = another();
            System.out.println("Result "+result);
        } catch (Exception ex) {
            System.out.println("Exception");
            ex.printStackTrace();
        }
    }
}
